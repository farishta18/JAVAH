package class10;

public class HW5 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
         Develop a program which will identify/print the even numbers only.
         */

 int[][] array = {
                {20, 13, 14, 35},
                {7, 18, 6, 3},
                {5, 17, 24, 40},
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}


