import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       /*  rock = 1;
           paper = 2;
           scissors = 3; */

        int randomNumber = (int)(Math.random()*4 +1);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (1 for rock, 2 for paper, and 3 for scissors.) ");
        int number = input.nextInt();

        if (number == 1 && randomNumber == 1){
            System.out.println("It's a draw, both are rock!");

        }

        else if(number == 1 && randomNumber == 2){
            System.out.println("I chose paper. Paper beats rock! You lose!");
        }

        else if(number == 1 && randomNumber == 3){
            System.out.println("I chose scissors. Rock beats scissors! You win!");
        }

        else if(number == 2 && randomNumber == 1){
            System.out.println("I chose rock. Paper beats rock! You win!");

        }

        else if(number == 2 && randomNumber == 2) {
            System.out.println("It's a draw, both are paper!");
        }
        else if (number == 2 && randomNumber == 3) {
            System.out.println("I chose scissors. Scissors beats paper! You lose!");
        }

        else if (number == 3 && randomNumber == 1){
            System.out.println("I chose rock. Rock beats scissors! You lose!");
        }

        else if (number == 3 && randomNumber == 2){
            System.out.println("I chose paper. Scissors beat paper. You win!");
        }

        else{
            System.out.println("It's a draw, both are scissors!");
        }
    }


}
