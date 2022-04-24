package exercise2.main;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import exercise2.model.InfoCountriesDTO;
import exercise2.service.ReadCountryService;

public class ReadCountriesJSONMain {
	
	public static void main(String[] args) {
		
		ReadCountryService service = new ReadCountryService();
		JSONParser jsonParser = new JSONParser();
		try(FileReader reader = new FileReader("countries2.json")){
			
			Object obj = jsonParser.parse(reader);
			
			InfoCountriesDTO infoDTO = service.getInformationCountries(obj);
			printInformation1(infoDTO);
			printInformation2(infoDTO);
			printInformation3(infoDTO);
			printInformation4(infoDTO);
			
		}  catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void printInformation1(InfoCountriesDTO infoDTO) {
		System.out.println("==============================================");
		System.out.println("COUNTRIES NUMBER: "+infoDTO.getNumbersCountry());
		System.out.println("==============================================");
	}
	
	private static void printInformation2(InfoCountriesDTO infoDTO) {
		System.out.println("GERMAN SPEAKING COUNTRIES");
		System.out.println("-----------------------------");

		infoDTO.getGermanSpeakingCountries().forEach(country -> System.out.println(country));
	}
	
	private static void printInformation3(InfoCountriesDTO infoDTO) {
		System.out.println("==============================================");
		System.out.println("COUNTRIES AND NUMBER OF LANGUAGES");
		System.out.println("-----------------------------");
		
		infoDTO.getCountriesAndLanguages().forEach(info -> System.out.println(info));		
	}
	
	private static void printInformation4(InfoCountriesDTO infoDTO) {
		System.out.println("=======================================");
		System.out.println("COUNTRY WITH THE HIGHEST NUMBER  OF OFFICIAL LANGUAGES");
		System.out.println("---------------------------------------");
		
		System.out.println(infoDTO.getCountryHighestOfficialLanguage());
	}

}
