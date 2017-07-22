package Programacion2.impl;


import Programacion2.api.Conjunto;

public class ConjuntoEstatico implements Conjunto {
        int [] a;
        int indice;

    public void inicializarConjunto(){
        a = new int[100];
        indice = 0;
    }

    public boolean conjuntoVacio(){
        return (indice == 0);
    }

    public void agregar(int x){
        if(!this.pertenece(x)){
            a[indice]=x;
            indice++;
        }
    }

    public int elegir() {
        return a[indice-1];
    }

    public void sacar(int x){
        int i = 0;
        while(i<indice && a[i]!=x){
            i++;
        }
        if(i<indice){
            a[i] = a[indice -1];
            indice--;
        }
    }

    public boolean pertenece(int x){
        int i = 0;
        while( i < indice && a[i]!=x){
            i++;
        }
        return (i<indice);
    }
}
