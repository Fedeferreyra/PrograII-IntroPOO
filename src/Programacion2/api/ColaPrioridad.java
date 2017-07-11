package Programacion2.api;


public interface ColaPrioridad {

    void acolarPrioridad(int element, int priority);
    int desacolar();
    boolean colaVacia();
    int primero();
    int prioridad();
    void inicializar();
}
