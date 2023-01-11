
/*
 * Write a Program with a division method who receives two integer numbers and performs the division 
operation. The method should declare that it throws ArithmeticException. This exception should be 
handled in the main method.
throws 
 */
import java.util.*;

public class ExceptionHandling5 {

    static int div(int a, int b) throws ArithmeticException, InputMismatchException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two int:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        try {
            int z = div(a, b);
            System.out.println(z);
        } catch (Exception e) {

            System.out.println("can not divide by zero");
        }

    }

}
