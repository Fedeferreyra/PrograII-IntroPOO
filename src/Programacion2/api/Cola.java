package Programacion2.api;


public interface Cola {

    // NO tiene precondiciones
    void inicializar();

    // tiene que estar inciilizada.
    void acolar(int element);

    // no tiene que estar vacia
    void desacolar();

    // tiene que estar inicializada
    boolean colaVacia();

    // tiene que estar inicializada y no tiene que estar vacia
    int primero();
}
