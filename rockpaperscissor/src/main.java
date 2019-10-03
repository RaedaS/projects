import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       /*  rock = 1;
           paper = 2;
           scissors = 3; */


      //program generates a random choice from 1 to 3
        int randomNumber = (int)(Math.random()*4 +1);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (1 for rock, 2 for paper, and 3 for scissors.) ");

        //user input
        int number = input.nextInt();

        //if user chooses rock

        if (number == 1 && randomNumber == 1){
            System.out.println("It's a draw, both are rock!");

        }

        else if(number == 1 && randomNumber == 2){
            System.out.println("I chose paper. Paper beats rock! You lose!");
        }

        else if(number == 1 && randomNumber == 3){
            System.out.println("I chose scissors. Rock beats scissors! You win!");
        }

        //if user chooses paper

        else if(number == 2 && randomNumber == 1){
            System.out.println("I chose rock. Paper beats rock! You win!");

        }

        else if(number == 2 && randomNumber == 2) {
            System.out.println("It's a draw, both are paper!");
        }
        else if (number == 2 && randomNumber == 3) {
            System.out.println("I chose scissors. Scissors beats paper! You lose!");
        }

        //if user chooses scissors

        else if (number == 3 && randomNumber == 1){
            System.out.println("I chose rock. Rock beats scissors! You lose!");
        }

        else if (number == 3 && randomNumber == 2){
            System.out.println("I chose paper. Scissors beat paper. You win!");
        }

        else if (number == 3 && randomNumber == 3){
            System.out.println("It's a draw, both are scissors!");
        }

        //if user inputs an invalid number
        else {
            System.out.println("Error, please choose a number from 1-3.");
        }
    }


}
