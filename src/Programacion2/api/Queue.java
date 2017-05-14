package Programacion2.api;


public interface Queue {

    void add(int element);
    void initialize();
    int poll();
    boolean isEmpty();
    int peek();
    int size();
    void print();
}
