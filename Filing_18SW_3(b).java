import java.io.*;

public class SwapAbyX
{    
    public static void main(String[] args) 
    {  
        try {           
            int next=0;
            FileReader fr=new FileReader("abc.txt");
            while((next=fr.read())!=-1)
            {
                if((char)next=='a'){
                System.out.print("x");
                }
                else{
                    System.out.print((char)next);
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
