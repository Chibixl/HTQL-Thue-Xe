
package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;


public class Model {
    
    public static Connection opConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            String connectionUrl = "jdbc:sqlserver://LAPTOP-D0EB8HAM:1433;database=HTQLChoThueXe;";
            String userID = "sa";
            String password = "nguyen@123";
            Connection con = DriverManager.getConnection(connectionUrl,userID,password);
            return con;
         } catch (Exception e) {
             return null;
         }   
    }   
}
