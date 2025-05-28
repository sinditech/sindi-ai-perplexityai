/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.perplexity.ai/docs/model-cards">Perplexity Models</a>
 */
public enum PerplexityModelName {
	SONAR_DEEP_RESEARCH("sonar_deep_research"),
	SONAR_REASONING_PRO("sonar_reasoning_pro"),
	SONAR_REASONING("sonar_reasoning"),
	SONAR_PRO("sonar_pro"),
	SONAR("sonar"),
	R1_1776("r1-1776"),
	
//	@Deprecated
//	LLAMA_3_1_SONAR_SMALL_128K_ONLINE("llama-3.1-sonar-small-128k-online"),
//	@Deprecated
//	LLAMA_3_1_SONAR_LARGE_128K_ONLINE("llama-3.1-sonar-large-128k-online"),
//	@Deprecated
//	LLAMA_3_1_SONAR_HUGE_128K_ONLINE("llama-3.1-sonar-huge-128k-online"),
//	
//	@Deprecated
//	LLAMA_3_SONAR_SMALL_32K_ONLINE("llama-3-sonar-small-32k-online"),
//	@Deprecated
//	LLAMA_3_SONAR_SMALL_32K_CHAT("llama-3-sonar-small-32k-chat"),
//	@Deprecated
//	LLAMA_3_SONAR_LARGE_32K_ONLINE("llama-3-sonar-large-32k-online"),
//	@Deprecated
//	LLAMA_3_SONAR_LARGE_32K_CHAT("llama-3-sonar-large-32k-chat"),
//	
//	@Deprecated
//	LLAMA_3_8B_INSTRUCT("llama-3-8b-instruct"),
//	
//	@Deprecated
//	LLAMA_3_70B_INSTRUCT("llama-3-70b-instruct"),
//	
//	@Deprecated
//	MIXSTRAL_8X7B_INSTRUCT("mixtral-8x7b-instruct"),
	;
	private final String model;

	/**
	 * @param model
	 */
	private PerplexityModelName(String model) {
		this.model = model;
	}
	
	public static PerplexityModelName getLatest() {
		return SONAR;
	}
	
	public static PerplexityModelName of(final String value) {
		for (PerplexityModelName model : values()) {
			if (model.model.equals(value)) return model;
		}
		
		throw new IllegalArgumentException("Invalid Perplexity AI model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
