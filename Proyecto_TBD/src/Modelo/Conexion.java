package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private final String base = "proyecto";
    private final String user = "root";
    private final String pass = "";
    private final String URL = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.URL,this.user,this.pass);
        }catch(SQLException e){
            System.err.println(e);
        }catch(ClassNotFoundException ex){
            
        }return con;
    }
    
}
