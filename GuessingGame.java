import java.util.Scanner;
import java.lang.Math;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the guessing game.");
        System.out.println("Please put in the range of numbers to choose from:");
        //This checks that the input is an integer
        while (!scan.hasNextInt()) {
          System.out.println("Invalid input");
          scan.next();
        }
        int x = scan.nextInt();
        int y = (int)(Math.random() * x);
        int z = -20;
        System.out.println("Guess a number between 0 & " + x);
        //This is the guessing game
        for (int i = 1; z != y; i++) {
          System.out.println("Input you guess:");
          //This checks that the input is an integer
          while (!scan.hasNextInt()) {
          System.out.println("Invalid input");
          scan.next();
          }

          z = scan.nextInt();
          //This checks it's not above or below x
          while (z>x || z<0) {
          System.out.println("That number is out of bounds");
          //This checks that the input is an integer
          while (!scan.hasNextInt()) {
          System.out.println("Invalid input");
          scan.next();
          }
          z = scan.nextInt();
          }
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
