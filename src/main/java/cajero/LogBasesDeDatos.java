package cajero;

import java.sql.*;
import java.util.*;
import java.io.*;

/**
 * @date 15 dic. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class LogBasesDeDatos {
    public static Connection getConectar() {
        Properties properties = new Properties();
        Connection conexion = null;
        try {
            properties.load(new FileInputStream(new File("properties.properties")));
            String url = properties.get("url").toString();
            String user = properties.get("user").toString();
            String pass = properties.get("pass").toString();
            try (var con = DriverManager.getConnection(url, user, pass)){
                conexion = (Connection) DriverManager.getConnection (url,user,pass);
                String guion = "--------------------";
                System.out.println(guion + " CONECTADO CON LA BASE DE DATOS " + guion);
            } catch (SQLException ex) {
                System.out.println("NO PUDIMOS CONECTAR CON LA BASE DE DATOS:");
                System.err.println(ex.toString()); 
            }
        } catch (FileNotFoundException ex) {
            System.out.print("ERROR: ");
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println("ERROR: ");
            System.out.println(ex);
        }
        return conexion;
    }
}
