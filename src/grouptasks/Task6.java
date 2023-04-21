package grouptasks;

public class Task6 {
    public static void main(String[] args) {
        /*
        6. Write a java program to check whether a given number is prime or not?
         */

        int n=7;
        boolean primNum =true;

        for (int i = 2; i < n; i++) {
            if (n%i==0){
                primNum =false;
                break;
            }
        }
        System.out.println(primNum);
    }
}
