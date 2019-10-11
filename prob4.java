import java.util.Scanner;

public class prob4{
    public static void main(String[] args) {
        double sum = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many grades do you want to enter?");
        int number = input.nextInt();

        for(int i = 0; i < number; i++){
            System.out.println("Enter your grade in numbers");
            double grade = input.nextDouble();
            sum = sum + grade;
        }
        System.out.println("The sum of your grades are " + sum);
        double average = sum/number;
        System.out.println("You average grade is " + average);

    }
}

//input: 2, 90, 80
//output: 170, 85