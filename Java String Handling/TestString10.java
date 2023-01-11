/*
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the 
result. If input is “abc” and “xyz”, then output should be “axbycz”.

 */
import java.util.*;
public class TestString10 {
    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter two Strings:");
              String a=sc.next();
              String b=sc.next();
              sc.close();
              for(int i=0;i<a.length();i++){
                System.out.print(a.charAt(i));
                System.out.print(b.charAt(i));
              }

    }
    
}
