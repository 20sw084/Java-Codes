import java.sql.*;
public class sqlfile{
    public static void main(String[] args) {
        /*try{
        Class.forName("com.mysql.jdbc.Driver");//"C:/Program Files/Microsoft SQL Server");
        }
        catch(ClassNotFoundException cnfe){
            cnfe.getStackTrace();
        }*/
        Connection conn=null;
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root"); 
        }
        catch(SQLException sqle) {  
           System.out.println( sqle.getMessage());
        }
        try{
        //    PreparedStatement ps=conn.prepareStatement("Insert into student values  ?,? ");
        //    ps.setString(1,"20SW042");
        //    ps.setString(1,"Asad Ali Gadehi");  
        Statement stmt=conn.createStatement();
        ResultSet res =stmt.executeQuery("SELECT * From student"); 
        System.out.println("Roll No"+"\t\t"+"Name");
        while(res.next()){
            System.out.println(res.getString(1)+"\t\t"+res.getString(2));
        }
        conn.close();
        }
        catch(Exception e){ 
            System.out.println(e.getMessage());
        }
    }
}
