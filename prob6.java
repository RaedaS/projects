import java.util.Scanner;

public class prob6{
    public static void main(String[] args) {
        int count = 0;  //initializing the variable for counting the factors
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number for the range ");

        int num1 = input.nextInt(); //inputs the first number for the range

        System.out.println("Enter the second number for the range");
        int num2 = input.nextInt(); //inputs the second number for the range

        for(int i = num1; i < num2; i++){
            //if the number is a factor, counts it, and prints that it is a factor
            if(num1 % 7 == 0){
                count = count + 1;
                System.out.println(num1 + " is a factor");
                num1 = num1+1;

            }
            //if the number isn't a factor, program will skip over it
            else if(num1%7 != 0){
                num1 = num1+1;
            }

        }
        System.out.println("There are " + count + " factors.");
    
    }
}