package employe.management.syatem;

import java.sql.*;

public class Connect {
    
    Connection c;
    Statement s;

    public Connect () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employemanagementsystem", "root", "admin");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}