public class Prime {
    /*
 Write a java program to check whether a given number is prime or not?
 */
    public class PrimeOrNot {
        public static void main(String[] args) {

            int num=7;
            Boolean isPrime=true;
            if (num>1){
                for (int i = 2; i<num ; i++) {
                    if (num%i==0){
                        isPrime=false;
                    }


                }
            }
            System.out.println(isPrime);
        }
    }

}
