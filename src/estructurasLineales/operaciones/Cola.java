/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.operaciones;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ednux
 */
public class Cola {

   private Queue cola;

    public Cola() {
        this.cola = new LinkedList();
    }
   
    public void insertar(Object e){
        this.cola.offer(e);
    }
    
    public void eliminar(){
        this.cola.poll();
    }
    
    public Object primero(){
        return this.cola.peek();
    }
    
    public String mostrarTodos(){
        String s = "";
        Iterator d = cola.iterator();
        while (d.hasNext()) {
            s += d.next() + "->";
        }
        return s;
    }
    public String ultimo(){
        String u = "";
        Iterator f = cola.iterator();
        while (f.hasNext()) {
            u = (String) f.next() ;
            
        }
        return u;
    }

}
