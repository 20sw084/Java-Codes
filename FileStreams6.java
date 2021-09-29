import java.io.*;
public class FileStreams {
    public static void main(String[] args) {
        FileReader  fs=null;
        try{
            fs=new FileReader("C:/Users/Lenovo/Desktop/MyFile.txt");
            BufferedReader bw=new BufferedReader(fs);
            String Line;
            while((Line=bw.readLine())!=null)
            System.out.println(Line);
            bw.close();
        }
        catch(IOException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println("Done");
    }
}
