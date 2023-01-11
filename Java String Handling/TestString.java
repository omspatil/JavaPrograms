/*Write a Program that will check whether a given String is Palindrome or not */

import java.util.*;


 class TestString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		String s1= sc.next();
		sc.close();
		
        StringBuffer s2= new StringBuffer(s1);
		s2.reverse();
		if(s1.equals(s2.toString()))

		{
			System.out.println("Palindrome");
		}
		else 
			{
			System.out.println("Not a Palindrome");
			}
		
		
	}
}
