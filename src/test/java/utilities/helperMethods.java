package utilities;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Utility class defines the utility methods that 
 * are used to assist in various page object elements manipulation
 * and aids in flexibility of automated test cases.
 */
public class helperMethods {

	public String clipString(String inputString, String indexString) {
		
		String clippedString = StringUtils.substringBefore(inputString, indexString);		
		return clippedString;
	}
	
	public int convertStringToInt(String inputText) {
		int number = Integer.parseInt(inputText);  
		return number;
		
	}
	
	public JSONArray returnJSONAsArray(String jsonInputString, String arrayElementName) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		//Parsing the contents of the JSON file
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonInputString);
		//Retrieving the array
        JSONArray jsonArray = (JSONArray) jsonObject.get(arrayElementName);
		return jsonArray;
	}
	
}
