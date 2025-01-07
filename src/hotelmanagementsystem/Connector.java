
package hotelmanagementsystem;

import java.sql.*;

public class Connector {
  
  Connection c;
  Statement s;
  
    Connector(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root", "nitin123@");
        s=c.createStatement();
    }
        catch (Exception e){
            e.printStackTrace();
        }
}
}