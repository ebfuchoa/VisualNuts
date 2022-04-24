package exercise2.mock;

import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@Deprecated
public class JSONMock {

	public static void main(String[] args) {
		
		JSONObject country = new JSONObject();
		country.put("country", "US");
		
		JSONArray languages = new JSONArray();
		languages.add("en");
		country.put("languages", languages);
		
		
		// Next country
		JSONObject country2 = new JSONObject();
		country2.put("country", "BE");
		
		JSONArray languages2 = new JSONArray();
		languages2.add("nl");
		languages2.add("fr");
		languages2.add("de");
		country2.put("languages", languages2);
		
		// Next country
		JSONObject country3 = new JSONObject();
		country3.put("country", "NL");
		
		JSONArray languages3 = new JSONArray();
		languages3.add("nl");
		languages3.add("fy");
		country3.put("languages", languages3);
		
		// Next country
		JSONObject country4 = new JSONObject();
		country4.put("country", "DE");
		
		JSONArray languages4 = new JSONArray();
		languages4.add("de");
		country4.put("languages", languages4);
		
		// Next country
		JSONObject country5 = new JSONObject();
		country5.put("country", "ES");
		
		JSONArray languages5 = new JSONArray();
		languages5.add("es");
		country5.put("languages", languages5);
		
		// Next country
		JSONObject country6 = new JSONObject();
		country6.put("country", "ES");
		
		JSONArray languages6 = new JSONArray();
		languages6.add("pt");
		country6.put("languages", languages6);
		
		JSONArray countriesList = new JSONArray();
		countriesList.add(country);
		countriesList.add(country2);
		countriesList.add(country3);
		countriesList.add(country4);
		countriesList.add(country5);
		countriesList.add(country6);
		
		try(FileWriter fileJSON = new FileWriter("countries.json")){
			fileJSON.write(countriesList.toJSONString());
			fileJSON.flush();
		}catch (Exception e) {
			Logger.getLogger(JSONMock.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
