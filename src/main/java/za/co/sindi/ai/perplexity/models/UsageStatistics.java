/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.perplexity.ai/reference/post_chat_completions">Perplexity AI API reference documentation.</a>
 */
public class UsageStatistics implements Serializable {

	@JsonbProperty("prompt_tokens")
	private Integer promptTokens;
	
	@JsonbProperty("completion_tokens")
	private Integer completionTokens;
	
	@JsonbProperty("total_tokens")
	private Integer totalTokens;

	/**
	 * 
	 */
	public UsageStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param completionTokens
	 * @param promptTokens
	 * @param totalTokens
	 */
	public UsageStatistics(Integer completionTokens, Integer promptTokens, Integer totalTokens) {
		super();
		this.completionTokens = completionTokens;
		this.promptTokens = promptTokens;
		this.totalTokens = totalTokens;
	}

	/**
	 * @return the completionTokens
	 */
	public Integer getCompletionTokens() {
		return completionTokens;
	}

	/**
	 * @param completionTokens the completionTokens to set
	 */
	public void setCompletionTokens(Integer completionTokens) {
		this.completionTokens = completionTokens;
	}

	/**
	 * @return the promptTokens
	 */
	public Integer getPromptTokens() {
		return promptTokens;
	}

	/**
	 * @param promptTokens the promptTokens to set
	 */
	public void setPromptTokens(Integer promptTokens) {
		this.promptTokens = promptTokens;
	}

	/**
	 * @return the totalTokens
	 */
	public Integer getTotalTokens() {
		return totalTokens;
	}

	/**
	 * @param totalTokens the totalTokens to set
	 */
	public void setTotalTokens(Integer totalTokens) {
		this.totalTokens = totalTokens;
	}
}
