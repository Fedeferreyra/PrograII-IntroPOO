package Programacion2.ejercicios.tp2;

import Programacion2.api.Conjunto;

public class EJ6 {

    public void Interseccion(Conjunto C1, Conjunto C2, Conjunto ConjuntoInterseccion){
        int elemento;
        while(!C1.conjuntoVacio()){
            elemento =  C1.elegir();
            if(C2.pertenece(elemento)) {
                ConjuntoInterseccion.agregar(elemento);
            }
            C1.sacar(elemento);
        }
    }

    public void Union(Conjunto C1, Conjunto C2, Conjunto ConjuntoUnion){
        int elemento;
        while(!C1.conjuntoVacio()){
            elemento = C1.elegir();
            ConjuntoUnion.agregar(elemento);
            C1.sacar(elemento);
        }
        while(!C2.conjuntoVacio()) {
            elemento = C2.elegir();
            if(!ConjuntoUnion.pertenece(elemento)){
                ConjuntoUnion.agregar(elemento);
                C2.sacar(elemento);
            }
        }
    }

    public void Diferencia(Conjunto C1, Conjunto C2, Conjunto ConjuntoDiferencia){
        int elemento;
        while(!C1.conjuntoVacio()){
            elemento = C1.elegir();
            if(!C2.pertenece(elemento)){
                ConjuntoDiferencia.agregar(elemento);
            }
            C1.sacar(elemento);
        }
    }
}
