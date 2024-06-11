package ar.org.centro35.colegio.test;

import java.net.InetAddress;
import java.time.LocalDate;
import java.util.Calendar;

import ar.org.centro35.colegio.utils.SystemProperties;

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
        
        //IP
        String ip="";
        try {
            ip=InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(ip);

        System.out.println(System.getProperty("user.language"));
        System.out.println(System.getProperty("user.country"));
        System.out.println(LocalDate.now().toString().replace("-", "/"));

        System.out.println(SystemProperties.getDate());
        System.out.println(SystemProperties.getLanguage());
        
    }
}
