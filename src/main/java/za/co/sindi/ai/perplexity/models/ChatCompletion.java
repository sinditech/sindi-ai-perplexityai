/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

import java.io.Serializable;
import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.perplexity.ai/reference/post_chat_completions">Perplexity AI API reference documentation.</a>
 */
public class ChatCompletion implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private long created;
	
	@JsonbProperty
	private List<ChatChoice> choices;	
	
	@JsonbProperty
	private UsageStatistics usage;
	
	@JsonbProperty
	private String[] citations;

	/**
	 * 
	 */
	public ChatCompletion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param choices
	 * @param created
	 * @param model
	 * @param object
	 * @param usage
	 */
	public ChatCompletion(String id, List<ChatChoice> choices, long created, String model, String systemFingerprint,
			String object, UsageStatistics usage) {
		super();
		this.id = id;
		this.choices = choices;
		this.created = created;
		this.model = model;
		this.object = object;
		this.usage = usage;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the choices
	 */
	public List<ChatChoice> getChoices() {
		return choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(List<ChatChoice> choices) {
		this.choices = choices;
	}

	/**
	 * @return the created
	 */
	public long getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(long created) {
		this.created = created;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * @return the usage
	 */
	public UsageStatistics getUsage() {
		return usage;
	}

	/**
	 * @param usage the usage to set
	 */
	public void setUsage(UsageStatistics usage) {
		this.usage = usage;
	}

	/**
	 * @return the citations
	 */
	public String[] getCitations() {
		return citations;
	}

	/**
	 * @param citations the citations to set
	 */
	public void setCitations(String[] citations) {
		this.citations = citations;
	}
}
