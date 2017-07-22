package Programacion2.ejercicios.tp3;

import Programacion2.api.Cola;
import Programacion2.api.Conjunto;
import Programacion2.api.Pila;
import Programacion2.impl.ConjuntoDinamico;
import Programacion2.impl.PilaDinamica;

public class EJ3 {

    public static Conjunto diferenciaSimetrica(Conjunto A, Conjunto B) {
        Conjunto resultado = new ConjuntoDinamico();
        while (!A.conjuntoVacio()) {
            int elemento = A.elegir();
            if (!B.pertenece(elemento)) {
                resultado.agregar(elemento);
            }else{
                B.sacar(elemento);
            }
            A.sacar(elemento);
        }
        while (!B.conjuntoVacio()) {
            int elemento = B.elegir();
            resultado.agregar(elemento);
            B.sacar(elemento);
        }
        return resultado;
    }

    public boolean conjuntosIguales(Conjunto c1, Conjunto c2) {
        boolean igualdad = true;
        while (!c1.conjuntoVacio() && !c2.conjuntoVacio() && igualdad) {
            int elemento = c1.elegir();
            if (c2.pertenece(elemento)) {
                c2.sacar(elemento);
                c1.sacar(elemento);
            } else {
                igualdad = false;
            }
        }
        return c1.conjuntoVacio() && c2.conjuntoVacio() && igualdad;
    }


    public int cardinalidad(Conjunto c) {
        int contador = 0;
        Pila p = new PilaDinamica();
        p.inicializar();
        while (!c.conjuntoVacio()) {
            int elemnto = c.elegir();
            p.apilar(elemnto);
            c.sacar(elemnto);
            contador++;
        }
        // Volver el conjunto al estado original.
        while (!p.pilaVacia()) {
            c.agregar(p.tope());
            p.desapilar();
        }
        return contador;
    }

    public Conjunto conjuntoPilaCola(Pila p, Cola c) {
        Conjunto aux1 = new ConjuntoDinamico();
        Conjunto aux2 = new ConjuntoDinamico();
        aux1.inicializarConjunto();
        aux2.inicializarConjunto();
        // Filtrar repetidos de la pila en conjunto
        while(!p.pilaVacia()) {
            if (!aux1.pertenece(p.tope())) {
                aux1.agregar(p.tope());
            }
            p.desapilar();
        }
        // Filtrar repetidos de la cola en conjunto
        while(c.colaVacia()) {
            if(!aux2.pertenece(c.primero())) {
                aux2.agregar(c.primero());
            }
            c.desacolar();
        }
        Conjunto conjuntoFinal = new ConjuntoDinamico();
        conjuntoFinal.inicializarConjunto();
        // pasar los elementos del conjunto pilaFiltrado al conjunto final
        while(!aux1.conjuntoVacio()) {
            int n = aux1.elegir();
            if(conjuntoFinal.pertenece(n)) {
                conjuntoFinal.agregar(n);
            }
            aux1.sacar(n);
        }
        //  pasar los elementos del conjunto ColaFiltrado al conjunto final
        while(!aux2.conjuntoVacio()) {
            int n = aux2.elegir();
            if(conjuntoFinal.pertenece(n)) {
                conjuntoFinal.agregar(n);
            }
            aux1.sacar(n);
        }
        return conjuntoFinal;
    }

    public boolean mismosElementos(Pila p, Cola c) {
        Conjunto aux = new ConjuntoDinamico();
        while(!p.pilaVacia()) {
            if(!aux.pertenece(p.tope())) {
                aux.agregar(p.tope());
            }
            p.desapilar();
        }
        boolean igualdad = true;
        while (!c.colaVacia() && igualdad) {
            if (!aux.pertenece(c.primero())) {
                igualdad = false;
            } else {
                c.desacolar();
            }
        }
        return igualdad;
    }
}
