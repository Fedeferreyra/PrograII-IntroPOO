import IntroPOO.CajaDeAhorro;
import IntroPOO.CuentaBancaria;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

    @Test
    public void test() throws Exception {

        CuentaBancaria cuentaBancaria = new CuentaBancaria(0, null, null);
        cuentaBancaria.depositar(1000);
        cuentaBancaria.debitar(300);

        assertEquals(cuentaBancaria.getSaldo(), 700);
    }

    @Test
    public void listaDeCuentas(){
        List<CajaDeAhorro> cajasDeAhorro = new ArrayList<>();
        int sumatoria = 0;
        for (int i = 0; i < 5; i++) {
            CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(0, "", 0L);
            cajaDeAhorro.depositar(1000);
            cajasDeAhorro.add(cajaDeAhorro);
        }
        for (CajaDeAhorro cajaDeAhorro :
                cajasDeAhorro) {
            sumatoria+=cajaDeAhorro.getSaldo();
        }

        assertEquals(5000, sumatoria);
    }
}