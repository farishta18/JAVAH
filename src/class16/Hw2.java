package class16;

public class Hw2 {
    /*
    Create a method that will accept a String as a parameter and return a
    new String that consist only of vowels. Method should be available inside
    the class only where it was declared and executed by calling it is name
    */

    private String vowels(String str){

        for (int i = 0; i < str.length(); i++)
        {if (str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||str.charAt(i)=='a' ||str.charAt(i)=='e'){

            System.out.print(str.charAt(i)+" ");
            }

        }

        return str;
    }

    public static void main(String[] args) {

        Hw2 obj=new Hw2();

        obj.vowels("I don't know what to say");

    }
}
