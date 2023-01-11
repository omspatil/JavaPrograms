/*Given two strings, word and a separator, return a big string made of count occurrences of the 
word, separated by the separator string. if the inputs are "Wipro","X" and 3 then the output is 
"WiproXWiproXWipro". */
import java.util.*;
public class TestString7 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Integer:");
    int a=sc.nextInt();
    System.out.println("Enter First String");
    String s1=sc.next();
    System.out.println("Enter second String");
    String s2=sc.next();
    sc.close();
    for(int i=a;i>0;i--){
        System.out.print(s1);
        if(i==1)
        break;
        System.out.print(s2);
    }
}
}