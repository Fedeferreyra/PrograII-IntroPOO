package Programacion2.api;

public interface DiccionarioMultiple {

        void inicializarDiccionario () ;
        void agregar(int clave, int  valor);
        void eliminar(int clave);
        void eliminarValor(int clave, int valor);
        Conjunto recuperar(int clave);
        Conjunto claves();
}
