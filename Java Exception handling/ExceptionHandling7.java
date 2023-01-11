/*A student portal provides user to register their profile. During registration the system needs to validate 
the user should be located in India. If not the system should throw an exception. Step 1: Create a user 
defined exception class named “InvalidCountryException”. Step 2: Overload the respective constructors. 
Step 3: Create a main class “UserRegistration”, add the following method, registerUser– The parameter 
are String username,String userCountry and add the following logic, • if userCountry is not equal to 
“India” throw a InvalidCountryException with the message “User Outside India cannot be registered” • if 
userCountry is equal to “India”, print the message “User registration done successfully” Invoke the 
method registerUser from the main method with the data specified and see how the program behaves, 
Name Country Expected Output Mickey US InvalidCountryException should be thrown. The message 
should be “User Outside India cannot be registered” Mini India The message should be “User 
registration done successfully” Sample Input and Output
Exception Handling: User Defined Exception & throw */

import java.util.*;

class InvalidCountryException extends Exception {
    public String display() {
        return "User Can't Register Outside From India";
    }
}

class Registration {
    private String username;
    private String usercountry;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsercountry() {
        return usercountry;
    }

    public void setUsercountry(String usercountry) {
        this.usercountry = usercountry;
    }

}

public class ExceptionHandling7 {
    public static void main(String args[]) {
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Country Of Birth:");
        s1 = sc.next();
        s2 = sc.next();
        sc.close();

        try {
            if (s2.equalsIgnoreCase("india")) {
                Registration r1 = new Registration();
                r1.setUsername(s1);
                r1.setUsercountry(s2);
                System.out.println("User Registration Done Successfully \n" + "Name of The User:" + r1.getUsername());

            } else {
                InvalidCountryException wrongcountry = new InvalidCountryException();
                throw wrongcountry;
            }

        }

        catch (InvalidCountryException e) {
            System.out.println(e.display());
        }

    }
}