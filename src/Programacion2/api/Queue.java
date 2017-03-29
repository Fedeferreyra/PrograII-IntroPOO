package Programacion2.api;


public interface Queue {

    void add(int element);
    int poll();
    boolean isEmpty();
    int peek();
    int size();
    void print();
}
