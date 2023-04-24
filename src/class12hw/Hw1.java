package class12hw;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Create a String and if the String is not empty perform the following:
       if the String has an odd number of characters and has 3 or more characters, print
       the character in the middle of the String.
       For Example String str=hello =>l*/

        String characters="cat";
        int middle = characters.length()/2;

        if (characters.isEmpty()|| characters.isBlank()){
            System.out.println("The string is empty");
        }
        for (int i = 0; i < characters.length(); i++) {
            if (characters.charAt(i)%2==0 && characters.length()>=3){
                System.out.println(characters.charAt(middle));

            }

        }

    }
}
