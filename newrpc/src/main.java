import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       /*  rock = 1;
           paper = 2;
           scissors = 3; */


        //program generates a random choice from 1 to 3


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character, r for rock, p for paper, s for scissors. Choose x to exit");

        //user input

        int wins = 0;
        int losses = 0;


        for(int i = 1; i>0; i++){
            String playerChoice = input.next();
            int randomNumber = (int)(Math.random()*3 +1);
            System.out.println(randomNumber);

            if (playerChoice.equals("r") && randomNumber == 1){
                System.out.println("It's a draw, both are rock!");
                System.out.println("Wins: " + wins + "  Losses: " + losses);

            }

            else if(playerChoice.equals("r") && randomNumber == 2){
                System.out.println("I chose paper. Paper beats rock! You lose!");
                losses++;
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }

            else if(playerChoice.equals("r") && randomNumber == 3){
                System.out.println("I chose scissors. Rock beats scissors! You win!");
                wins++;
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }

            //if user chooses paper

            else if(playerChoice.equals("p") && randomNumber == 1){
                System.out.println("I chose rock. Paper beats rock! You win!");
                wins++;
                System.out.println("Wins: " + wins + "  Losses: " + losses);

            }

            else if(playerChoice.equals("p") && randomNumber == 2) {
                System.out.println("It's a draw, both are paper!");
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }
            else if (playerChoice.equals("p") && randomNumber == 3) {
                System.out.println("I chose scissors. Scissors beats paper! You lose!");
                losses++;
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }

            //if user chooses scissors

            else if (playerChoice.equals("s") && randomNumber == 1){
                System.out.println("I chose rock. Rock beats scissors! You lose!");
                losses++;
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }

            else if (playerChoice.equals("s") && randomNumber == 2){
                System.out.println("I chose paper. Scissors beat paper. You win!");
                wins++;
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }

            else if (playerChoice.equals("s") && randomNumber == 3){
                System.out.println("It's a draw, both are scissors!");
                System.out.println("Wins: " + wins + "  Losses: " + losses);
            }
            else if (playerChoice.equals("x")){
                System.out.println("Wins: " + wins + "  Losses: " + losses);
                break;
            }

            //if user inputs an invalid letter
            else {
                System.out.println("Error, please choose a letter from r, s or p");
                i = i-1;
            }
            System.out.println("Enter a character, r for rock, p for paper, s for scissors. ");


        }



    }
}
