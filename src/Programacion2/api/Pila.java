package Programacion2.api;

public interface Pila {

    // No tiene precondiciones
    void inicializar();

    // la pila tiene que estar inicializada
    void apilar(int element);

    // la pila no tiene que estar vacia.
    void desapilar();

    //la pila tiene que estar inicializada
    boolean pilaVacia();

    // La pila no tiene que estar vacia.
    int tope();
}
