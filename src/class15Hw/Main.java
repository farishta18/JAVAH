package class15Hw;

public class Main {

   /* int number1;
    double number2;
    char character;

    int number3=100;
    double number4=100.23;
    char character1='s';

    void print1(){
        System.out.println(number1);
    }
    void print2(){
        System.out.println(number2);
    }
    void print3(){
        System.out.println(character);
    }


    public static void main(String[] args){

        Main obj=new Main();
        Main obj1=new Main();

        obj.number1=10;
        obj.number2=10.23;
        obj.character='a';

        obj.print1();
        obj.print2();
        obj.print3();

        System.out.println(obj1.number3);
        System.out.println(obj1.number4);
        System.out.println(obj1.character1);


    }

}
*/


    public static String censorLetter(String x, char z) {

        return x.replace(z, '*');

    }

    public static void main(String[] args) {
        Main obj = new Main();
        String results=obj.censorLetter("computer science", 'e');
        String result=obj.censorLetter("trick or treat", 't');

        System.out.println(results);
        System.out.println(result);


    }
}