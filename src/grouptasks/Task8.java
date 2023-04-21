package grouptasks;

public class Task8 {
    public static void main(String[] args) {

        /*8. Maximum and minimum number in the array?*/
        int[] num = {77, 90, 22, 23};

        int maximum = num[0];
        int minimum = num[0];

        for (int i = 0; i < num.length; i++) {


            if (num[i] > maximum) {
                maximum = num[i];

            } else if (num[i] < minimum) {
                minimum = num[i];

            }

        }
        System.out.println("maximum number is " + maximum);
        System.out.println("minimum number is " + minimum);


    }
}
