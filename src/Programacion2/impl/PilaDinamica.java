package Programacion2.impl;

import Programacion2.api.Pila;

public class PilaDinamica implements Pila {
    Nodo primero;

    public void inicializar() {
        primero = null;
    }

    public void apilar(int x) {
        Nodo aux = new Nodo();
        aux.info = x;
        aux.siguiente = primero;
        primero = aux;
    }

    public void desapilar() {
        primero = primero.siguiente;
    }

    public boolean pilaVacia() {
        return (primero == null);
    }

    public int tope() {
        return primero.info;
    }
}

