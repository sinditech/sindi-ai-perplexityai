/**
 * 
 */
package za.co.sindi.ai.perplexity;

import java.io.IOException;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

import za.co.sindi.ai.perplexity.chat.ChatCompletionRequest;
import za.co.sindi.ai.perplexity.models.ChatCompletion;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 */
public interface PerplexityAIClient {
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout);

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy);

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor);
	
	// ------------------- Chat -------------------
	public ChatCompletion send(final ChatCompletionRequest request) throws IOException, InterruptedException;
	public CompletableFuture<ChatCompletion> sendAsync(final ChatCompletionRequest request);
}

