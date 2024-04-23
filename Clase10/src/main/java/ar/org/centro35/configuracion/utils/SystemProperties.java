package ar.org.centro35.configuracion.utils;

import java.net.InetAddress;
import java.util.Calendar;
import java.time.LocalDate;

public class SystemProperties {
    
    public static String getSO(){
        return  System.getProperty("os.name")+", "+
                System.getProperty("os.version")+", "+
                System.getProperty("os.arch");
    }

public static String getUserLanguaje(){
    return System.getProperty("user.language")+" ("+System.getProperty("user.country")+")";
}

    public static String getJava(){
        return  System.getProperty("java.vm.vendor")+", "+
                System.getProperty("java.vm.name")+", "+
                System.getProperty("java.vm.version");
    }

    public static String getUser(){
        return  System.getProperty("user.name");
    }

    public static String getLocation(){
        return Calendar
                        .getInstance()
                        .getTimeZone()
                        .getID()
                        .replace("/", " ")
                        .replace("_", " ");
    }

    // public static String getTime(){
    //     return  Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+":"+
    //             Calendar.getInstance().get(Calendar.MINUTE)+":"+
    //             Calendar.getInstance().get(Calendar.SECOND);
    // }

    public static String getDate(){
        return LocalDate.now().toString();
    }

    public static String getIP(){
        String ip="";
        try {
            ip=InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            System.out.println(e);
        }
        return ip;
    }

}
