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
        float avg = avg(pila, 0, 0);
        System.out.println("Los valores de la pila son: " + avg);
    }

    private static float avg(Pila pila, float suma, float counter) {
        if (!pila.pilaVacia()) {
            suma += pila.tope();
            pila.desapilar();
            return avg(pila, suma, ++counter);
        } else {
            return counter > 0 ? suma/counter : 0;
        }
    }
}
