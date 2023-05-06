package class16;

public class Hw1 {

     /*Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.*/

    public String sentece(String str1) {
        StringBuilder st=new StringBuilder(str1);
        st.reverse();
        str1=st.toString();

        return str1;

    }

    public static void main(String[] args) {
        Hw1 obj=new Hw1();
        String results=obj.sentece("Java is getting harder and harder");
        System.out.println(results);
    }
}
