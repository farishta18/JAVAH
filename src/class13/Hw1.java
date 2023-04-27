package class13;

public class Hw1 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */

       String sentence= "This is sentence i want to reverse";
        String[] senten= sentence.split(" ");
        for (String s : senten) {
            StringBuilder str= new StringBuilder(s);
            System.out.print(str.reverse()+" ");

        }

    }
}
