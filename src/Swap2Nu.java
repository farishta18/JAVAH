public class Swap2Nu {
    /*
 Write a program to swap 2 numbers
 without a temporary variable?
 */
    public class swap2Number {
        public static void main(String[] args) {
            var a=10;
            var b=20;

            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After swap");
            System.out.println("a "+a);
            System.out.println("b "+b);

        }
    }
}
