import java.io.*;
public class FileStreams {
    public static void main(String[] args) {
        FileWriter  fs=null;
        try{
            fs=new FileWriter("C:/Users/Lenovo/Desktop/MyFile.txt");
            BufferedWriter bw=new BufferedWriter(fs);
            bw.write("Deep: As you are, so we were \n as we were, so shall you were");
            bw.newLine();
            bw.close();
        }
        catch(IOException ie){
            System.out.println(ie.getMessage());
        }
        System.out.println("Done");
    }
}
