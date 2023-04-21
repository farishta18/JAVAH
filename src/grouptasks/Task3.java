package grouptasks;

public class Task3 {
    public static void main(String[] args) {
        /*
        3. Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {
                {55, 98, 4, 8,},
                {20, 28, 14, 9,},
                {52, 13, 23, 33,},
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j]%2==0){
                    System.out.println(numbers[i][j]);
                }

            }

        }
    }
}
