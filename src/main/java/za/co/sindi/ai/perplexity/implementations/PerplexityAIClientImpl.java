/**
 * 
 */
package za.co.sindi.ai.perplexity.implementations;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.perplexity.AbstractPerplexityAIClient;
import za.co.sindi.ai.perplexity.ObjectTransformer;
import za.co.sindi.ai.perplexity.chat.ChatCompletionRequest;
import za.co.sindi.ai.perplexity.models.ChatCompletion;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class PerplexityAIClientImpl extends AbstractPerplexityAIClient {
	
	private ObjectTransformer transformer = new JSONObjectTransformer();

	/**
	 * @param apiKey
	 */
	public PerplexityAIClientImpl(String apiKey) {
		super(apiKey);
	}

	@Override
	public ChatCompletion send(ChatCompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class);
	}

	@Override
	public CompletableFuture<ChatCompletion> sendAsync(ChatCompletionRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class)).toCompletableFuture();
	}
}
