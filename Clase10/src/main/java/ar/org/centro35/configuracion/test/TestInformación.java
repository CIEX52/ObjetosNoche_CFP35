package ar.org.centro35.configuracion.test;

import java.net.InetAddress;
import java.util.Calendar;

public class TestInformación {
    public static void main(String[] args) {
        //Sistema Operativo
        System.out.println( System.getProperty("os.name")+", "+
                            System.getProperty("os.version")+", "+
                            System.getProperty("os.arch"));
        
        //Versión de Java
        System.out.println( System.getProperty("java.vm.vendor")+", "+
                            System.getProperty("java.vm.name")+", "+
                            System.getProperty("java.vm.version"));

        //User
        System.out.println( System.getProperty("user.name"));

        //Ubicación
        System.out.println(Calendar
                                    .getInstance()
                                    .getTimeZone()
                                    .getID()
                                    .replace("/", " ")
                                    .replace("_", " "));
        
        // Hora SO
        System.out.println(String.format("%d:%d:%d",
                                                Calendar.getInstance().get(Calendar.HOUR_OF_DAY),
                                                Calendar.getInstance().get(Calendar.MINUTE),
                                                Calendar.getInstance().get(Calendar.SECOND)));

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
