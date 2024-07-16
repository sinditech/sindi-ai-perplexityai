/**
 * 
 */
package za.co.sindi.ai.perplexity;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import za.co.sindi.ai.perplexity.exception.PerplexityAIException;
import za.co.sindi.ai.perplexity.models.ValidationError;
import za.co.sindi.commons.net.http.WithErrorBodyHandler;
import za.co.sindi.commons.util.Either;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public abstract class AbstractPerplexityAIClient implements PerplexityAIClient {
	
	private final String apiKey;
	
	private Duration connectionTimeout;
	private ProxySelector proxy;
	private Executor executor;

	/**
	 * @param apiKey
	 */
	protected AbstractPerplexityAIClient(String apiKey) {
		super();
		this.apiKey = Objects.requireNonNull(apiKey, "A Perplexity AI API Key is required.");
	}
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy) {
		this.proxy = proxy;
	}

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	
	protected HttpRequest.Builder createHttpRequestBuilder(final PerplexityAIRequest request, final BodyPublisher bodyPublisher) {
		HttpRequest.Builder httpRequestBuilder = HttpRequest.newBuilder(request.getUri())
															.header("Authorization", "Bearer " + apiKey)
															.method(request.getMethod(), bodyPublisher == null ? BodyPublishers.noBody() : bodyPublisher);
		
		if (!Strings.isNullOrEmpty(request.getContentType())) {
			httpRequestBuilder.header("Content-Type", request.getContentType());
		}
		
		return httpRequestBuilder;
	}

	protected <R> HttpResponse<Either<R, String>> send(final HttpRequest.Builder httpRequestBuilder, final BodyHandler<R> bodyHandler) throws IOException, InterruptedException {
		HttpRequest httpRequest = httpRequestBuilder.build();
		HttpClient httpClient = createHttpClient();
		return httpClient.send(httpRequest, new WithErrorBodyHandler<R>(bodyHandler));
	}
	
	protected <R> CompletableFuture<HttpResponse<Either<R, String>>> sendAsync(final HttpRequest.Builder httpRequestBuilder, final BodyHandler<R> bodyHandler) {
		HttpRequest httpRequest = httpRequestBuilder.build();
		HttpClient httpClient = createHttpClient();
		return httpClient.sendAsync(httpRequest, new WithErrorBodyHandler<R>(bodyHandler));
	}
	
	protected <R> R validateAndHandleHttpResponse(final HttpResponse<Either<R, String>> httpResponse, final ObjectTransformer objectTransformer) {
		Either<R, String> either = httpResponse.body();
		if (either.isRightPresent()) {
			ValidationError error = objectTransformer.transform(either.getRight(), ValidationError.class);
			throw new PerplexityAIException(error);
		}
		
		return either.getLeft();
	}
	
//	protected <R> Stream<R> handleStream(final Stream<String> lines, final ObjectTransformer objectTransformer, Class<R> entityClassType) {
//		final String keyword = "data: ";
//		List<R> result = new ArrayList<>();
//		lines.forEach(line -> {
//			if (line.startsWith(keyword)) {
//				String content = line.substring(keyword.length());
//				if (content != null && !"[DONE]".equals(content)) {
//					result.add(objectTransformer.transform(content, entityClassType));
//				}
//			}
//		});
//		
//		return Collections.unmodifiableList(result).stream();
//	}
	
	private HttpClient createHttpClient() {
		HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
		if (connectionTimeout != null) {
			httpClientBuilder.connectTimeout(connectionTimeout);
		}
		
		if (proxy != null) {
			httpClientBuilder.proxy(proxy);
		}
		
		if (executor != null) {
			httpClientBuilder.executor(executor);
		}
		
		return httpClientBuilder.build();
	}
}
