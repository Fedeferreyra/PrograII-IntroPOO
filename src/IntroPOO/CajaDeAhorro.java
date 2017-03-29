package IntroPOO;

public class CajaDeAhorro extends CuentaBancaria {

    public CajaDeAhorro(float saldo, String cliente, Long cbu) {
        super(saldo, cliente, cbu);
    }

    @Override
    public void debitar(float monto) throws Exception {
        if (saldo > monto) {
            saldo -= monto;
        } else {
            throw new Exception("No tiene ese cantidad de dinero en su caja de ahorro");
        }
    }
}
