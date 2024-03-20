import java.io.Serializable;
import java.io.*;

class student implements Serializable{
    private int id;
    private String name ;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

}


public class ObjectHandling {
   public static void main(String [] args)throws Exception {
    student st=new student();
    st.setId(10);
    st.setName("abc");
    FileOutputStream fout= new FileOutputStream("C:\\Users\\91973\\OneDrive\\Desktop\\New folder\\test.txt");
    ObjectOutputStream out=new ObjectOutputStream(fout);
    out.writeObject(st);
    out.close();

    System.out.println("File Copied...");
   } 
}
