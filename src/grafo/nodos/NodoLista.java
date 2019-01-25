/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo.nodos;

/**
 *
 * @author Eduardo
 */
public class NodoLista {
    
    private NodoLista sig;
    private NodoA inicio;
    private Object date;

    public NodoLista(Object date) {
        this.date = date;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

    public NodoA getInicio() {
        return inicio;
    }

    public void setInicio(NodoA inicio) {
        this.inicio = inicio;
    }

 

  
    
    
    
}
