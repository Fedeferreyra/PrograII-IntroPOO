package Programacion2.impl;

import Programacion2.api.Pila;

public class DynamicPila implements Pila {
    private Node top;


    public void inicializar() {
        top = null;
    }

    public void apilar(int element) {
        Node aux = new Node();
        aux.setValue(element);
        if (!this.pilaVacia()) {
            aux.setNode(top);
        }
        top = aux;
    }

    @Override
    public void desapilar() {
        Node previewsTop = top;
        top = top.getNext();
    }

    public boolean pilaVacia() {
        return top == null;
    }

    public int tope() {
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
