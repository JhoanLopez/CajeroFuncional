package cajero;

import java.sql.Connection;
import java.sql.SQLException;

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
            System.out.println("Antes del if");
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
}
