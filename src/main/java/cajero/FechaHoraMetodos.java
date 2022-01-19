package cajero;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @date 15 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class FechaHoraMetodos {

    public static String hor, min, seg;
    Date fecha = new Date();
    
    public String fechaActual(){
        fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("DD/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    
    public void horaActual () {
        Calendar calendario = new GregorianCalendar();
        fecha = new Date();
        calendario.setTime(fecha);
        hor = 
            calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + 
            calendario.get(Calendar.HOUR_OF_DAY):"0" +
            calendario.get(Calendar.HOUR_OF_DAY)
        ;
        min = 
            calendario.get(Calendar.MINUTE) > 9 ? "" +
            calendario.get(Calendar.MINUTE) : "0" +
            calendario.get(Calendar.MINUTE)
        ;
        seg = 
            calendario.get(Calendar.SECOND) > 9 ? "" +
            calendario.get(Calendar.SECOND) : "0" +
            calendario.get(Calendar.SECOND)
        ;
    }
}
