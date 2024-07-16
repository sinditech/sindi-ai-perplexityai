/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 January 2024
 * @see <a href="https://docs.perplexity.ai/reference/post_chat_completions">Error codes</a>
 */
public class ValidationError implements Serializable {

	@JsonbProperty
	private ValidationDetail detail;

	/**
	 * @return the detail
	 */
	public ValidationDetail getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(ValidationDetail detail) {
		this.detail = detail;
	}
}
