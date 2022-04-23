package exercise1.util;

public class Util {
	
	public static final int VISUAL = 1;
	public static final int NUTS = 2;
	public static final int VISUAL_NUTS = 3;
	
	/**
	 * Method responsible for checking whether the number is divisible by 3
	 * @param parameter number
	 * @return true or false 
	 */
	public static boolean isDiv3(int number) {
		
		boolean isCorrect = false;
		if((number % 3) == 0) {
			isCorrect = true;
		}
		return isCorrect;
		
	}
	
	/**
	 * Method responsible for checking whether the number is divisible by 5
	 * @param parameter number
	 * @return true or false 
	 */
	public static boolean isDiv5(int number) {
		
		boolean isCorrect = false;
		if((number % 5) == 0) {
			isCorrect = true;
		}
		return isCorrect;
		
	}

}
