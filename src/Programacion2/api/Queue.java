package Programacion2.api;


public interface Queue {

    void add(int element);
    void initialize();
    void poll();
    boolean isEmpty();
    int peek();
}
