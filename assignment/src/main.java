public class main {

    //quadratic equation method
    public static void main(String[] args) {
        //input your coefficients
        double a = 1;
        double b = 5;
        double c = 6;
        double constant = 0;
        c = c - constant;

        //initialization
        double answer1;
        double answer2;
        double squareRoot1;
        double squareRoot2;
        squareRoot1 = Math.sqrt((b*b) - (4*a*c));
        answer1 = (-(b)) + squareRoot1;
        answer1 = answer1 / (2*a);

        //rounding to 2 dp
        answer1 = Math.round(answer1 * 100);
        answer1 = answer1 / 100;

        System.out.println("x1 = " + answer1);

        squareRoot2 = Math.sqrt((b*b) - (4*a*c));
        answer2 = (-(b)) - squareRoot2 ;
        answer2 = answer2 / (2*a);

        //rounding to 2 dp
        answer2 = Math.round(answer2 * 100);
        answer2 = answer2 / 100;

    }

    //linear equation method
    public static void linear(String[] args) {
        int a = 3;
        int b = -3;
        int c = 3;

        double answer;

        answer = c - b;
        answer = answer / a;

        System.out.println("x = " + answer);
    }
}
