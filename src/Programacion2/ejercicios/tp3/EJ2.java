package Programacion2.ejercicios.tp3;

import Programacion2.api.Cola;
import Programacion2.api.Conjunto;
import Programacion2.api.Pila;
import Programacion2.impl.ColaDinamica;
import Programacion2.impl.ColaEstatica;
import Programacion2.impl.ConjuntoDinamico;
import Programacion2.impl.PilaDinamica;

/**
 * Created by mariano on 21/07/17.
 */
public class EJ2 {

    public void sacarRepetidos(Cola c) {
        Cola colaAux = new ColaDinamica();
        Conjunto conjuntoAux = new ConjuntoDinamico();
        colaAux.inicializar();
        conjuntoAux.inicializarConjunto();

        while (!c.colaVacia()) {
            if (!conjuntoAux.pertenece(c.primero())) {
                conjuntoAux.agregar(c.primero());
                colaAux.acolar(c.primero());
            }
            c.desacolar();
        }
        while (!colaAux.colaVacia()) {
            c.acolar(colaAux.primero());
            colaAux.desacolar();
        }
    }


    public void repartirCola(Cola c) {
        Cola cola1 = new ColaDinamica();
        Cola cola2 = new ColaEstatica();
        Cola cola3 = new ColaDinamica();
        cola1.inicializar();
        cola2.inicializar();
        cola3.inicializar();

        int contador = 0;
        while(!c.colaVacia()) {
            cola1.acolar(c.primero());
            contador++;
            c.desacolar();
        }

        for (int i = 0; i<contador ; i++) {
            if (i < contador/2) {
                cola2.acolar(c.primero());
            } else {
                cola3.acolar(c.primero());
            }
            cola1.desacolar();
        }
    }


    public void conjuntoRepetidos(Cola c) {
        Conjunto conjuntoUnicos = new ConjuntoDinamico();
        Conjunto conjuntoRepetidos = new ConjuntoDinamico();
        conjuntoRepetidos.inicializarConjunto();
        conjuntoUnicos.inicializarConjunto();

        while (!c.colaVacia()) {
            if(conjuntoUnicos.pertenece(c.primero())) {
                conjuntoRepetidos.agregar(c.primero());
            } else {
                conjuntoUnicos.agregar(c.primero());
            }
            c.desacolar();
        }
    }
}

