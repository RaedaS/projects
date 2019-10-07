import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[4];

        for(int i=0; i <4; i++) {
            array[i] = input.nextInt();
        }




        if((array[0] == 8 || array[0] == 9) && (array[3] == 8 || array[3] == 9) && (array[1] == array[2])){
            System.out.println("ignore");
        }
        else{
            System.out.println("answer");
        }

    }
}

//0000 (answer), 2222(answer), 9898(ignore), 8529(answer)
