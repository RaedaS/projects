import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 7.");
        int number = input.nextInt();
        while(number != 7){
            System.out.println("Please input the number 7 only");
            number = input.nextInt();
        }


    }
}
