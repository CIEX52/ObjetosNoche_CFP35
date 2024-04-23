package ar.org.centro35.configuracion.test;

import java.net.InetAddress;
import java.util.Calendar;
import java.time.LocalDate;

public class TestInformación {
    public static void main(String[] args) {
        //Sistema Operativo
        System.out.println( System.getProperty("os.name")+", "+
                            System.getProperty("os.version")+", "+
                            System.getProperty("os.arch"));
        
        // Lenguaje de Usuario
        System.out.println(System.getProperty("user.language")+" ("+System.getProperty("user.country")+")");

        //Versión de Java
        System.out.println( System.getProperty("java.vm.vendor")+", "+
                            System.getProperty("java.vm.name")+", "+
                            System.getProperty("java.vm.version"));

        //User
        System.out.println( System.getProperty("user.name"));

        Calendar calendar = Calendar.getInstance();
        //Ubicación
        System.out.println(calendar
                                    .getTimeZone()
                                    .getID()
                                    .replace("/", " ")
                                    .replace("_", " "));
        
        // // Hora SO
        // System.out.println(String.format("%d:%d:%d",
        //                                         calendar.get(Calendar.HOUR_OF_DAY),
        //                                         calendar.get(Calendar.MINUTE),
        //                                         calendar.get(Calendar.SECOND)));

        // Fecha con java.time.LocalDate
        System.out.println(LocalDate.now());

        //IP
        String ip="";
        try {
            ip=InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(ip);

        
    }
}
