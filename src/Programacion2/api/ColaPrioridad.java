package Programacion2.api;


public interface ColaPrioridad {
    // tiene que estar inicializada
    void acolarPrioridad(int element, int priority);
    // no tiene que estar vacia.
    void desacolar();
    // tiene que estar incializada.
    boolean colaVacia();
    // No tiene que estar vacia.
    int primero();
    // No tiene que estar vacia.
    int prioridad();
    // NO tiene precondiciones.
    void inicializar();
}
