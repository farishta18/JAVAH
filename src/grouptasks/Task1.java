package grouptasks;

public class Task1 {
    public static void main(String[] args) {
        /*
       1. Create a program that uses an array to store a list of temperatures for a week,
        and then uses a loop to find the highest and lowest temperature for the week.
        int[] numbers={30,-5,50,90};
         */

        int[] numbers={30,-5,50,90};

        int highest=0;
        int lowest=0;

        for (int i : numbers) {
            if (i > highest){
                highest=i;

            } else if (i < lowest) {
                lowest=i;

            }
        }

        System.out.println("highest Tem "+highest+" ");
        System.out.println("and lowest Tem "+lowest+" ");
    }
}


