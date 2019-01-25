/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.operaciones;

import estructurasLineales.nodos.NodoPila;

/**
 *
 * @author imagensala1juarez
 */
public class Pila {

    private NodoPila tope = null;

    public int stackTop() {
        return this.tope.getDato();
    }
    
    public boolean pushString(String valor){
     NodoPila nodo = new NodoPila(valor, null);
     
     if(tope == null){
         this.tope = nodo;
     }else{
         nodo.setSig(nodo);
         this.tope = nodo;
     }
        
        
    return true;
    }
    
    

    /*
        
     */
    public boolean push(int valor) {
        // Creamos Nodo
        NodoPila nodo = new NodoPila(valor, null);

        // Verifi
        if (tope == null) {
            this.tope = nodo;
        } else {
            nodo.setSig(this.tope);
            this.tope = nodo;
        }

        return true;
    }

    public String printStack() {

        NodoPila temp = this.tope;
        String contenido = "";

        while (temp != null) {
            contenido += temp.getDato() + "->";
            temp = temp.getSig();
        }

        return contenido;

    }

    public int pop() {
        int valor = this.tope.getDato();

        this.tope = this.tope.getSig();

        return valor;
    }

    public boolean isEmply() {
        return this.tope == null;
    }

    public Pila() {
    }

    public NodoPila getTope() {
        return tope;
    }

    public void setTope(NodoPila topen) {
        this.tope = topen;
    }

//    public static void main(String args[]) {
//        Pila pila = new Pila();
//
//        pila.push(10);
//        pila.push(8);
//        pila.push(6);
//
//        System.out.println("" + pila.stackTop());
//        System.out.println("" + pila.pop());
//        System.out.println("Estado pila " + pila.isEmply());
//        System.out.println("" + pila.printStack());
//    }

}
