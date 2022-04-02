import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("file1.txt");
            String s = "Written into file!";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success!");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
