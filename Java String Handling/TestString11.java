/*Given a string and an int n, return a string made of n repetitions of the last n characters of the 
string. You may assume that n is between 0 and the length of the string, inclusive. For example if 
the inputs are “Wipro” and 3, then the output should be “propropro”.
 */
import java.util.*;
public class TestString11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        sc.close();
        for(int i=0;i<n;i++){
            System.out.print(s.substring(n-1));
        }
    }


}
