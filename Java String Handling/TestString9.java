/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the 
result. If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 */
import java.util.*;
public class TestString9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        

        for(int i=0;i<s1.length();i++) 
        {
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
        }
    }
    
}
