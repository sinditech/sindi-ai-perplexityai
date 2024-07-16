/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.perplexity.ai/reference/post_chat_completions">Perplexity AI API reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "role",
	value = {
	    @JsonbSubtype(alias="system", type=ChatSystemMessage.class),
	    @JsonbSubtype(alias="user", type=ChatUserMessage.class),
	    @JsonbSubtype(alias="assistant", type=ChatAssistantMessage.class),
	}
)
public abstract class ChatMessage implements Serializable {
	
	@JsonbProperty
	private String content;

	/**
	 * 
	 */
	protected ChatMessage() {
		super();
		//TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	protected ChatMessage(String content) {
		super();
		this.content = content;
	}
	
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}
