package Programacion2.impl;

import Programacion2.api.Queue;

public class QueueImpl implements Queue {

    int[] elementos;
    int index;

    public void add(int element) {
        elementos[index] = element;
        index++;
    }

    public void initialize() {
        elementos = new int[100];
    }

    public void poll() {
        int toReturn = elementos[0];
        for (int i = 1; i < index; i++) {
            elementos[i-1] = elementos[i];
        }
        index--;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int peek() {
        return elementos[0];
    }

    public int size() {
        return index;
    }


    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.print(elementos[i] + " ");
        }
    }
}
