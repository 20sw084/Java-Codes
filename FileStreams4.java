import java.io.*;
public class FileStreams {
    public static void main(String[] args) {
        FileReader  fs=null;
        try{
            fs=new FileReader("C:/Users/Lenovo/Desktop/MyFile.txt");
            BufferedReader bw=new BufferedReader(fs);
            int next;
            while((next=bw.read())!=-1)
            System.out.println((char)next);
            bw.close();
        }
        catch(Exception ie){
            ie.printStackTrace();;
        }
        System.out.println("Done");
    }
}
