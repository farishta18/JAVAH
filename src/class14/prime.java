package class14;

public class prime {
    public static void main(String[] args) {


         /*
    Write a method to return whether given number is prime or not?
     */
        int n = 9;
        boolean primNum = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primNum = false;

            }

        }
        System.out.println(primNum);

    }
}
