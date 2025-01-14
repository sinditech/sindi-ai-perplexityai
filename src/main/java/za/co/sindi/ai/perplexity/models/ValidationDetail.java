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
public class ValidationDetail implements Serializable {

	@JsonbProperty
	private String[] loc;
	
	@JsonbProperty("msg")
	private String message;
	
	@JsonbProperty
	private String type;

	/**
	 * @return the loc
	 */
	public String[] getLoc() {
		return loc;
	}

	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String[] loc) {
		this.loc = loc;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
