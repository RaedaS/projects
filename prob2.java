import java.util.Scanner;

public class prob2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = input.nextInt();   //inputs the number we want to double

        System.out.println("Enter the number of times you want to double it ");
        int doubleNum = input.nextInt();    //inputs the number of times we want to double our number


        for(int i = 0; i < doubleNum; i++){
         number = number * 2;
        }   //loop to double our number the number of times we want

        System.out.println(number);
        }   //prints out the final result

        //6,3, output=48
        //6, 2, output=24
        //2,10, output=2048

}