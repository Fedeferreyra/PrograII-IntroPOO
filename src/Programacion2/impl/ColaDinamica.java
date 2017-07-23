package Programacion2.impl;

import Programacion2.api.Cola;

public class ColaDinamica implements Cola  {
    Nodo primero;
    Nodo ultimo;
    public void inicializar () {
        primero = null ;
        ultimo = null;
    }
    public void acolar(int element) {
        Nodo aux = new Nodo();
        aux.info = element;
        aux.siguiente = null;
        if(ultimo != null) {
            ultimo.siguiente = aux;
            ultimo = aux;
        }
        if (primero == null) {
            primero = ultimo;
        }
    }

    public void desacolar() {
        primero = primero.siguiente;
        if (primero == null) {
            ultimo = null;
        }

    }

    public boolean colaVacia() {
        return ultimo == null;
    }

    public int primero() {
        return primero.info;
    }
}