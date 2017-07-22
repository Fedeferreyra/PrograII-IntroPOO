package Programacion2.ejercicios.tp1;

import Programacion2.Utils;
import Programacion2.api.Pila;
import Programacion2.impl.PilaEstatica;

//Calcular el promedio de los elementos de una Pila
public class Ejercicio2F {

    public static void main(String[] args) {
        Pila pila = new PilaEstatica();
        pila.inicializar();
        Utils.fillStack(pila, 5);

        System.out.println("Los valores de la pila son: ");
        Utils.printStaticStack(pila);
        float avg = avg(pila);
        System.out.println("Los valores de la pila son: " + avg);
    }

    private static float avg(Pila pila) {
        int count = 0;
        int suma = 0;
        while (!pila.pilaVacia()) {
            suma += pila.tope();
            count++;
            pila.desapilar();
        }
        return suma/count;
    }
}
