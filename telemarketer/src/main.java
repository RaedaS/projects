import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[4];

        for(int i=0; i <4; i++) {
            array[i] = input.nextInt();
        }


        if(array[0] == 8 || array[0] == 9){
            System.out.println("ignore");
        }
        else if(array[3] == 8 || array[3] == 9){
            System.out.println("ignore");
        }

        else if(array[1] == array[2]){
            System.out.println("ignore");
        }

        else{
            System.out.println("answer");
        }

    }
}
