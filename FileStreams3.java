import java.io.*;
public class FileStreams {
    public static void main(String[] args) {
        FileWriter  fs=null;
        try{
            fs=new FileWriter("C:/Users/Lenovo/Desktop/MyFile.txt");
            BufferedWriter bw=new BufferedWriter(fs);
            bw.write("\n\tWriting in File Currently");
            bw.close();
        }
        catch(Exception ie){
            ie.printStackTrace();;
        }
        System.out.println("Done");
    }
}
