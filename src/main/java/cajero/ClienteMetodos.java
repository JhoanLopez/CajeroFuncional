package cajero;


import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

/**
 * @date 13 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class ClienteMetodos {
    

    public void setSoloNum(KeyEvent evt, JLabel info, JTextField cajaTexto, int num) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 127;
        if (!numeros) {
            evt.consume();
            info.setText("Este campo solo admite números");
        } else if (cajaTexto.getText().length() >= num) {
            evt.consume();   
            info.setText("Este campo admite máximo " + num + " números");
        }  else {
            info.setText("");
        }
    }

    public void setValidarNumTarjeta (KeyEvent evt, JLabel info, JTextField cajaTexto, int num) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57 || key == 8 || key == 127;
        if (!numeros) {
            evt.consume();
            info.setText("Este campo solo admite números");
        } else if (cajaTexto.getText().length() >= num) {
            evt.consume();   
            info.setText("Este campo admite máximo " + num + " números");
        } else if (
            cajaTexto.getText().length() == 4 ||
            cajaTexto.getText().length() == 11 ||
            cajaTexto.getText().length() == 18) {
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
            BienvenidoUsuarioPantalla segPantalla = new BienvenidoUsuarioPantalla();
            String sentIdentCliente = 
            ("SELECT bloqueada FROM tarjeta WHERE numero = '" +
            numTarjeta + "' && cvs = '" + cvs + "' && pin = '" + pin +"'");
            
            var sentencia = conexion.prepareStatement(sentIdentCliente);
            var resultado = sentencia.executeQuery();
            
            if (resultado.next()) {
                if (resultado.getString("bloqueada").equals("1")) {
                    busquedaUsuario = "Usuario encontrado";
                } else {
                    LoginPantalla login = new LoginPantalla();
                    busquedaUsuario = "Tarjeta Bloqueada";
                    JOptionPane.showMessageDialog(login, "Tarjeta Bloqueda");
                }
            } else {
                busquedaUsuario = "Usuario no encontrado";
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
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return busquedaNombre;
    }
    
    public String getBuscarNif(String numTarjeta) {
        
        String busquedaNif = null;
        Connection conexion =null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT nif FROM cliente WHERE numero_tarjeta = '"
            + numTarjeta + "'";
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                busquedaNif = resultado.getString("nif");   
            } 
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar NIF");
            System.out.println(ex);
        }
        return busquedaNif;
    }
}
