/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.listaCircular;


public class NodoListaCircular {
    private int valor;
    private NodoListaCircular sig;

    public NodoListaCircular() {
    }

    public NodoListaCircular(int valor, NodoListaCircular sig) {
        this.valor = valor;
        this.sig = sig;
    }
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoListaCircular getSig() {
        return sig;
    }

    public void setSig(NodoListaCircular sig) {
        this.sig = sig;
    }
}