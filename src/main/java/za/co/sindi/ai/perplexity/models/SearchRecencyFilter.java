/**
 * 
 */
package za.co.sindi.ai.perplexity.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://docs.perplexity.ai/docs/model-cards">Perplexity Models</a>
 */
public enum SearchRecencyFilter {
	MONTH("month")
	,WEEK("week")
	,DAY("day")
	,HOUR("hour")
	;
	private final String value;

	/**
	 * @param value
	 */
	private SearchRecencyFilter(String value) {
		this.value = value;
	}
	
	public static SearchRecencyFilter of(final String value) {
		for (SearchRecencyFilter filter : values()) {
			if (filter.value.equals(value)) return filter;
		}
		
		throw new IllegalArgumentException("Invalid Search Recency filter value of '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
}
