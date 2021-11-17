// 1. Using File(Out/In)putStream
// * Write(Output)

import java.io.*;
public class Main{    
    public static void main(String[] args) {        
        try 
        {
        FileOutputStream fos=new FileOutputStream("C:/Users/Lenovo/Documents/JavaProjects/src/file.txt");
        fos.write(65);        
        fos.close();
                System.out.println("Success...");  
        }
        catch (IOException e) {
        e.printStackTrace();
        }
    }
}
//* Read(Input)
import java.io.*;

public class Main{    
    public static void main(String[] args) {        
        try 
        {
            int next=0;
        FileInputStream fis=new FileInputStream("C:/Users/Lenovo/Documents/JavaProjects/src/file.txt");
        while((next=fis.read())!=-1)
        {    
            System.out.println("\n"+(char)next);
        }    
        fis.close();
                System.out.println("Success...");  
        }
        catch (IOException e) {
        e.printStackTrace();
        }
    }
}

//Using Buffered(Out/In)putStream Object
//* Write(Output)
import java.io.*;

public class Main{    
    public static void main(String[] args) {        
        try 
        { 
            int next=0;
        FileInputStream fis=new FileInputStream("C:/Users/Lenovo/Documents/JavaProjects/src/file.txt");
        while((next=fis.read())!=-1)
        {    
            System.out.println("\n"+(char)next);
        }    
        fis.close();
                System.out.println("Success...");  
        }
        catch (IOException e) {
        e.printStackTrace();
        }
    }
}

//* Read(Input)
import java.io.*;

public class Main{    
    public static void main(String[] args) {        
       try {int next=0;
           FileInputStream fis=new FileInputStream("file.txt");
           BufferedInputStream bis=new BufferedInputStream(fis);
           while((next=bis.read())!=-1){
                System.out.println(next);
           }
           bis.close();
           fis.close();
           System.out.println("DONE");
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}

// Using File(Writ/Read)er Object
//* Write(Output)
import java.io.*;

public class Main{    
    public static void main(String[] args) {        
       try {
           FileWriter fw=new FileWriter("file.txt");
           fw.write("My Name is Jonny Rajput");
           fw.close();
           System.out.println("DONE");
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}

//* Read(Input)
import java.io.*;

public class Main{    
    public static void main(String[] args) {        
       try {int next=0;
           FileReader fr=new FileReader("file.txt");
           while((next=fr.read())!=-1){
               System.out.print((char)next);
           }
           System.out.println();
           fr.close();
           System.out.println("DONE");
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}

