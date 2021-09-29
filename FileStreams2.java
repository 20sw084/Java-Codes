import java.io.*;
public class FileStreams {
    public static void main(String[] args) {
        FileInputStream  fs=null;
        try{
        fs=new FileInputStream("C:/Users/Lenovo/Desktop/MyFile.txt");
        BufferedInputStream bs=new BufferedInputStream(fs);
        int next;
        while((next=bs.read())!=-1)
        System.out.println((char)next);
        bs.close();
        fs.close();
        }
        catch(Exception ie){
            System.err.println(ie.getMessage());
        }
        System.out.println("Done");
     }
}
