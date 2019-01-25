/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasLineales.operaciones;

import estructurasLineales.nodos.Nodo;
import javax.swing.JOptionPane;

/**
 *
 * @authorednux1808
 */
public class ListaOrden {

    

    private Nodo inicio = null;

    // Nos muestra el dato principal
    public int first() {
        if(estaVacia()){
            return 0;
        }else{
        Nodo aux = getInicio();
        return aux.getDato();
    }}

    // Nos imprime todo lo que esta en la Lista
    public String mostrar() {
        Nodo aux = inicio;
        String n = "";
        while (aux != null) {
            n += aux.getDato() + "->";
            //temp = temp.getSig();
            aux = aux.getSiguiente();
        }
        return n;
    }

    // Verfica si la Lista esta vacia
    public boolean estaVacia() {
        return this.inicio == null;
    }
    
    //Obtine el numero que esta en el espacio que se le manda
    /*
    numero de casilla   0,1,2,3 // este es numero de la casilla empieza desde el cero
        ejemplo lista = 1,4,5,8 // estos son los datos guardados en la lista
        
    */
    public Object obtener(int index) {
    //index es el numero de casilla
        int contador = 0;
        Nodo temporal = this.inicio;
        while (contador < index) {
            temporal = temporal.getSiguiente();
            contador++;
        }
        return temporal.getSiguiente();
    }
    
     public void eliminar(int index) {
        // 1-> 2 -> 3 -> 4
        // 1->2 -> 4
        if(index == -99){
            JOptionPane.showMessageDialog(null,"Error el dato No existe");
        }else{
        if (index == 0) {
            this.inicio = this.inicio.getSiguiente();
        } else {
            int contador = 0;
            Nodo temporal = this.inicio;
            while (contador < index - 1) {
                temporal = temporal.getSiguiente();
                contador++;
            }
            temporal.setSiguiente(temporal.getSiguiente().getSiguiente());
        }
        }
    }
     
    
   // elimina solo un dato de la lista empieza a eliminar desde el princio hasta el fin
    public int eliminarDato() {
        int valor = this.inicio.getDato();
        if (estaVacia()==true) {
            System.out.println("error vacia");
            return 0;
        } else {
            this.inicio = this.inicio.getSiguiente();
            return valor;
        }
    }

  
    //inserta un dato en nuestra lista
    public boolean insertarDato(int dato) {
        if (!buscarDato(dato)) {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            if (getInicio() == null) {
                setInicio(nuevo);
                
                return true;
            } else {
                Nodo aux = getInicio();
                if (aux.getDato() > dato) {
                    nuevo.setSiguiente(aux);
                    setInicio(nuevo);
                    return true;
                }
                while (aux.getSiguiente() != null) {
                    if (aux.getSiguiente().getDato() > dato) {
                        nuevo.setSiguiente(aux.getSiguiente());
                        aux.setSiguiente(nuevo);
                        return true;
                    }
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(nuevo);
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null,"El dato ya existe");
            return false;
        }
    }

    
    // busca el dato en nuestra lista esto se hace para saber si existe en la lista
    public boolean buscarDato(int dato) {
        Nodo aux = getInicio();
        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
    
    // busca el numero de casilla de un dato
    // retorna el numero de casilla
    public int busca(int dato) {
        int index = 0;
        Nodo aux = getInicio();
        while (aux != null) {
            if (aux.getDato() == dato) {
                return index;
            }
            index++;
            aux = aux.getSiguiente();
        }
        // di retoran un -99 el dato no existe en la lista 
        // ojo se puede simplificar con el metodo de buscarDato();
        return -99;
    }
    
    //este metodo es de borrado es diferente ya que este borra un dato cualquiera en la lista
    // usa el metodo elimina(numero de la casilla); 
    public void deletedd(int e){
        int index = busca(e);
        if(index == -99 ){
            JOptionPane.showMessageDialog(null,"El dato no existe");
        }else{
        eliminar(index);     
    }}

    public ListaOrden() {

    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

}
