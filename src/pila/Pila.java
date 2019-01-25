/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author ednux
 */
public class Pila {

    private int n;
    private int tope;
    private Object pila[];

    public Pila() {
        this.n = 100;
        this.tope = 0;
        this.pila = new Object[n];
    }

    public boolean estaVacia() {
        return this.tope == 0;
    }

    public boolean estallena() {
        return this.tope == n;
    }

    public boolean apilar(Object dato) {
        if (estallena()) {
            return false;
        }
        this.pila[tope] = dato;
        this.tope++;
        return true;
    }

    public Object desapilar() {
        if (estaVacia()) {

            return null;
        }
        this.tope--;
        return this.pila[tope];
    }

    public Object elementoTope() {
        return pila[tope - 1];
    }

    public int getN() {
        return n;
    }

    public int getTope() {
        return tope;
    }

    public Object[] getPila() {
        return pila;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void setPila(Object[] pila) {
        this.pila = pila;
    }
}
