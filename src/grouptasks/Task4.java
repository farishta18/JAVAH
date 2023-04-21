package grouptasks;

public class Task4 {
    public static void main(String[] args) {
        /*
        4. Create a 2D array of integers. Develop a program which will calculate
        the sum of even and odd numbers for that array.
         */
        int[][] numbers = {
                {99, 54, 64, 33, 21},
                {35, 72, 51, 13, 41},
                {14, 4, 19, 2, 23},
                {7, 5, 6, 3, 1}
        };
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    even = even + numbers[i][j];
                } else if ((numbers[i][j] % 2!= 0)){
                    odd = odd+ numbers[i][j];
                }


            }

        }
        System.out.print("even "+even+ " ");
        System.out.print("and odd "+odd+"  ");
    }
}


