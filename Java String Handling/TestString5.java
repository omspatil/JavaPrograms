/*Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on 
the outside and the longer string on the inside. The strings will not be the same length, but they 
may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".*/

import java.util.*;
public class TestString5 {
   public static void main(String[] args){
    Scanner sc = new Scanner( System.in);
     String a=sc.next();
     String b=sc.next();
     sc.close();
     if(a.length()<b.length()){
        System.out.println(a+b+a);
     }
     else{
        System.out.println(b+a+b);
     }
   }
    
}
