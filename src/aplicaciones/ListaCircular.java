/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslineales.nodos;

/**
 *
 * @author imagensala1juarez
 */
public class ListaCircular {
    private int valor;
    private ListaCircular sig;

    public ListaCircular() {
    }

    public ListaCircular(int valor, ListaCircular sig) {
        this.valor = valor;
        this.sig = sig;
    }
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ListaCircular getSig() {
        return sig;
    }

    public void setSig(ListaCircular sig) {
        this.sig = sig;
    }
}
