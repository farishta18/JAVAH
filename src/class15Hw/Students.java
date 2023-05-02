package class15Hw;

public class Students {
    /*
  Create a Class called Students
Create three  variables  Name , ID  and
 numberOfStudents Create three objects of
 the Students Class Set the value for
  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    static String Name;
    static String ID;

    static int numberOfStudents;

    public static void main(String[] args) {
        Students student=new  Students();
        Students student1=new  Students();
        Students student2=new  Students();
        Students student3=new  Students();

        student.Name="Aisha";
        student.ID="224190";
        Students.numberOfStudents++;

        student1.Name="Farishta";
        student1.ID="141324";
        Students.numberOfStudents++;


        student2.Name="Sadaf";
        student2.ID="664142";
        Students.numberOfStudents++;


        student3.Name="Zaraarah";
        student3.ID="523678";
        Students.numberOfStudents++;

        System.out.println("total number of students is "+Students.numberOfStudents);

    }

}
