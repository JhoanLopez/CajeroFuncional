package cajero;

import java.sql.*;

/**
 * @date 19 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class ClienteCuentaMetodos {
    
    public String getNumeroCuenta(String nifCliente) {
        String buscarNumeroCuenta = null;
        Connection conexion = null;
        try {
            conexion = LogBasesDeDatos.getConectar();
            String sentenciaBuscar = "SELECT numero_cuenta FROM cliente_cuenta WHERE nif_cliente = '"
            + nifCliente + "'";
            var sentencia = conexion.prepareStatement(sentenciaBuscar);
            var resultado = sentencia.executeQuery();
            if (resultado.next()) {
                buscarNumeroCuenta = resultado.getString("numero_cuenta");
            } 
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar NUMERO CUENTA");
            System.out.println(ex);
        }
        return buscarNumeroCuenta;
    }
}
