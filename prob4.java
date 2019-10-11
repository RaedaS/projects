import java.util.Scanner;

public class prob4{
    public static void main(String[] args) {
        double sum = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many grades do you want to enter?");
        int number = input.nextInt();   //inputs the number of grades

        for(int i = 0; i < number; i++){
            System.out.println("Enter your grade in numbers");
            double grade = input.nextDouble();
            sum = sum + grade;  //calculates the sum of all grades entered
        }
        System.out.println("The sum of your grades are " + sum);
        double average = sum/number;    //calculates the average grade
        System.out.println("You average grade is " + average);

    }
}
