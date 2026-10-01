import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {
        //pick a random number
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        //message
        System.out.print("I'm thinking of a number between 1 and 100 (including both). \nCan you guess what it is? ");
        System.out.print("\nType in a number! ");
        
        int number = random.nextInt(100) + 1;
        int guess = in.nextInt();
        
        //output
        System.out.print("\nYour guess is: " + guess);
        System.out.print("\nThe number I was thinking of is: " + number);
        System.out.println("\nYou were off by: " + (number - guess));
    }
}
