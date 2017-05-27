package Programacion2.impl;

import Programacion2.api.Stack;

public class DynamicStack implements Stack{
    private Node top;


    public void initialize() {
        top = null;
    }

    public void push(int element) {
        Node aux = new Node();
        aux.setValue(element);
        if (!this.isEmpty()) {
            aux.setNode(top);
        }
        top = aux;
    }

    @Override
    public void pop() {
        Node previewsTop = top;
        top = top.getNext();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.getValue();
    }

    public int size() {
       return innerNodes(this.top);
    }

    private int innerNodes(Node innerNode) {
        if (innerNode.getNext() != null) {
            return 1 + innerNodes(innerNode.getNext());
        } else {
            return 1;
        }
    }

    public void print() {
        System.out.print(this.innerValue(top));
    }

    private String innerValue(Node node) {
       if (node.getNext() != null) {
           return Integer.toString(node.getValue()) + ' ' +  this.innerValue(node.getNext());
       } else {
           return Integer.toString(node.getValue());
       }
    }
}
