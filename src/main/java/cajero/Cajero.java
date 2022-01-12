package cajero;

import java.sql.*;

/**
 * @date 15 dic. 2021
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Cajero {
    public static void main (String [] args) {
     
        //URL es la cadena de conexión con la base de datos
        var url = "jdbc:mysql://localhost:3307/olimpus";
        var user = "root";
        var pass = "1234";
        try (var con = DriverManager.getConnection(url, user, pass)){
            String guion = "--------------------";
            System.out.println(guion + " CONECTADOS CON LA BASE DE DATOS " + guion);
            
            //if (con.getAutoCommit()) con.setAutoCommit(false);
            /*
            con.setAutoCommit(false);
            var insertHist = "INSERT INTO historico (operacion, cuenta, importe) VALUES(?, ?, ?)";
            var uptCuent = "UPDATE cuentas SET saldo = saldo + ? WHERE num = ?";
            
            try (var pstHist = con.prepareStatement(insertHist);
                 var pstCuent = con.prepareStatement(uptCuent);) {
                
                pstHist.setString(1, "I");
                pstHist.setString(2, "ES001");
                pstHist.setFloat(3, 100.00f);
                
                pstCuent.setFloat(1, 100.00f);
                pstCuent.setString(2, "ES001");
                
                try {
                    pstHist.executeUpdate();
                    pstCuent.executeUpdate();
                    con.commit();
                } catch (SQLException ex) {
                    System.err.println(ex.toString());
                    con.rollback();
                }
            } catch (SQLException ex) {
                System.err.println(ex.toString());
            }
            
            //if (con.getAutoCommit()) con.setAutoCommit(true);      
            con.setAutoCommit(true);
            */
        } catch (SQLException ex) {
            System.out.println("NO PUDIMOS CONECTAR CON LA BASE DE DATOS:");
            System.err.println(ex.toString());
            
        }

    }
}
