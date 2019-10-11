import java.util.Scanner;

public class prob5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pass = input.next(); //inputs password

        System.out.println("Re-enter your password and confirm it: ");
        String confirmPass = input.next(); //inputs password again

        while(!pass.equals(confirmPass)){
            System.out.println("Passwords don't match. Please re-enter");
            confirmPass = input.next();
        }   //checks if confirmed password matches password
        System.out.println("Passwords match!");
    }
}

//cat, dog, sheep, tree, cat