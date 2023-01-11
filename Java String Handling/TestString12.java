/*Given a string and a non-empty word string, return a string made of each char just before and 
just after every appearance of the word in the string. Ignore cases where there is no char before 
or after the word, and a char may be included twice if it is between two words.
 */

import java.util.*;
public class TestString12 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();
        
        int l1=s1.length();
        int l2=s2.length();
        for(int i=0;i<l1-l2+1;i++)
        {
            String s=s1.substring(i,i+l2);
            if(i>0 && s.equals(s2))
            {
                System.out.print(s1.substring(i-1,i));
            }
            if(i<l1-l2 && s.equals(s2))
            {
                System.out.print(s1.substring(i+l2,i+l2+1));
            }
            
        }
    }

}
