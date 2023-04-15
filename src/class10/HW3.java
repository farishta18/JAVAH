package class10;

public class HW3 {
    public static void main(String[] args) {
        /*
        Using 2D array create a grocery list. Inside you should have an array of veggies, fruits,
         dairy and sweets. Retrieve all values from that array using 2 different loops
         */
        String[][] groceryList= {{"cucumber", "spinach", "carrot","Kale"},
                            {"Grapes", "Orange", "Apples","Banana"},
                            {"Dates.", "Baklava", "Knafeh", "pastry"},
                            {"milk","butter", "cheese", "yogurt"},

        };


        for (int rows = 0; rows <groceryList.length ; rows++) {
            for (int columns = 0;  columns< groceryList.length; columns++) {
                System.out.print(groceryList[rows][columns]+" ");
            }
            System.out.println();

        }
        System.out.println();

        for (String[] strings : groceryList) {
            for (String string : strings) {
                System.out.print(string+" ");

            }
            System.out.println();
        }


    }
}
