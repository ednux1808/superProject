/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Lista;

import javax.swing.JOptionPane;

/**
 *
 * @authorednux1808
 */
public class ListaDoble {

    private Nodo inicio;
    private Nodo fin;
    int size = 0;

    public ListaDoble() {
        inicio = null;
        fin = null;
    }

    public int first() {
        return inicio.getDato();
    }

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(int dato) {
        if (buscar(dato) == false) {
            if (inicio == null) {
                inicio = new Nodo(dato, null, null);
                fin = inicio;
                size += 1;
                System.out.println("tamaño = " + size);
            } else {
                if (dato < inicio.getDato()) {
                    Nodo nuevo = new Nodo(dato, null, inicio);
                    inicio.setAnterior(nuevo);
                    inicio = nuevo;
                    System.out.println("entro dato = " + dato + "<" + inicio.getDato());
                    size += 1;
                    System.out.println("tamaño = " + size);
                } else {
                    if (dato > fin.getDato()) {
                        // dato -> null
                        Nodo nuevo = new Nodo(dato, fin, null);
                        fin.setSiguiente(nuevo);
                        fin = nuevo;
                        System.out.println("entro dato = " + dato + ">" + inicio.getDato());
                        size += 1;
                        System.out.println("tamaño = " + size);
                    } else {
                        Nodo anterior = inicio;
                        Nodo siguiente = fin;
                        while (dato > anterior.getSiguiente().getDato()) {

                            anterior = anterior.getSiguiente();
                            System.out.println("anterior = " + anterior.getDato());
                        }
                        while (dato < siguiente.getAnterior().getDato()) {

                            siguiente = siguiente.getAnterior();
                            System.out.println("siguinte = " + siguiente.getDato());
                        }

//                        System.out.println(" entro dato = " + dato + ">" + anterior.getDato());
//                        // aux <- dato -> fin
//                        System.out.println("anterior = " + anterior.getDato());
//                        System.out.println("siguinte = " + siguiente.getDato());
                        Nodo nuevo = new Nodo(dato, anterior, siguiente);
//                        System.out.println("aux = " + anterior.getDato() + " fin = " + siguiente.getDato());
//                        System.out.println(" " + nuevo.getDato() + "->" + siguiente.getDato());
                        nuevo.setSiguiente(siguiente);
//                        System.out.println(" " + anterior.getSiguiente().getDato() + " -> " + nuevo.getDato());
                        anterior.setSiguiente(nuevo);

                        nuevo.setAnterior(anterior);
                        siguiente.setAnterior(nuevo);
                        size += 1;
//                        System.out.println("tamaño = " + size);

                    }

                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "El dato ya existe :(");
        }
    }

    public String imprimir() {
        Nodo actualLeft = this.inicio;
        Nodo actualRight = this.fin;

        String s = "";

        if (estaVacia() == false) {

            while (actualLeft.getSiguiente() != null) {
                s += actualLeft.getDato() + "->";
                actualLeft = actualLeft.getSiguiente();
            }
            while (actualRight.getAnterior() != null) {
                s += actualRight.getDato() + "<-";
                actualRight = actualRight.getAnterior();
            }

            return s + actualRight.getDato();
        } else {
            return "";
        }
    }

    public String imprimirLeft() {
        Nodo actual = inicio;
        String s = "";
        while (actual != null) {
            s += actual.getDato() + "->";
            actual = actual.getSiguiente();
        }
        return s;
    }

    public String imprimirRight() {
        Nodo actual = fin;
        String s = "";
        while (actual != null) {
            s += actual.getDato() + "<-";
            actual = actual.getAnterior();
        }
        return s;
    }

    public boolean buscar(int dato) {
        Nodo temporal = inicio;
        while (temporal != null) {
            if (temporal.getDato() == dato) {
                return true;
            }
            temporal = temporal.getSiguiente();
        }
        return false;
    }

    public void eliminar(int dato) {

        if (buscar(dato) == true) {

            //Borrado Valor Inicio
            if (dato == this.inicio.getDato()) {
                //borrar cuando solo hay un elemento en la lista
                if (size == 1) {
                    System.out.println("Borrado 1");
                    this.inicio = null;
                    this.fin = null;
                    size = 0;
                } else {
                    //Borrado cuando hay mas de un elemento en la lista

                    Nodo NextInicio = this.inicio.getSiguiente();
                    System.out.println("Borrado 2 " + NextInicio.getDato());
                    NextInicio.setAnterior(null);
                    this.inicio = NextInicio;
                    size--;

                }
            } else {

                //Borrando el ultimo elemento de la lista
                if (dato == this.fin.getDato()) {
                    Nodo PreviousFin = this.fin.getAnterior();
                    System.out.println("Borrado 3 " + PreviousFin.getDato());
                    PreviousFin.setSiguiente(null);
                    this.fin = PreviousFin;
                    size--;

                } else {

                    System.out.println("Borrado 4");
                    Nodo actual = this.inicio;
                    while (actual.getSiguiente() != null) {

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

}
