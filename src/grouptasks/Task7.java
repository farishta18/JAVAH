package grouptasks;

public class Task7 {
    public static void main(String[] args) {
        /*
         Write a Java Program to print the first 10 numbers of Fibonacci series.
         */

        int max=10;
        int n1=0;
        int n2=1;
        for (int i = 0; i <max; i++) {

            System.out.print(n1+" ");

            int sum=n1+n2;
            n1=n2;
            n2=sum;

        }
    }
}
