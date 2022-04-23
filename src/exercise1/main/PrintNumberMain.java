package exercise1.main;

import java.util.Scanner;
import java.util.stream.IntStream;

import exercise1.service.PrintNumberService;

public class PrintNumberMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		
		PrintNumberService service = new PrintNumberService();
		try {
			Integer number = Integer.parseInt(in.nextLine());
			if(number > 1) {
				IntStream.rangeClosed(1, number).forEach(i -> {System.out.println("Number " +i+ " = " +service.assignResponseValue(i));});
			}else {
				System.out.println("The number must be positive and greater than 1!");
			}
		} catch (Exception e) {
			System.out.println("This is not a number!");
		}
	}
}