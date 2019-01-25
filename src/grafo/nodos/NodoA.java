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
public class NodoA {
    
    private Object date;
    private NodoA sig;

    public NodoA(Object date) {
        this.date = date;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }


    
    
    
    
}
