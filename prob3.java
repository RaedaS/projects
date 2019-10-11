import java.util.Scanner;

public class prob3{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Input your age");

       int age = input.nextInt();
       while(age < 10 || age > 50){
           System.out.println("Input your age again!");
           age = input.nextInt();

       }
    }
}