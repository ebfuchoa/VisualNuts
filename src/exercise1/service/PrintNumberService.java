package exercise1.service;

import exercise1.util.Util;
import exercise1.util.VNEnum;

public class PrintNumberService {
	
	/**
	 * Method responsible for assigning the result of the value for display
	 * 
	 * @param parameter number
	 * @return "Visual" for numbers divisible by 3; "Nuts" for numbers divisible by 5; 
	 * "Visual Nuts" for numbers divisible by 3 and 5; and the number itself when all results are false.
	 */
	public String assignResponseValue(Integer number) {
		
		String value = "";
		if (number != null) {
			boolean isVisual = Util.isDiv3(number);
			boolean isNuts = Util.isDiv5(number);

			if (isVisual && isNuts) {
				value = VNEnum.getDescription(Util.VISUAL_NUTS).getDescription();
			} else if (isVisual) {
				value = VNEnum.getDescription(Util.VISUAL).getDescription();
			} else if (isNuts) {
				value = VNEnum.getDescription(Util.NUTS).getDescription();
			} else {
				value = String.valueOf(number);
			}
		}
		
		return value;
	}

}
