package grouptasks;

public class Task10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from
      an Array of Strings?
         */

        String [][] arr={{"Mohamad", "Ehan", "Aisha","Khalid", "Farishta","Ehan"}};

        for (String[] strings : arr) {
            for (String string : strings) {
                if (string.equals("Ehan")){
                    System.out.println(string);

                }
            }
        }
    }
}
