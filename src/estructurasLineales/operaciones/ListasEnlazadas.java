/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.operaciones;

import java.util.LinkedList;

/**
 *
 * @author ednux
 */
public class ListasEnlazadas {
    
    private LinkedList lista = new LinkedList();

    
    public void insertar(Object e){
        this.lista.add(e);
    }
    
    public void insertarEspecifico(Object i,Object e){
        this.lista.add((int) i, e);
    }
    
    public void insertarInicio(Object e){
        this.lista.addFirst(e);
    }
    
    public void insertarFinal(Object e){
        this.lista.addLast(e);
    }
    
    
    public String imprimir(){
        String s = "";
        for(int i= 0; i <= this.lista.size(); i++){
            s += this.lista.get(i)+"->";
        }
        return s;
    }
    
    public String ultimo(){
        String t = "";
        return t = (String) this.lista.getLast();
    }
    
    public String primero(){
        String a = "";
        return a = (String) this.lista.getFirst();
    }
    
    public void eliminar(Object i){
        this.lista.remove(i);
    }
    public void eliminarInicio(){
        this.lista.removeFirst();
    }
    
    public void eliminarFinal(){
        this.lista.removeLast();
    }
    
    
    
    
    
    public ListasEnlazadas() {
    }

    
    public LinkedList getLista() {
        return lista;
    }

    public void setLista(LinkedList lista) {
        this.lista = lista;
    }
    
    
    
}
