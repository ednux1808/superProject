package aasOperation.aapp;

import java.util.Stack;

/**
 *
 * @author Eduardo
 */
public class AsApp {

    /*
        Caso de prueba 
    
    input = 928*6/+43$-5+
    
    enOrden  = 9+2*8/6-4$3+5
    preOrden = +-+9/*286$435
    posOrden = 928*6/+43$-5+
    
    */
    NodoArbol raiz;

    private Stack<NodoArbol> stack = new Stack<>();

    public AsApp() {
        this.raiz = null;
    }

    public void insertar(String c) {
        NodoArbol temp1;//Guarda el dato 1 que sale de la pila
        NodoArbol temp2;//Guarda el dato 2 que sale de la pila

        //Recorre nuestro String charater por charater
        for (int i = 0; i < c.length(); i++) {
            char letra = c.charAt(i);
            if (esOperador(letra)) {

                temp1 = stack.pop();//Sacamos el primero Numero de la pila
                temp2 = stack.pop();//Sacamos el segundo Numero de la pila

                NodoArbol nuevoSigno = new NodoArbol(letra); //Creamos el Nodo y le pasamos el dato de character
                nuevoSigno.setDer(temp1); //derecha del nuevo nodo va apuntar al nodo que contiene el numero 1 sacado
                nuevoSigno.setIzq(temp2); //izquierda del nuevo nodo va apuntar al nodo que contiene el numero 2 sacado

                stack.push(nuevoSigno); //metemos a la pila nuestro nuevo nodo creado
            } else {

                NodoArbol nuevoNumero = new NodoArbol(letra); //creamos nuestro nuevo nodo con el numero
                stack.push(nuevoNumero); //metemos a la pila nuestro nodo creado
            }
        }

        raiz = this.stack.pop(); //sacamos todo lo que esta en la pila 

    }

    public String recorridopreOrden() {
        String cadena = "";
        cadena = preOrden(raiz, cadena);
        return cadena;
    }//fin recorridoPreorden

    public String preOrden(NodoArbol raiz, String cadena) {
        if (raiz == null) {
            return cadena;
        }

        cadena += raiz.getDato() + ",";

        cadena = preOrden(raiz.getIzq(), cadena);
        cadena = preOrden(raiz.getDer(), cadena);
        return cadena;
    }//fin PreOrden

    public String recorridoenOrden() {
        String cadena = "";
        cadena = enOrden(raiz, cadena);
        return cadena;
    }//fin recorrido enOrden

    public String enOrden(NodoArbol raiz, String cadena) {
        if (raiz == null) {
            return cadena;
        }
        cadena = enOrden(raiz.getIzq(), cadena);
        cadena += raiz.getDato() + ",";
        cadena = enOrden(raiz.getDer(), cadena);
        return cadena;
    }//fin enOrden

    public String recorridoposOrden() {
        String cadena = "";
        cadena = posOrden(raiz, cadena);
        return cadena;
    }//fin recorridopostOrden

    public String posOrden(NodoArbol raiz, String cadena) {
        if (raiz == null) {
            return cadena;
        }
        cadena = posOrden(raiz.getIzq(), cadena);
        cadena = posOrden(raiz.getDer(), cadena);
        cadena += raiz.getDato() + ",";
        return cadena;
    }//fin postOrden

    // Metodo para saber si es un Operador aritmetico 
    private boolean esOperador(char letra) {
        return letra == '*' || letra == '+' || letra == '-' || letra == '$' || letra == '/';
    }

}
