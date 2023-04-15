package class10;

public class Hw2 {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian. Then retrieve all values
        from that array using 2 different loops
         */


        String[][] cars={{"American", "german"},
                         {"korean", "italian"}
        };
       for (String[] car : cars) {
           for (String s : car) {
               System.out.print(s+" ");


           }
           System.out.println();


      }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {

                System.out.print(cars[i][j]);

            }
 System.out.println();
        }


    }
}
