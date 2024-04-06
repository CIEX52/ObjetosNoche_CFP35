package lab.ciex.cfp35.Clase05.test;

import lab.ciex.cfp35.Clase05.entities.Cuenta;

public class TestCuenta {
    public static void main(String[] Args){
        
        System.out.println(" --- Test Cuenta1 --- ");
        Cuenta cuenta1 = new Cuenta(1001,"ar$");
        System.out.println(cuenta1);

        cuenta1.depositar(65000);
        cuenta1.depositar(35000);
        cuenta1.debitar(50000, "ar$");
        cuenta1.debitar(50000, "ar$");
        cuenta1.debitar(50000, "ar$");
    }
    
}
