import java.io.*;

public class Main
{    
    public static void main(String[] args) 
    {  
        try {
            String[] str={"20SW002","20SW005","20SW008","20SW012","20SW015"};
            FileWriter fw=new FileWriter("file.txt");
            for(int i=0;i<5;i++)
            {
                fw.write(str[i]+"\n");
            } 
            fw.close();
            int next=0;
            FileReader fr=new FileReader("file.txt");
            while((next=fr.read())!=-1)
            {
                System.out.print((char)next);
                if ((char)next == '\n') 
                {
                    System.out.println();
                 }
            }
            fr.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }      
    }
}
