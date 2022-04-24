package exercise2.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InfoCountriesDTO {
	
	private Integer numbersCountry;
	private List<String> germanSpeakingCountries;
	private List<String> countriesAndLanguages;
	private String countryHighestOfficialLanguage;

}
