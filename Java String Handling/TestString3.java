/*Given a string of even length, return the first half. So the string "CatDog" yields "Cat". If the 
string length is odd number then return null.
 */

import java.util.*;
public class TestString3 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       String s1=sc.next();
       sc.close();
       int n=s1.length();
       if(n%2==0){
        System.out.println(s1.substring(0, n/2));
       } 
       else {
        System.out.println("null");
       }        
    }
    
}
