/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.operaciones;

import estructurasLineales.nodos.NodoLE;

/**
 *
 * @author ednux
 */
public class ListaE {

    private NodoLE cabeza;
    private int size = 0;

    public ListaE() {
        this.cabeza = null;
        this.size = 0;
    }

    public Object obtener(int index) {
        int contador = 0;
        NodoLE temporal = this.cabeza;
        while (contador < index) {
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }

    public String imprimirTodo() {
        String s = "";
        for (int i = 0; i >= this.size; i++) {
            s += obtener(i) + "->";
        }
        return s;
    }

    public String primero() {
        String p = "";
        return p = (String) obtener(0);
    }

    public String ultimo() {
        String u = "";
        return u = (String) obtener(size - 1);
    }

    public boolean estaVacia() {
        return this.cabeza == null;
    }

    public void addPrimero(Object e) {
        if (this.cabeza == null) {
            this.cabeza = new NodoLE(e);
        } else {
            NodoLE temp = this.cabeza;
            NodoLE nuevo = new NodoLE(e);
            nuevo.enlazarSiguiente(temp);
            this.cabeza = nuevo;

        }
        this.size++;
    }

    public void eliminarPrimero() {
        this.cabeza = this.cabeza.obtenerSiguiente();
        this.size--;
    }

    public void eliminar(int index) {
        // 1-> 2 -> 3 -> 4
        // 1->2 -> 4
        if (index == 0) {
            this.cabeza = this.cabeza.obtenerSiguiente();
        } else {
            int contador = 0;
            NodoLE temporal = this.cabeza;
            while (contador < index - 1) {
                temporal = temporal.obtenerSiguiente();
                contador++;
            }
            temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
        }
        size--;
    }

    public void cortar(int index) {
        // 1-> 2 -> 3 -> 4 -> 5
        // cortar 2: 1-> 2 
        int contador = 0;
        NodoLE temporal = this.cabeza;
        while (contador < index - 1) {
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        temporal.enlazarSiguiente(null);
        size = index;
    }

    public int size() {
        return this.size;
    }

    public NodoLE getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoLE cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
