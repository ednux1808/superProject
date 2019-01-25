/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.nodos;

/**
 *
 * @authorednux1808
 */
public class NodoLE {
    
    private Object valor;
    private NodoLE siguiente;

    public NodoLE(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    public void enlazarSiguiente(NodoLE n){
        this.siguiente = n;
    }
    
    // return = null  termina la lista
    public NodoLE obtenerSiguiente(){
        return this.siguiente;
    }

    public Object obtenerValor(){
        return this.valor;
    }
    
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NodoLE getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLE siguiente) {
        this.siguiente = siguiente;
    }
    /*  Documentacion */
    /*
        NodoLE primer = new NodoLE("Ejemplo");
        NodoLE segundo = new NodoLE(8);
        NodoLE tercero = new NodoLE(44);
    
        primer.enlazarSiguiente(segundo);
        primer -> segundo 
          Ejemplo -> 8
        
        primer.obtenerSiguiente().enlazarSiguiente(tercero);
        primer -> segundo -> tercero
        Ejemplo -> 8 -> 44
    
        
    
    */
    
}
