/*Given a string, return a new string made of n copies of the first 2 chars of the original string 
where n is the length of the string. The string may be any length. If there are fewer than 2 chars, 
use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi". */
import java.util.*;

public class TestString2 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next();
        sc.close();
        int n =s1.length();
       for(int i=0;i<n;i++){
          System.out.print(s1.substring(0, 2));
       }
     
        
    }
}
