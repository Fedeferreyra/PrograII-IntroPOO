package Programacion2.impl;

import Programacion2.api.Queue;

public class QueueImpl implements Queue {

    int[] array;
    int index;
    int offset;

    public QueueImpl(){
        array = new int[100];
    }

    @Override
    public void add(int element) {
        array[index] = element;
        index++;
    }

    @Override
    public int poll() {
        int value = array[offset];
        array[offset++] = 0;
        return value;

    }

    @Override
    public boolean isEmpty() {
        return offset == index;
    }

    @Override
    public int peek() {
        return array[offset];
    }


}
