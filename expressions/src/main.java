public class main {
    public static void main(String[] args) {
        //expression 1
        System.out.println((9 - 4)+ 10/2 - (4 - 8)/3);
        System.out.println(5+5+(4/3));
        System.out.println(10+4/3);
        System.out.println(11);

        //expression 2
        System.out.println(23%4 + (18 - 3 / 2.0)); //added decimal because program otherwise round the value to 20
        System.out.println(23%4 + (18 - 1.5));
        System.out.println(3+16.5);
        System.out.println(19.5);

        //expression 3
        System.out.println(((8 - 5) + Math.pow(3,4)/5));
        System.out.println(3 + (16.2));
        System.out.println(19.2);

        //expression 4
        System.out.println((9 % 4) - 8 + Math.pow(2,3) / 8 + (Math.sqrt(81) / 3));
        System.out.println(1 - 8 + 8 / 8 + 9/3);
        System.out.println(1-8+1+3);
        System.out.println(-3);

        //expression 5
        System.out.println(((14 / 2 + 3) * Math.sin(45) + 2) - Math.pow(Math.sqrt(25), 3));
        System.out.println(((7+3)*Math.sin(45)+2) - 125);
        System.out.println(((10)*Math.sin(45)+2)- 125);
        System.out.println(-114.49096475465882);
    }
}
