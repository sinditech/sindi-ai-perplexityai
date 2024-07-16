/**
 * 
 */
package za.co.sindi.ai.perplexity.exception;

import za.co.sindi.ai.perplexity.models.ValidationError;

/**
 * @author Buhake Sindi
 * @since 26 January 2024
 */
public class PerplexityAIException extends RuntimeException {

	private ValidationError error;

	/**
	 * @param error
	 */
	public PerplexityAIException(ValidationError error) {
		super(error.getDetail().getMessage());
		this.error = error;
	}

	/**
	 * @return the error
	 */
	public ValidationError getError() {
		return error;
	}
}
