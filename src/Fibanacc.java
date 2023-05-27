public class Fibanacc {
  /*  Write a Java Program to print the first 10 numbers
    of Fibonacci series.
 */
    public class FibanacciNum {
        public static void main(String[] args) {

            int a,b,c;
            a=0;
            b=1;

            for (int i = 1; i <10; i++) {
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
