/*Return a version of the given string, where for every star () in the string the star and the chars 
immediately to its left and right are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad". */
import java.util.*;

public class TestString8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String s1=sc.nextLine();
        sc.close();
        StringBuffer s2=new StringBuffer(s1);
        System.out.println(s2.delete(1, s2.length()-1));

        
    }
}
