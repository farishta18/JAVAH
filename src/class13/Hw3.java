package class13;

public class Hw3 {
    public static void main(String[] args) {
        /*
        How would you swap  2 strings without a temporary variable?
         */

       String a="15";
       String b="10";

        System.out.println("before a was "+a);
        System.out.println("before b was "+b);

       a=a+b;
       b = a.substring(0,a.length()-b.length());
       a=a.substring(b.length());

        System.out.println("Now a is "+a);
        System.out.println("Now b is "+b);
    }
}
