import java.math.BigDecimal;

public class CuentaBancaria {
    private BigDecimal saldo;
    private String cliente;

    public CuentaBancaria(Integer saldo) {
        this.saldo = new BigDecimal(null != saldo ? 0 : saldo);
    }


    public void debitar(BigDecimal monto){
        saldo.subtract(monto);
    }

    public void depositar(BigDecimal monto){
        saldo.add(monto);
    }

    public String imprimirEstado(){
        return "El saldo actual de la cuenta es: " + saldo.toString();
    }
}
