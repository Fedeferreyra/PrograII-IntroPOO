package Programacion2.impl;

import Programacion2.api.Stack;

public class StackImpl implements Stack {

    private int[] array;
    private int index;

    public void initialize() {
        array = new int[20];
        index = 0;
    }

    public void push(int element) {
        array[index] = element;
        index++;
    }

    public int pop() {
        if (!isEmpty()) {
            index--;
            return array[index];
        }
        return 0;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int peek(){
        return array[index];
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

    @Override
    public String toString() {
        return String.valueOf(array[index]);
    }
}
