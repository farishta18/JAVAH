package class12hw;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        /*

      Write a program that reads two people's first
      names and if they expecting boy or girl?
      Based on the input suggests a name for a baby:
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String momFirstN=scanner.next();
        System.out.println("Mom’s first name? "+momFirstN);

        System.out.println("Dad’s first name?");
        String dadFirstN=scanner.next();
        System.out.println("Dad’s first name? "+dadFirstN);
        System.out.println("Boy or Girl?");
        String babyGender=scanner.next();
        System.out.println("Suggested baby name "+dadFirstN);

        if (momFirstN.equals("Mary")){
            System.out.println("Mom’s first name? "+momFirstN);
            if (dadFirstN.equals("Daniel")){
                System.out.println("Dad’s first name? "+dadFirstN);


            }
            if (babyGender.equals("boy")){
                System.out.println("DANRY");

            } if (babyGender.equals("girl")){
                System.out.println(" MAIEL");

            }

        }


    }
}
