/*  Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and 
otherwise return the string unchanged. If the input is "xHix", then output is "Hi".*/

import java.util.*;
public class TestString6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        sc.close();
        if(s1.charAt(0)==s1.charAt(s1.length()-1)){
            System.out.println(s1.substring(1, s1.length()-1));
        } else{
            System.out.println(s1);
        }
    }

}
