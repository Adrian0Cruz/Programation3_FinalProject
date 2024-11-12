package Model;
//@author Jesús Hernández

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connection {

    private String Bd = "";
    private String URL = "jdbc:mysql://localhost:3306/";
    private String User = "root";
    private String PassWord = "";
    private String Driver = "com.mysql.cj.jdbc.Driver";
    private Connection Cx;

    public connection(String Bd) {
        this.Bd = Bd;
    }

    public Connection Connect() {
        try {
            Class.forName(Driver);
            Cx = (Connection) DriverManager.getConnection(URL + Bd, User, PassWord);
            return Cx;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void Desconectar() {
        try {
            Cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}