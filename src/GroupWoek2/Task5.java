package GroupWoek2;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
     String str="google";
        HashMap<Character,Integer> hmap=new HashMap<Character, Integer>();

        int lengthOfString=str.length();
        for (int i = 0; i < lengthOfString; i++) {
            Character currentCharacter=str.charAt(i);
           if (hmap.containsKey(currentCharacter)==false){
               hmap.put(currentCharacter,1);
           }else{
               int currentFreq= hmap.get(currentCharacter);
               currentFreq++;
               hmap.put(currentCharacter,currentFreq);
           }

        }
        boolean noRepeatchar=false;
        for (int i = 0; i < lengthOfString; i++) {
            Character currentCharacter=str.charAt(i);
            int currentFreq=hmap.get(currentCharacter);
            if (currentFreq==1){
                System.out.println(currentCharacter);
                break;
            }
        }
        if (noRepeatchar==false){
            System.out.println(-1);
        }
    }
}
