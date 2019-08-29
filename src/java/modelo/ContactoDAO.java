package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContactoDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public void add(Contacto c) {

        String sql = "insert into contactos(nombre,telefono,correo)values(?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, Integer.toString(c.getNumero()));
            ps.setString(3, c.getEmail());
            ps.executeUpdate();
        } catch (Exception e) {
        }
      

    }

}
