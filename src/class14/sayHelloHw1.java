package class14;

import java.util.Scanner;
import java.util.SortedMap;

public class sayHelloHw1 {
    /*
    Create a method that will say Hello in different language based on the country that will
    passed when method is executed.
    */
    void language(String country){

        if (country.equals("Afghanistan")){
            System.out.println("سلام");
        }else if (country.equals("United States")){
            System.out.println("Hello");

        }else if (country.equals("Morocco")){
            System.out.println(" مرحبًا");

        }else if (country.equals("Armenia")){
            System.out.println("Բարեւ");

        }else if (country.equals("Tajikistan")){
            System.out.println("Салом");
        }
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a country name");
        sayHelloHw1 sayHello=new sayHelloHw1();
        sayHello.language(scan.nextLine());
    }
    }


