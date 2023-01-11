/*Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken 
from the user while executing the program. In the same Program write your own Exception classes to 
take care of Negative values and values out of range (i.e. other than in the range of 0-100)
Exception Handling: Throw & Used Defined Exception  */

import java.util.*;

class InvalidExceptionId extends Exception {

    @Override
    public String toString() {
        return "Invalid Marks";
    }

}

class Student1 {
    private int sub1;
    private int sub2;
    private int sub3;
    private String name;

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class ExceptionHandling6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String s = sc.next();
        System.out.println("Enter Marks:");

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sc.close();
            if (x < 0 || y < 0 || z < 0) {
                InvalidExceptionId ex = new InvalidExceptionId();
                throw ex;
            }
            Student1 st = new Student1();

            st.setName(s);
            st.setSub1(x);
            st.setSub2(y);
            st.setSub3(z);
            int sum = x + y + z;
            double avg = sum / 3;
            System.out.println(sum);
            System.out.println(avg);
        } catch (InvalidExceptionId e) {
            System.out.println(e.toString());
        }

    }
}
