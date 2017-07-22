package Programacion2.api;

public interface ABBTDA {
        public int raiz ();
        public ABBTDA hijoIzq ();
        public ABBTDA hijoDer ();
        public boolean arbolVacio();
        public void inicializarAbb();
        public void agregarElem (int x);
        public void eliminarElem (int x);
    }
