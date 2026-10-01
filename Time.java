import java.util.Scanner;

public class Time {
	
	public static void main(String[] args) {
		//conversions
		final int SECONDS_PER_HOUR = 3600;
		final int SECONDS_PER_MINUTE = 60;
		
		//instantiate
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many seconds? ");
		int userInput = in.nextInt();
		
		int remainder = userInput % SECONDS_PER_HOUR;
		int hour = userInput / SECONDS_PER_HOUR;
		int minutes = remainder / SECONDS_PER_MINUTE;
		int seconds = remainder % SECONDS_PER_MINUTE;
		
		//output
		System.out.printf("%d hour, %d minutes, %d seconds \n",
						  hour, minutes, seconds);
		
		
	}
}
