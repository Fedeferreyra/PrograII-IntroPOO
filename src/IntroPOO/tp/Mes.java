package IntroPOO.tp;

/**
 * Created by fferr10 on 4/12/17.
 */
public class Mes {

    private Integer valor;

    public Mes(Integer valor) throws Exception {
        setValor(valor);
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) throws Exception {
        if(valor > 0 && valor < 13) {
            this.valor = valor;
        }else {
            throw new Exception("Valor de mes invalid");
        }
    }
}
