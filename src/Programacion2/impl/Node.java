package Programacion2.impl;

public class Node {
    private int value;
    private Node next;

    public Node() {
        next = null;
    }

    public void setNode(Node node) {
        next = node;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

}
