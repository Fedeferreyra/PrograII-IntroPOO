package Programacion2.impl;

import Programacion2.api.Queue;

public class QueueImpl implements Queue {

    // puto le clavaste array de nombre.
    // Pongamosle elements te parece ?
    int[] array;
    int index;

    @Override
    public void add(int element) {
        array[index] = element;
        index++;
    }

    @Override
    public void initialize() {
        array = new int[100];
    }

    @Override
    public int poll() {
        int toReturn = array[0];
        for (int i = 1; i < index; i++) {
            array[i-1] = array[i];
        }
        index--;

        return toReturn;
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public int peek() {
        return array[0];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public void print() {

        for (int i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
