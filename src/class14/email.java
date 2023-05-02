package class14;

public class email {

        /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */

    String createEmail(String firstName, String lastName, String emailtype){
        String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailtype.toLowerCase()+".com";

        return email;

    }

    public static void main(String[] args) {
        email email1=new email();
        String firstName="John";
        String lastName="Snow";
        String emailtype="gmail";

        String emailadrees=email1.createEmail("John", "Snow", "gmail");
        System.out.println(emailadrees);
    }
    }

