import java.util.Scanner;

public class Temperature {
	
	public static void main(String[] args) {
		//conversions
		final double CELCIUS_PER_FAHRENHEIT = 9.0 / 5.0;
		
		//instantiate
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many celcius? ");
		double userInput = in.nextDouble();
		double celcius = userInput * CELCIUS_PER_FAHRENHEIT + 32;
		
		System.out.print(celcius);
		
		
	}
}
