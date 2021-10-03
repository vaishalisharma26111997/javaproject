package myconn;
import java.sql.*;

public class GetConnection 
{
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/onlinefaculty_mng";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    
    public static Connection getConnect()
    {
        Connection con = null;
        try
        {
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER, PASS);
                if(con!=null)
                       System.out.println("Connection Established successfully.!!");
                else
                        System.out.println("Error occured..!!");
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Exception : "+e);
        }
        return con;
    }
}
