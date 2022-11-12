package Day3_10082022;

public class ReusableClass {
    //create a void method that will add two numbers and execute the print statement
    public static void addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("The result is " + result);
    }//end of addTwoNumbers

    //create a return method that will add two numbers and return the result from the print statement
    public static int returnTwoAddNumbers(int a, int b){
        int result = a+b;
        System.out.println("The return result is " + result);
        return result;
    }//end of returnTwoAddNumbers

}
