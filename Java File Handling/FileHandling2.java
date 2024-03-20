import java.io.*;

public class FileHandling2 {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fin;
        fin=new FileInputStream("C:\\Users\\91973\\OneDrive\\Desktop\\New folder\\test.txt");
        FileOutputStream fout;
        fout=new FileOutputStream("C:\\Users\\91973\\OneDrive\\Desktop\\New folder\\test1.txt");
        
        int x;
        do {   
            x=fin.read();
            if(x!=-1){
                fout.write(x);
            }
        } while (x!=-1);
            fin.close();
            System.out.println("File Copied...");
            fout.close();
    }
}
