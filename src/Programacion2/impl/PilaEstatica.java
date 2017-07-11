package Programacion2.impl;

import Programacion2.api.Pila;

public class PilaEstatica implements Pila {

    private int[] array;
    private int index;

    public void inicializar() {
        array = new int[20];
        index = 0;
    }

    public void apilar(int element) {
        array[index] = element;
        index++;
    }

    public void desapilar() {
        if (!pilaVacia()) {
            index--;
        }
    }

    public boolean pilaVacia() {
        return index == 0;
    }

    public int tope(){
        return array[index-1];
    }

    public int size() {
        return index;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public String toString() {
        return String.valueOf(array[index]);
    }
}
