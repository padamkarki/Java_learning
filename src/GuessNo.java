
import java.util.Random;
import java.util.Scanner;


class GuessNumbers{
        private int randomNumber;
        private int userInput;
        private int noOfGusses;

    public GuessNumbers(){
        Random random =  new Random();
        randomNumber = random.nextInt(100);
        noOfGusses = 0;

    }

    public void takeUserInput() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your guessed number between 0 and 100 (or -1 to quit): ");
            userInput = input.nextInt();
            noOfGusses++;

            if (userInput == -1) {
                System.out.println("You quit the game.");
                break; // Exit the loop if the user quits.
            }else if (userInput == randomNumber) {
                System.out.println("YAAAY!, you are correct");
                System.out.println("It took you " + noOfGusses + " guesses to find the number.");
                break; // Exit the loop if the user guesses correctly.
            }

            isCorrectNumber(); // Call the isCorrectNumber method for each guess.

        }
        input.close();
    }

    public void isCorrectNumber(){
        if(userInput == randomNumber){
            System.out.println("YAAAY!, you are correct");
            System.out.println("It took you " + noOfGusses + " guesses to find the number.");
        }else if(userInput>randomNumber){
            System.out.println("oops, your guess is higher than the number, try again");

        }else{
            System.out.println("oops, your guess is lower than the number, try again");

        }
    }

    public int getNoOfGusses(){
        return noOfGusses;
    }

    public int getUserInput(){
        return userInput;
    }
    public int getRandomInput(){
        return randomNumber;
    }
}


public class GuessNo {
    public static void main(String[] args) {
        GuessNumbers game = new GuessNumbers();
        game.takeUserInput();
    }
}
