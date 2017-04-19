package IntroPOO.tp;


public class Dia {
    private Integer valor;

    public Dia(Integer valor) throws Exception {
        setValor(valor);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) throws Exception {
        if(valor > 0 && valor < 32) {
            this.valor = valor;
        }else {
            throw new Exception("Valor de dia invalido");
        }
    }

}
