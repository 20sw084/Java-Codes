import java.io.*;
public class FileStreams {
    public static void main(String[] args) {
        FileOutputStream  fs=null;
        try{
        fs=new FileOutputStream("C:/Users/Lenovo/Desktop/MyFile.txt");
        BufferedOutputStream bs=new BufferedOutputStream(fs);
        for(int i=65;i<91;i++)
        bs.write(i);
        bs.close();
        fs.close();
        }
        catch(Exception ie){
            System.err.println(ie.getMessage());
        }
        System.out.println("Done");
    }
}
