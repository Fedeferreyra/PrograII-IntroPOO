package Programacion2.ejercicios.tp2;

import Programacion2.api.Conjunto;
import Programacion2.impl.NodoConjunto;


/*
Implementar el TDA Conjunto con las siguientes restricciones
a) Tamaño máximo acotado
 */

public class EJ4A {
}

class ConjuntoEstaticoAcotado implements Conjunto {
    int [] a;
    int indice;

    /*
    Para estaticos, se puede agregar la cota en el constructor obligando a ser definida
    antes de inicializar el conjunto.
        */
    public void ConjuntoEstaticoAcotado(int cota) {
        a = new int[cota];
    }

    public void inicializarConjunto(){
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

public class ConjuntoDinamicoAcotado implements Conjunto {

    NodoConjunto primero;
    int cota;
    int tamano;

    // definir cota enel constructor;
    public ConjuntoDinamicoAcotado(int cota) {
        this.cota = cota;
    }

    // agregado Tamano = 0;
    public void inicializarConjunto(){
        tamano = 0;
        primero = null;
    }

    public boolean conjuntoVacio(){
        return (primero.sig == null);
    }

    // Metodo para saber si se llego al maximo tamano
    public boolean conjuntolleno() {return cota <= tamano;}

    public void agregar(int x){
        // Solo se puede agregar si el conjunto no esta lleno;
        if(!this.pertenece(x) && (!this.conjuntolleno())){
            NodoConjunto aux = new NodoConjunto();
            aux.info = x;
            aux.sig = primero;
            primero = aux;
            tamano++;
        }
    }

    public int elegir(){
        return primero.info;
    }

    public void sacar(int x){
        // se reduce cuando se saca un elemento.
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
            tamano--;
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


class ConjuntoEstaticoNoAcotado implements Conjunto {
    int [] a;
    int indice;
    int indexMax;

    public void inicializarConjunto(){
        indice = 0;
        indexMax = 100;
        a = new int[indexMax];
    }

    public boolean conjuntoVacio(){
        return (indice == 0);
    }

    public void agregar(int x){
        if(!this.pertenece(x)){
            /* si se quiere agregar y se llega al limite, hay que recrear todo lo que esta en a
                en un array mas grande.
            */
            if (indice == indexMax) {
                int [] aux = new int[indexMax * 2];
                for (int i = 0; i <= indexMax; i++){
                    aux[i] = a[i];
                }
                a = aux;
                indexMax = indexMax *2;
            }
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

class ConjuntoEstaticoUniversoAcotado implements Conjunto {
    int [] a;
    int indice;
    int cotaSuperior;
    int cotaInferior;

    public ConjuntoEstaticoUniversoAcotado(int cotaInferior, int cotaSuperior) {
        this.cotaInferior = cotaInferior;
        this.cotaSuperior = cotaSuperior;
    }
    public void inicializarConjunto(){
        a = new int[100];
        indice = 0;
    }

    public boolean conjuntoVacio(){
        return (indice == 0);
    }

    // Agregar nuevo metodo para ver si el elemento pertence al universo.
    public boolean perteneceAUniverso(int x) {
        return (x>cotaInferior && x<cotaSuperior);
    }

    public void agregar(int x){
        if(!this.pertenece(x) && perteneceAUniverso(x)){
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
