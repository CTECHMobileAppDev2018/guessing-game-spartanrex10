import java.util.Scanner;
import java.lang.Math;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the guessing game.");
        System.out.println("Please put in the range of numbers to choose from:");
        int x = scan.nextInt();
        int y = (int)(Math.random() * x);
        int z = -20;
        System.out.println("Guess a number between 0 & " + x);
        //This is the guessing game
        for (int i = 1; z != y; i++) {
          System.out.println("Input you guess:");
          z = scan.nextInt();
          if (z>y) {
            System.out.println("You're too high.");
          }
          if (z<y) {
            System.out.println("You're too low.");
          }
          if (z == y) {
            System.out.println("You got it right! You guessed: " + i + " times.");
          }
        }
        scan.close();
    }
}
