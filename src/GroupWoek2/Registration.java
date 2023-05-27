package GroupWoek2;

import class14.email;

/*
Create Registration Class in which you would have variables as email, userName and password that
have an access scope only within its own class. After creating an object of the class user should be
able to call methods and in each method separately pass values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain userName.

 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("yahoo.com")) {
            this.email = email;
            System.out.println("You have entered the right email");
        } else {
        System.out.println("Invalid email. Please provide a Yahoo email.");
    }
}

    public void setUserName(String userName) {
        if (!userName.isEmpty()&& userName.length()>6) {
            this.userName = userName;
            System.out.println("You have entered the right username");
        } else {
            System.out.println("Invalid username.");
        }
    }



   public void setPassword(String password) {
        if (!password.isEmpty()&& password.length()>6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("You have entered the right password");
        } else {
            System.out.println("Invalid password.");
        }
    }
}
