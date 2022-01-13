package cajero;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 * @date 13 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Tarjeta {
    

    public void setSoloNum(KeyEvent evt, JLabel info, JTextField cajaTexto, int num) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 127;
        if (!numeros) {
            evt.consume();
            info.setText("El número de socio solo contiene números");
        } else if (cajaTexto.getText().length() >= num) {
            evt.consume();   
            info.setText("El número de socio tiene máximo " + num + " números");
        }  else {
            info.setText("");
        }
    }

    public void setValidarNumTarjeta (KeyEvent evt, JLabel info, JTextField cajaTexto, int num) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 127;
        if (!numeros) {
            evt.consume();
            info.setText("El número de socio solo contiene números");
        } else if (cajaTexto.getText().length() >= num) {
            evt.consume();   
            info.setText("El número de socio tiene máximo " + num + " números");
        } else if (
            cajaTexto.getText().length() == 4 ||
            cajaTexto.getText().length() == 11 ||
            cajaTexto.getText().length() == 18) {
            
            //String numActual = cajaTexto.getText() + " - ";
            //cajaTexto.setText(numActual);
        } else {
            info.setText("");
        }
    }
    
    public String getIdentificarCliente(String numTarjeta, String cvs, 
        String pin, String fecha) {
        
        String busquedaUsuario = null;
        Connection conexion = null;
        
        try {
            conexion = LogBasesDeDatos.getConectar();
            SegundaPantalla segPantalla = new SegundaPantalla();
            String sentIdentCliente = 
            ("SELECT bloqueada FROM tarjeta WHERE numero = '" +
            numTarjeta + "' && cvs = '" + cvs + "' && pin = '" + pin +"'");
            
            var sentencia = conexion.prepareStatement(sentIdentCliente);
            var resultado = sentencia.executeQuery();
            
            if (resultado.next()) {
                busquedaUsuario = "Usuario encontrado";
                System.out.println(busquedaUsuario);
            } else {
                busquedaUsuario = "Usuario no encontrado";
                System.out.println(busquedaUsuario);
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return busquedaUsuario;
    }
    
    public static String buscarNombre (String numTarjeta) {
    
        String busquedaNombre = null;
        Connection conexion = null;
        
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = ("SELECT nombre, apellidos FROM cliente WHERE numero_tarjeta = '" + numTarjeta + "'");
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                busquedaNombre = (nombre + " " + apellidos);
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return busquedaNombre;
    }
}
