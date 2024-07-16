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
public class ChatChoice implements Serializable {

	@JsonbProperty
	private Integer index;

	@JsonbProperty("finish_reason")
	private String finishReason;
	
	@JsonbProperty
	private ChatMessage message;
	
	@JsonbProperty
	private ChatMessage delta;
	
	/**
	 * 
	 */
	public ChatChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return the finishReason
	 */
	public String getFinishReason() {
		return finishReason;
	}

	/**
	 * @param finishReason the finishReason to set
	 */
	public void setFinishReason(String finishReason) {
		this.finishReason = finishReason;
	}

	/**
	 * @return the message
	 */
	public ChatMessage getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(ChatMessage message) {
		this.message = message;
	}

	/**
	 * @return the delta
	 */
	public ChatMessage getDelta() {
		return delta;
	}

	/**
	 * @param delta the delta to set
	 */
	public void setDelta(ChatMessage delta) {
		this.delta = delta;
	}
}
