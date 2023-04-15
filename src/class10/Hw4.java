package class10;

public class Hw4 {
    public static void main(String[] args) {
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

 */

        int[][] array = {
                {22, 42, 9},
                {19, 23, 55},
                {99, 61, 8},
        };

        int sum = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {

                sum=sum+array[i][j];

                System.out.print(sum+" ");

            }

        }


    }
}
