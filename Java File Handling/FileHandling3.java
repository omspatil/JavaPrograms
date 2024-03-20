import java.io.*;


public class FileHandling3 {
    public static void main(String[] args)throws Exception {
        FileOutputStream fout ;
        fout=new FileOutputStream("C:\\Users\\91973\\OneDrive\\Desktop\\New folder\\test.txt");
      DataOutputStream dout;
      dout = new DataOutputStream(fout);
      dout.writeInt(345);
      dout.writeBoolean(false);
      dout.writeDouble(1.2);
    dout.close();
     FileInputStream fin= new FileInputStream("C:\\Users\\91973\\OneDrive\\Desktop\\New folder\\test.txt");
        DataInputStream din= new DataInputStream(fin);
        int a=din.readInt();
        boolean b=din.readBoolean();
        double c=din.readDouble();
        System.out.println(a+" "+b+" "+c);
        din.close();
    }
}
