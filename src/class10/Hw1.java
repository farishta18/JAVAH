package class10;

public class Hw1 {
    public static void main(String[] args) {
        String [][] names={
                {"Mohamad", "Ehan", "Aisha","Khalid"},
                {"A", "B", "C","D"}
        };
        for(int i =0 ;i<names.length;i++) {
            for(int j =0;j<names[i].length;j++) {

                if(names[i][j]=="A") {
                    System.out.println(names[i-1][j]);
                }
                if(names[i][j]=="B") {
                    System.out.println(names[i-1][j]);
                }
            }
        }
    }
}


