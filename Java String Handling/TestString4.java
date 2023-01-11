/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string 
length will be at least 2 
 */
import java.util.*;
public class TestString4 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter String");
         String s=sc.next();
         sc.close();
         System.out.println(s.substring(1,s.length()-1));
    }
    
}
