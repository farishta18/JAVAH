package GroupWoek2;

/*
1. Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
 */
public class Task1 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        str.reverse();
        System.out.println(str);
    }

}
