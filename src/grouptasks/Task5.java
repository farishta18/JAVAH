package grouptasks;

public class Task5 {
    public static void main(String[] args) {
        /*
        5. Write a program to swap 2 numbers without a temporary variable?
         */

        int num1=30;
        int num2=55;

        num1=num2;
        num2=num2-num1;

        System.out.println("num1 is "+num1);
        System.out.println("num2 is "+num2);
    }
}
