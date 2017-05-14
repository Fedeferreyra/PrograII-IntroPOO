package Programacion2.api;


public interface PrioritizedQueue {

    void add(int element, int priority);
    int poll();
    boolean isEmpty();
    int peek();
    int peekPriority();
    int size();
    void print();
    void initialize();
}
