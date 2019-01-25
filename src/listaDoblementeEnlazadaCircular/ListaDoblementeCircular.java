/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaDoblementeEnlazadaCircular;

import javax.swing.JOptionPane;

/**
 *
 * @author ednux
 */
public class ListaDoblementeCircular {
    
    private Nodo inicio;
    private Nodo fin;
    int size = 0;
    
    public ListaDoblementeCircular() {
        this.inicio = null;
        this.fin = null;
    }
    
    public int first() {
        return this.inicio.getDato();
    }
    
    public boolean estaVacia() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean buscar(int busqueda) {
        if (!estaVacia()) {
            Nodo buscar = this.inicio;
            while (buscar.getSiguiente() != this.inicio) {
                if (buscar.getDato() == busqueda) {
                    return true;
                }
                buscar = buscar.getSiguiente();
                
            }
            System.out.println(""+buscar.getDato());
            if (buscar.getDato() == busqueda) {
                return true;
            }
            
        }
        return false;
        
    }
    
    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (buscar(dato) == false) {
            if (this.inicio == null) {
                
                this.inicio = nuevo;
                this.fin = nuevo;
                
                this.inicio.setAnterior(this.fin);
                this.inicio.setSiguiente(this.fin);
                
                this.fin.setAnterior(this.inicio);
                this.fin.setSiguiente(this.inicio);
                
                size += 1;
                System.out.println("tamaño = " + size);
            } else {
                if (dato < this.inicio.getDato()) {
                    
                    this.inicio.setAnterior(nuevo);
                    this.fin.setSiguiente(nuevo);
                    nuevo.setAnterior(fin);
                    nuevo.setSiguiente(this.inicio);
                    this.inicio = nuevo; 
                    
                    System.out.println("entro dato = " + dato + "<" + this.inicio.getDato());

                    //inicio.setAnterior(fin);
                    size += 1;
                    System.out.println("tamaño = " + size);
                } else {
                    if (dato > this.fin.getDato()) {

                        this.fin.setSiguiente(nuevo);
                        nuevo.setAnterior(this.fin);
                        nuevo.setSiguiente(this.inicio);
                        
                        this.fin = nuevo;
                        
                       
                        
                        
                        System.out.println("entro dato = " + dato + ">" + this.inicio.getDato());
                        size += 1;
                        System.out.println("tamaño = " + size);
                    } else {
                        Nodo anterior = this.inicio;
                        Nodo siguiente = this.fin;
                        while (dato > anterior.getSiguiente().getDato()) {
                            
                            anterior = anterior.getSiguiente();
                            System.out.println("anterior = " + anterior.getDato());
                        }
                        while (dato < siguiente.getAnterior().getDato()) {
                            
                            siguiente = siguiente.getAnterior();
                            System.out.println("siguinte = " + siguiente.getDato());
                        }
                        
                        System.out.println(" entro dato = " + dato + ">" + anterior.getDato());
                        // aux <- dato -> fin
                        System.out.println("anterior = " + anterior.getDato());
                        System.out.println("siguinte = " + siguiente.getDato());
                        
                        nuevo.setAnterior(anterior);
                        nuevo.setSiguiente(siguiente);
                        System.out.println("aux = " + anterior.getDato() + " fin = " + siguiente.getDato());
                        System.out.println(" " + nuevo.getDato() + "->" + siguiente.getDato());
                        nuevo.setSiguiente(siguiente);
                        System.out.println(" " + anterior.getSiguiente().getDato() + " -> " + nuevo.getDato());
                        anterior.setSiguiente(nuevo);
                        
                        nuevo.setAnterior(anterior);
                        siguiente.setAnterior(nuevo);
                        size += 1;
                        System.out.println("tamaño = " + size);
                        
                    }
                    
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dato ya existe :(");
        }
    }
    
    public String imprimir() {
        String contenido = "";
        if (!estaVacia()) {
            Nodo temp = this.inicio;
            while (temp.getSiguiente() != this.inicio) {
                contenido += temp.getDato() + "->";
                temp = temp.getSiguiente();
            }
            
            contenido += temp.getDato()+"->";
            contenido += temp.getAnterior().getDato()+"->";
            
        
           contenido += temp.getSiguiente().getDato();
        }
        return contenido;
    }
    
        public String imprimirLista() {//Listo
        // crear una variable contenido
        String contenido;
        // si esta vacio
        if (!estaVacia()) {
            contenido = "";
            Nodo temp = this.inicio;
            
            while (temp.getSiguiente()!= this.inicio) {
                contenido += temp.getDato()+ "->";
                temp = temp.getSiguiente();
            }
            contenido += temp.getDato()+ "->";
            contenido += temp.getSiguiente().getDato();
            
            while (temp != this.inicio) {
                contenido +=   "<-" + temp.getDato();
                temp = temp.getAnterior();
            }
            contenido += "<-" + temp.getDato();
        } else{
            contenido = "";
        }
        return contenido;
    }
    
    public String imprimirRight() {
        String s = "";
        if (estaVacia() == false) {
          
            Nodo left = this.fin;
            for (int i = 0; i < size; i++) {
                
                s+=left.getDato()+"->";
                left = left.getAnterior();
                
                System.out.println(" "+ size);
            }
  
            return s;
        } else {
            return "";
        }
        
        
    }
    
    public void eliminar(int dato) {
        
        if (buscar(dato) == true) {
            //Borrado Valores de Inicio
            if (dato == this.inicio.getDato()) {
                //Borrado cuando solo hay un elemento en la lista.
                if (size == 1) {
                    System.out.println("Borrado 1");
                    this.inicio = null;
                    this.fin = null;
                    size--;
                } else {
                    //Borrado cuando hay mas de un elemento en la lista.
                    Nodo NextInicio = this.inicio.getSiguiente();
                    System.out.println("borrado 2 " + NextInicio.getDato());
                    NextInicio.setAnterior(this.fin);
                    this.fin.setSiguiente(NextInicio);
                    this.inicio = NextInicio;
                    size--;
                    
                }
            } else {
                //Borrado cuando el valor a eliminar es el ultimo
                if (dato == this.fin.getDato()) {
                    Nodo PreviousFIn = this.fin.getAnterior();
                    
                    System.out.println("Borrado 3  " + PreviousFIn.getDato());
                    
                    PreviousFIn.setSiguiente(this.inicio);
                    this.fin = PreviousFIn;
                    size--;
                    
                } else {
                    
                    System.out.println("Borrado 4");
                    Nodo actual = this.inicio;
                    while (actual.getSiguiente() != this.inicio) {
                        
                        if (dato == actual.getDato()) {
                            //Respladamos el nodo siguiente
                            Nodo NextActual = actual.getSiguiente();
                            System.out.println("NextActual = " + NextActual.getDato());
                            //Respaldamos el Nodo anterior
                            Nodo PreviousActual = actual.getAnterior();
                            System.out.println("PreviousActual = " + PreviousActual.getDato());
                            System.out.println("Encontrado ");
                            
                            PreviousActual.setSiguiente(NextActual);
                            NextActual.setAnterior(PreviousActual);
                            
                            size--;
                            
                        }                        
                        actual = actual.getSiguiente();
                    }
                    
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dato a eliminar no existe");
        }
        
    }
    
    public String imprimirf(String x, String y) {
        if (estaVacia() == false) {
            return x+"->"+ y;
        } else {
            return "";
        }
    }
    
    public Nodo getInicio() {
        return inicio;
    }
    
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    public Nodo getFin() {
        return fin;
    }
    
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    public String imprimir1() {
        Nodo actualLeft = this.inicio;
        Nodo actualRight = this.fin;

        String s = "";

        if (estaVacia() == false) {

            while (actualLeft.getSiguiente() != this.inicio) {
                s += actualLeft.getDato() + "->";
                actualLeft = actualLeft.getSiguiente();
            }
            while (actualRight.getAnterior() != this.fin) {
                s += actualRight.getDato() + "<-";
                actualRight = actualRight.getAnterior();
            }

            return s + actualRight.getDato();
        } else {
            return "";
        }
    }
    
    
}
