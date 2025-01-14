/**
 * 
 */
package za.co.sindi.ai.perplexity.implementations;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.perplexity.models.SearchRecencyFilter;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbSearchRecencyFilterAdapter implements JsonbAdapter<SearchRecencyFilter, String> {

	@Override
	public String adaptToJson(SearchRecencyFilter format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public SearchRecencyFilter adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return SearchRecencyFilter.of(value);
	}
}
