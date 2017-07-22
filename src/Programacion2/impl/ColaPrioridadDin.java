package Programacion2.impl;

import Programacion2.api.ColaPrioridad;

public class ColaPrioridadDin implements ColaPrioridad {

    NodoPrioridad mayorPrioridad;

    public void inicializar(){
        mayorPrioridad = null;
    }

    public void acolarPrioridad(int x, int prioridad){
        NodoPrioridad nuevo = new NodoPrioridad();
        nuevo.info = x;
        nuevo.prioridad = prioridad;

        if(mayorPrioridad==null || nuevo.prioridad > mayorPrioridad.prioridad){
            nuevo.sig = mayorPrioridad;
            mayorPrioridad = nuevo;
        } else{
            NodoPrioridad aux = mayorPrioridad;

            while(aux.sig != null && aux.sig.prioridad >= prioridad){
                aux = aux.sig;
            }
            nuevo.sig = aux.sig ;
            aux.sig = nuevo;
        }
    }

    public void desacolar(){
        mayorPrioridad = mayorPrioridad.sig;
    }

    public int primero(){
        return mayorPrioridad.info;
    }

    public boolean colaVacia(){
        return (mayorPrioridad == null);
    }

    public int prioridad(){
        return mayorPrioridad.prioridad;
    }
}