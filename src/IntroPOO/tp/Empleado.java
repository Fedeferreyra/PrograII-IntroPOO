package IntroPOO.tp;

public abstract class Empleado {

    protected Empresa empresa;
    protected ParteDeTrabajo parteDeTrabajo;

    public abstract void trabajar(Integer horas, Integer dias);

    public abstract Integer calcularSaldo(Integer mes, Integer año);

    public abstract Float costoTotal();
}
