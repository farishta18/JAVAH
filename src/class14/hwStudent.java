package class14;

import java.util.Scanner;

public class hwStudent {
    /*Create  class Student that will have a method getGrade.
     Your method should accept the score of a student and return a grade:
    score > 90 - A
    score >80 - B
    score >70 - C
    score > 50 - D
    anything else - F

     */

    int getGrade(int score) {

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");

        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter student score.");
        int score=scan.nextInt();
        hwStudent obj =new hwStudent();
        obj.getGrade(score);
        System.out.println(score);

    }
}
/*
char grade=whatGrade.studentGrader(65);
        System.out.println(grade);

        task4 obj=new task4();
        int score=78;
        String result=obj.getGrade(score);
        System.out.println(result);
 */

