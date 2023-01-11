/*Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are 
“Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase) */

import java.util.*;

class TestString1{

   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First String");
    String s1=sc.next();
    System.out.println("Enter Second String");
    String s2=sc.next();
    sc.close();
    if(s1.charAt(s1.length()-1)==s2.charAt(0)){
        System.out.println(s1.concat(s2.substring(1)));
    }
    else System.out.println(s1.concat(s2));
}
}