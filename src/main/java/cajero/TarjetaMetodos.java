package cajero;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JLabel;

/**
 * @date 19 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class TarjetaMetodos {
    
    public String getNumeroTarjeta(String nifCliente) {
        String buscarNumeroTarjeta = null;
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT numero FROM tarjeta WHERE nif_cliente = '"
            + nifCliente + "'" ;
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                buscarNumeroTarjeta = resultado.getString("numero");
                System.out.println("Encontrado");
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar NUMERO DE TARJETA");
            System.out.println(ex);
        }
        return buscarNumeroTarjeta;
    }
    
    public void reintegro(Integer reintegro, String numeroCuenta, JLabel label) {
        
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT saldo FROM cuenta WHERE numero = '" + 
            numeroCuenta + "'" ;
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            
            if (resultado.next()) {
                int saldo = Integer.valueOf(resultado.getString("saldo"));
            
                if ( reintegro > saldo) {
                    label.setForeground(Color.red);
                    label.setText("Saldo insuficiente");
                } else {
                    label.setForeground(Color.green);
                    label.setText("Operación realizada correctamente");
                }   
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar NUMERO DE TARJETA");
            System.out.println(ex);
        }  
        
    }
    
    public void ingreso(Integer ingreso, String numeroCuenta, JLabel label) {
        
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT saldo FROM cuenta WHERE numero = '" + 
            numeroCuenta + "'" ;
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
   
            if (resultado.next()) {
                int saldo = Integer.valueOf(resultado.getString("saldo"));
            
                if ( ingreso > 1000) {
                    label.setForeground(Color.red);
                    label.setText("Has superado el límite de ingresos para esta cuenta");
                } else {
                    label.setForeground(Color.green);
                    label.setText("Operación realizada correctamente");
                }
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar NUMERO DE TARJETA");
            System.out.println(ex);
        }  
    }
    
}
