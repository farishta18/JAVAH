package GroupWoek2;
/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
 */
public class Task2 {
    public static void main(String[] args) {

        String str="madam";
        String reversed="";

        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);

        if (str.equals(reversed)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }

    }

}
