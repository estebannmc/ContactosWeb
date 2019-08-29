package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {

    Connection conexion;
    String url = "jdbc:mysql://localhost:3306/bdcontactos";
    String usuario = "root";
    String pass = "";

    public Connection Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
        } 
        catch (Exception e) {
        }
        return conexion;
    }

   

}
