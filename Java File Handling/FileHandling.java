
import java.io.*;
public class FileHandling  {
    public static void main(String[] args)throws Exception{
        FileInputStream fin;
        fin=new FileInputStream("C:\\Users\\91973\\OneDrive\\Desktop\\New folder\\test.txt");
        int x;
        do {            
            x=fin.read();
            System.out.println((char)x);
        } while (x!=-1);
            fin.close();
    }
    
   
}
