/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.perplexity.ai/reference/post_chat_completions">Perplexity AI API reference documentation.</a>
 */
public class ChatConversation implements Serializable {
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private List<ChatMessage> messages;

	@JsonbProperty("max_tokens")
	private Integer maxTokens;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Integer topP;
	
	@JsonbProperty("return_citations")
	private Boolean returnCitations;
	
	@JsonbProperty("return_images")
	private Boolean returnImages;
	
	@JsonbProperty("top_k")
	private Integer topK;
	
	@JsonbProperty
	private Boolean stream;
	
	@JsonbProperty("presence_penalty")
	private Double presencePenalty;
	
	@JsonbProperty("frequency_penalty")
	private Double frequencyPenalty;
	
	@JsonbProperty("return_related_questions")
	private Boolean returnRelatedQuestions;
	
	@JsonbProperty("search_domain_filter")
	private String[] searchDomainFilter;
	
	@JsonbProperty("search_recency_filter")
	private SearchRecencyFilter searchRecencyFilter;
	
	@JsonbProperty("response_format")
	private Object responseFormat;
	
	@JsonbProperty("web_search_options")
	private WebSearchOptions webSearchOptions;

	/**
	 * @param messages
	 * @param model
	 */
	public ChatConversation(List<ChatMessage> messages, String model) {
		super();
		this.messages = Objects.requireNonNull(messages);
		this.model = Objects.requireNonNull(model);
	}

	/**
	 * @return the maxTokens
	 */
	public Integer getMaxTokens() {
		return maxTokens;
	}

	/**
	 * @param maxTokens the maxTokens to set
	 */
	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Integer getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Integer topP) {
		this.topP = topP;
	}

	/**
	 * @return the returnCitations
	 */
	public Boolean getReturnCitations() {
		return returnCitations;
	}

	/**
	 * @param returnCitations the returnCitations to set
	 */
	public void setReturnCitations(Boolean returnCitations) {
		this.returnCitations = returnCitations;
	}

	/**
	 * @return the returnImages
	 */
	public Boolean getReturnImages() {
		return returnImages;
	}

	/**
	 * @param returnImages the returnImages to set
	 */
	public void setReturnImages(Boolean returnImages) {
		this.returnImages = returnImages;
	}

	/**
	 * @return the topK
	 */
	public Integer getTopK() {
		return topK;
	}

	/**
	 * @param topK the topK to set
	 */
	public void setTopK(Integer topK) {
		this.topK = topK;
	}

	/**
	 * @return the stream
	 */
	public Boolean getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(Boolean stream) {
		this.stream = stream;
	}

	/**
	 * @return the presencePenalty
	 */
	public Double getPresencePenalty() {
		return presencePenalty;
	}

	/**
	 * @param presencePenalty the presencePenalty to set
	 */
	public void setPresencePenalty(Double presencePenalty) {
		this.presencePenalty = presencePenalty;
	}

	/**
	 * @return the frequencyPenalty
	 */
	public Double getFrequencyPenalty() {
		return frequencyPenalty;
	}

	/**
	 * @param frequencyPenalty the frequencyPenalty to set
	 */
	public void setFrequencyPenalty(Double frequencyPenalty) {
		this.frequencyPenalty = frequencyPenalty;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the messages
	 */
	public List<ChatMessage> getMessages() {
		return messages;
	}

	/**
	 * @return the returnRelatedQuestions
	 */
	public Boolean getReturnRelatedQuestions() {
		return returnRelatedQuestions;
	}

	/**
	 * @param returnRelatedQuestions the returnRelatedQuestions to set
	 */
	public void setReturnRelatedQuestions(Boolean returnRelatedQuestions) {
		this.returnRelatedQuestions = returnRelatedQuestions;
	}

	/**
	 * @return the searchDomainFilter
	 */
	public String[] getSearchDomainFilter() {
		return searchDomainFilter;
	}

	/**
	 * @param searchDomainFilter the searchDomainFilter to set
	 */
	public void setSearchDomainFilter(String[] searchDomainFilter) {
		this.searchDomainFilter = searchDomainFilter;
	}

	/**
	 * @return the searchRecencyFilter
	 */
	public SearchRecencyFilter getSearchRecencyFilter() {
		return searchRecencyFilter;
	}

	/**
	 * @param searchRecencyFilter the searchRecencyFilter to set
	 */
	public void setSearchRecencyFilter(SearchRecencyFilter searchRecencyFilter) {
		this.searchRecencyFilter = searchRecencyFilter;
	}

	/**
	 * @return the responseFormat
	 */
	public Object getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(Object responseFormat) {
		this.responseFormat = responseFormat;
	}

	/**
	 * @return the webSearchOptions
	 */
	public WebSearchOptions getWebSearchOptions() {
		return webSearchOptions;
	}

	/**
	 * @param webSearchOptions the webSearchOptions to set
	 */
	public void setWebSearchOptions(WebSearchOptions webSearchOptions) {
		this.webSearchOptions = webSearchOptions;
	}
}
