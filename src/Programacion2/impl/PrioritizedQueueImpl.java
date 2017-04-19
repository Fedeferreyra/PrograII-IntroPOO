package Programacion2.impl;


import Programacion2.api.PrioritizedQueue;

public class PrioritizedQueueImpl implements PrioritizedQueue {

    private int[] elements;
    private int[] priorities;
    private int index;

    public PrioritizedQueueImpl() {
        this.elements = new int[100];
        this.priorities = new int[100];
        this.index = 0;
    }

    @Override
    public void add(int element, int priority) {
        int i = index;
        for (; i > 0 && priorities[i - 1] >= priority; i--) {
            elements[i] = elements[i - 1];
            priorities[i] = priorities[i - 1];
        }
        elements[i] = element;
        priorities[i] = priority;
        index++;
    }

    @Override
    public int poll() {
        if (index >= 0) {
            return elements[index--];
        } else {
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public int peek() {
        return elements[index - 1];
    }

    @Override
    public int peekPriority() {
        return priorities[index - 1];
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public void print() {
        for (int i = 0; i < index; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print("\n");
            }
            System.out.print(elements[i] + ", " + priorities[i] + " | ");
        }
        System.out.println();
    }
}
