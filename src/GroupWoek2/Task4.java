package GroupWoek2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */
public class Task4 {
    public static void main(String[] args) {
        var str1="silent";
        var str2="Listen";


       char c1[]=str1.toLowerCase().toCharArray();
       char c2[]=str2.toLowerCase().toCharArray();
        if (str1.length()!=str2.length()){
            System.out.println("Not a anagram");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i]!=c2[i]){
                System.out.println("Not a anagram");
                System.exit(0);
            }

        }
        System.out.println("it is a anagram");
    }
}
