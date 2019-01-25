/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;

import grafo.nodos.NodoA;
import grafo.nodos.NodoLista;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class GrafoApp {

    private NodoLista Inicio;
    private NodoA derecha;
    private int size = 0;

    public GrafoApp() {
        this.Inicio = null;
        this.derecha = null;
    }

    //inicio =  [12] ->[23]->null[27]
    // Metodo agregar Lista
    public void agregarLista(Object dato) {

        NodoLista nuevo = new NodoLista(dato);
        if (this.Inicio == null) {
            nuevo.setSig(null);
            this.Inicio = nuevo;
            this.derecha = null;
            size++;
        } else {
            // nuevo ->[2]
            if ((int) dato < (int) this.Inicio.getDate()) {
                nuevo.setSig(this.Inicio);
                this.Inicio = nuevo;
                this.derecha = null;
                size++;
            } else {
                // [1]->[2]->[4]
                NodoLista temp = this.Inicio;
                while (temp.getSig() != null) {

                    temp = temp.getSig();
                }
                if ((int) dato > (int) temp.getDate()) {
                    temp.setSig(nuevo);

                    size++;
                } else {
                    // [2]->[3]->[5]
                    // temp = 3
                    NodoLista tempo = this.Inicio;
                    while (tempo.getSig() != null) {
                        if ((int) dato < (int) tempo.getSig().getDate()) {
                            break;
                        }
                        tempo = tempo.getSig();
                    }
                    NodoLista temp1 = tempo.getSig();

                    System.out.println("el dato anterior es :" + tempo.getSig().getDate());

                    nuevo.setSig(temp1);
                    tempo.setSig(nuevo);

                    size++;

                }

            }

        }

    }

    int sizeRight = 0;

    public void agregarDerecha(Object NombreNodo, Object dato) {
        if (busqueda(NombreNodo) == -1) {
            System.out.println("Error no existe el Nodo");
            JOptionPane.showMessageDialog(null, "Error el Nodo no existe ");
        } else {
            int lugar = busqueda(NombreNodo);
            NodoLista temporal = this.Inicio;

            for (int i = 0; i < lugar; i++) {
                temporal = temporal.getSig();
            }
            System.out.println("--------------------------------");
            System.out.println("nodo :" + NombreNodo + " lugar :" + lugar + " NODO : " + temporal.getDate());
            System.out.println("--------------------------------");

            NodoA inicio = temporal.getInicio();
            NodoA nuevo = new NodoA(dato);
            if (inicio == null) {
                System.out.println("primer dato");
                temporal.setInicio(nuevo);
                this.derecha = nuevo;
                sizeRight++;

            } else {
                System.out.println("ya hay elementos, el primer elemento es :" + inicio.getDate());

                if ((int) dato < (int) inicio.getDate()) {
                    nuevo.setSig(inicio);//[5]->[2]
                    temporal.setInicio(nuevo);
                    this.derecha = nuevo;
                    sizeRight++;
                } else {
                    NodoA temp = this.derecha;
                    while (temp.getSig() != null) {
                        System.out.println("tenp = " + temp.getDate());
                        temp = temp.getSig();
                    }
                    if ((int) dato > (int) temp.getDate()) {
                        System.out.println("el dato es mayor a final");
                        temp.setSig(nuevo);
                        sizeRight++;
                    } else {
                        System.out.println("el dato es intermedio");
                        NodoA tempo = this.derecha;
                        while (tempo.getSig() != null) {
                            if ((int) dato < (int) tempo.getSig().getDate()) {
                                break;
                            }
                            tempo = tempo.getSig();
                        }
                        NodoA complemento = tempo.getSig();
                        nuevo.setSig(complemento);
                        tempo.setSig(nuevo);
                    }
                }

            }

        }
    }

    //Busca si el dato a ingresar en la lista Existe
    public boolean buscarDatoLista(Object datoBuscar) {
        NodoLista tempo = this.Inicio;
        while (tempo != null) {
            if ((int) datoBuscar == (int) tempo.getDate()) {
                // (int) datoBuscar == (int) tempo.getDate()
                return true;
            }
            tempo = tempo.getSig();
        }
        return false;
    }

    public int busqueda(Object date) {
        NodoLista temp = this.Inicio;
        for (int i = 0; i < size; i++) {
            if ((int) date == (int) temp.getDate()) {
                // (int) date == (int) temp.getDato
                return i;
            }
            temp = temp.getSig();
        }
        return -1;
    }

    public String mostrar() {
        String text = "";
        NodoLista temp1 = this.Inicio;

        for (int i = 0; i < size; i++) {
            text += temp1.getDate() + "->";

            text += demo(temp1.getDate());

            text += "\n" + "|" + "\n";

            temp1 = temp1.getSig();
        }
        return text;
    }

    public String demo(Object nodo) {

        int conta = busqueda(nodo);
//        System.out.println("-----------------------");
//        System.out.println("posicion : "+conta+" nodo : "+nodo);
        NodoLista temporal = this.Inicio;
        for (int i = 0; i < conta; i++) {
            temporal = temporal.getSig();
        }
//        System.out.println("nodo a imprimir :" +temporal.getDate());

        NodoA temp = temporal.getInicio();

//        System.out.println("Nodo Inicio : "+temp.getDate());
////        if(temp.getSig() == null){
////            System.out.println("esta null");}else{System.out.println("Nodo next :"+temp.getSig().getDate());}
        String tex = "";

        while (temp != null) {
            tex += temp.getDate() + "->";
            temp = temp.getSig();
        }

        return tex;

    }

    public NodoLista getInicio() {
        return Inicio;
    }

    public void setInicio(NodoLista Inicio) {
        this.Inicio = Inicio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//    public static void main(String[] args) {
//        GrafoApp app = new GrafoApp();
//        VentanaGrafo vm = new VentanaGrafo();
//        app.agregarLista(12);
//        app.agregarLista(89);
//        app.agregarLista(90);
//        app.agregarLista(988);
//        app.agregarLista(65);
//        app.agregarLista(534);
//
//        //   System.out.println(app.mostrar());
//        app.agregarDerecha(90, 7);
//        app.agregarDerecha(65, 98);
//        app.agregarDerecha(988, 54);
//
//        System.out.println("-----------------------------");
//        System.out.println(app.mostrar());
//        System.out.println("------------------------------");
//
//        vm.setVisible(true);
//        
//    }
    public NodoA getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoA derecha) {
        this.derecha = derecha;
    }

}
