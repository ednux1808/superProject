package aasOperation.aapp;

public class NodoArbol {

    private Object dato;
    private NodoArbol izq;
    private NodoArbol der;

    NodoArbol(Object valor) {
        dato = valor;
        izq = null;
        der = null;
    }
        
   

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }






}//fin clase NodoArbol
