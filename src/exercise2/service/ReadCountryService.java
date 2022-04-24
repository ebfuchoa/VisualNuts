package exercise2.service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import exercise2.model.InfoCountriesDTO;

public class ReadCountryService {
	
	public InfoCountriesDTO getInformationCountries(Object obj) {
		
		InfoCountriesDTO dto = new InfoCountriesDTO();
		dto.setNumbersCountry(getNumbersCountry(obj));
		dto.setCountryHighestOfficialLanguage(getCountryHighestOfficialLanguage(obj));
		dto.setCountriesAndLanguages(getCountriesAndLanguages(obj));
		dto.setGermanSpeakingCountries(getGermanSpeakingCountries(obj));
		
		return dto;
		
	}
	
	private Integer getNumbersCountry(Object obj) {
		JSONArray countriesList = (JSONArray) obj;
		return countriesList.size();
	}
	
	private String getCountryHighestOfficialLanguage(Object obj) {
		
		JSONArray countriesList = (JSONArray) obj;

		String countryFound = " -- ";
		int qtdeLinguas = 0;
		for (Object object : countriesList) {

			JSONObject countries = (JSONObject) object;
			String country = (String) countries.get("country");
			JSONArray languagesList = (JSONArray) countries.get("languages");
			
			int qtdIdiomas = languagesList.size();
			
			if(qtdeLinguas == 0) {
				countryFound = country;
				qtdeLinguas = qtdIdiomas;
			}else if(qtdIdiomas > qtdeLinguas) {
				countryFound = country;
				qtdeLinguas = qtdIdiomas;
			}
		}
		
		return "Country: "+countryFound+ " - Number of languages: "+ qtdeLinguas;
	}

	private List<String> getCountriesAndLanguages(Object obj) {
		
		JSONArray countriesList = (JSONArray) obj;
		List<String> countriesAndLanguages = new ArrayList<String>();
		for (Object object : countriesList) {

			JSONObject countries = (JSONObject) object;
			String country = (String) countries.get("country");
			JSONArray languagesList = (JSONArray) countries.get("languages");
			
			countriesAndLanguages.add("Country: "+country+ " - languages: "+languagesList.size());
		}
		return countriesAndLanguages;
	}

	private List<String> getGermanSpeakingCountries(Object obj) {
		
		JSONArray countriesList = (JSONArray) obj;
		List<String> GermanSpeaker = new ArrayList<String>();
		for (Object object : countriesList) {

			JSONObject countries = (JSONObject) object;
			String country = (String) countries.get("country");
			JSONArray languagesList = (JSONArray) countries.get("languages");
			
			for (Object language : languagesList) {
				if ("German".equals(language)) {
					if (!GermanSpeaker.contains(country)) {
						GermanSpeaker.add(country);
					}

				}
			}

		}
		
		if(GermanSpeaker.isEmpty())
			GermanSpeaker.add("There is no country that speaks the german language");
		
		return GermanSpeaker;
	}
}
