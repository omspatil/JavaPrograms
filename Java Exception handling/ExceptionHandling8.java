

/*Write a program to accept name and age of a person from the command prompt(passed as arguments 
when you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error 
messages. The program must exit gracefully after displaying the error message in case the arguments 
passed are not proper. (Hint : Create a user defined exception class for handling errors.)
Exception handling: User Defined Exception & throw  */

class InvalidAgeException extends Exception {
    public String show() {
        return "Age not accepted ";

    }
}

class info {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

public class ExceptionHandling8 {
    public static void main(String[] args) {
        info user1 = new info();
        System.out.println("Enter the name and age:");
        user1.setAge(20);
        user1.setName("abc");
        
        try {
            int a = user1.getAge();
             String b = user1.getName();

            if (a >= 18 && a < 60) {
                System.out.println("information " +a+" "+b);
            } else {
                InvalidAgeException wrongeAge = new InvalidAgeException();
                throw wrongeAge;
            }

        } catch (InvalidAgeException e) {
            System.out.println(e.show());
        }

    }
}
