package Day3_10082022;

public class T2_Multiple_Conditions {
    public static void main(String[] args) {
        //declare three int variables
        int a, b, c;

        a = 2;
        b = 2;
        c = 4;

        //write a multiple conditional statements that covers when a+b < c, a+b > c or a+b = c
        if (a + b < c) {
            System.out.println("a & b is less tha c");
        } else if (a + b > c) {
            System.out.println("a & b is greater than c");
        } else {
            System.out.println("a & b is equal to c");
        }//end of conditions
    }//end of main
}//end of java class
