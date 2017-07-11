package Programacion2.api;


public interface Cola {

    void acolar(int element);
    void inicializar();
    void desacolar();
    boolean colaVacia();
    int primero();
}
