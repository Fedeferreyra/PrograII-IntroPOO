package Programacion2.impl;

import Programacion2.api.Conjunto;

public class ConjuntoDinamico implements Conjunto {
    NodoConjunto primero;

    public void inicializarConjunto(){
        primero = null;
    }

    public boolean conjuntoVacio(){
        return (primero.sig == null);
    }

    public void agregar(int x){
        if(!this.pertenece(x)){
            NodoConjunto aux = new NodoConjunto();
            aux.info = x;
            aux.sig = primero;
            primero = aux;
        }
    }

    public int elegir(){
        return primero.info;
    }

    public void sacar(int x){
        if (primero!= null ){
            if (primero.info == x) {
                primero = primero.sig ;
            } else {
                NodoConjunto aux = primero;
                while (aux.sig!=null && aux.sig.info!=x){
                    aux = aux.sig;
                }
                if (aux.sig != null ){
                    aux.sig = aux.sig.sig;
                }
            }
        }
    }

    public boolean pertenece(int x){
        NodoConjunto aux = primero;
        while (aux.sig!=null && aux.info!=x){
            aux = aux.sig;
        }
        return (aux.sig != null );
    }
}
