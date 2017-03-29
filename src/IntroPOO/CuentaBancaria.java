package IntroPOO;

public class CuentaBancaria {
    protected float saldo;
    protected String cliente;
    protected Long cbu;

    public CuentaBancaria(float saldo, String cliente, Long cbu) {
        this.saldo = saldo;
        this.cliente = cliente;
        this.cbu = cbu;
    }


    public void debitar(float monto) throws Exception {
        saldo -= monto;
    }

    public void depositar(float monto) {
        saldo += monto;
    }

    public float getSaldo() {
        return saldo;
    }
}
