/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.nodos;

/**
 *
 * @author ednux
 */
public class Nodo {
    
    private int dato = 0;
    private Nodo siguiente;

    public Nodo() {
      
    }

       public void enlazarSiguiente(Nodo n){
        this.siguiente = n;
    }
    
    
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
