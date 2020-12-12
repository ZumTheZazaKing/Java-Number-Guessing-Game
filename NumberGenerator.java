import java.util.Random;
import java.util.Scanner;

public class NumberGenerator{

    int randomNumber;
    int userGuess;

    NumberGenerator(){

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Number Guessing Game");

    }

    void generateRandomNumber(){

        Random random = new Random();

        randomNumber = random.nextInt(100);

    }

    void showMenu(){

        Scanner scanner = new Scanner(System.in);

        generateRandomNumber();

        System.out.println("-------------------------------------------------------------");
        System.out.print("Enter a number between 1 to 100: ");
        userGuess = scanner.nextInt();


        while (1 != 0){

            if (userGuess < randomNumber){

                System.out.println("-------------------------------------------------------------");
                System.out.println("Your guess was low. Try again");
                System.out.println("-------------------------------------------------------------");

                System.out.print("Enter a number between 1 to 100: ");
                userGuess = scanner.nextInt();

            } else if (userGuess > randomNumber){

                System.out.println("-------------------------------------------------------------");
                System.out.println("Your guess was high. Try again");
                System.out.println("-------------------------------------------------------------");

                System.out.print("Enter a number between 1 to 100: ");
                userGuess = scanner.nextInt();

            } else if (userGuess == randomNumber) {

                System.out.println("-------------------------------------------------------------");
                System.out.println("Congratulations! You guessed it! It was " + randomNumber);
                System.out.println("-------------------------------------------------------------");

                break;

            }

        }

        System.out.print("Would you like to play again? (Y/N): ");

        String userAnswer = scanner.next();

        switch (userAnswer){

            case "Y":

            showMenu();

            case "N":
            
            System.out.println("\nGoodbye!\n");

            System.exit(0);

            default:

            System.out.println("That's not an option. You're getting kicked for that");

            System.exit(0);

        }

    }

}