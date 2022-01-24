package cajero;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @date 19 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class CuentaMetodos {
    
    public String getFechaUltimaOperacion(String numeroCuenta) {
        String buscarUltimaModificacion = null;
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT fecha_ultima_modificacion FROM cuenta WHERE numero = '" + 
            numeroCuenta + "'";
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                buscarUltimaModificacion = resultado.getString("fecha_ultima_modificacion");
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar ULTIMA OPERACION");
            System.out.println(ex);
        }
        return buscarUltimaModificacion;
    }
    
    public String getSaldo(String numeroCuenta) {
        String buscarSaldo = null;
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT saldo FROM cuenta WHERE numero = '" + 
            numeroCuenta + "'";
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                buscarSaldo = resultado.getString("saldo");
            }
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar ULTIMA OPERACION");
            System.out.println(ex);
        }
        return buscarSaldo;
    }
    
    public void actualizarSaldoIngreso (String numeroCuenta, Integer importe) {
    
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            int saldoActualizado = Integer.valueOf(this.getSaldo(numeroCuenta))  + importe;
            System.out.println("A ver si actualiza el saldo " + saldoActualizado);
            String sentenciaBuscar = "UPDATE cuenta SET saldo = '" +
            saldoActualizado + "', fecha_ultima_modificacion = now() WHERE numero = '" + numeroCuenta + "'" ;
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar ULTIMA OPERACION");
            System.out.println(ex);
        }
    }
    
    public void actualizarSaldoRetiro (String numeroCuenta, Integer importe) {
    
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            int saldoActualizado = Integer.valueOf(this.getSaldo(numeroCuenta))  - importe;
            System.out.println("A ver si actualiza el saldo " + saldoActualizado);
            String sentenciaBuscar = "UPDATE cuenta SET saldo = '" +
            saldoActualizado + "', fecha_ultima_modificacion = now() WHERE numero = '" + numeroCuenta + "'" ;
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar ULTIMA OPERACION");
            System.out.println(ex);
        }
    }

}
