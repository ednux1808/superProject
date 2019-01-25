/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.nodos;

/**
 *
 * @author imagensala1juarez
 */
public class NodoPila {
    
    private int dato;
    private String date;

    public String getDate() {
        return date;
    }
    //........
    /*
        Nombre de alumno
        Edad 
        Matricula
    */
    private NodoPila sig;

    
    // Polimersfimo
    // Dos Tipos de Constructor
    
    // Version 1 
    

    // Version 2

    public NodoPila() {
    }

    public NodoPila(int dato, NodoPila sig) {
        this.dato = dato;
        this.sig = sig;
    }
    
   public NodoPila(String date, NodoPila sig) {
        this.date = date;
        this.sig = sig;
    }
    
    
    public int getDato() {
        return dato;
    }

    public NodoPila getSig() {
        return sig;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setSig(NodoPila sig) {
        this.sig = sig;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
