/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresion;

import pila.Pila;

/**
 * @version 0.0.01a
 * @author Eduardo Zamora
 */
public class Expresion {

    private double resultado = 0;  // 28.25
    private String OpInfijo = "";   // 3*8+5-6/2$3
    private String OpPosfijo = "";   // 38*5+623$/-
    Pila pila = new Pila(); //Creaciòn del Objecto Pila 

    public void evaluar() {
        //OpPosfijo= 38*5+6
        this.OpPosfijo = convertir(this.OpInfijo);
        this.resultado = evaluarPosfija(this.OpPosfijo);
    }

    private String convertir(String OpInfijo) {

        String posfijo = ""; //es donde voy guardando la operaciòn.
        for (int i = 0; i < OpInfijo.length(); i++) {
            char letra = OpInfijo.charAt(i);
            // Vamos a Comprobar si es un Operador o Numero
            if (esOperador(letra)) {
                if (pila.estaVacia()) {
                    /*
                     Al estar vacia la pila no hay conque comprobar jerarquia
                     asi que el operador se agrega.
                     */
                    pila.apilar(letra);
                } else {
                    /*
                     Al estar la pila llena se debe comprobar jerarquia de operadores
                     */
                    int PriExpresion = prioridadExpresion(letra); // Prioridad de expresion.
                    int PriPila = prioridadPila((char) pila.elementoTope());  // Prioridad en pila.
                    if (PriExpresion >= PriPila) {
                        /*
                         letra = + 
                         */
                        pila.apilar(letra);
                    } else {
                        /*
                         pila = - ; letra = +; 
                         */
                        posfijo += pila.desapilar(); // + >= - , Como es igula el operador este se quita de la pila
                        // posfijo = -;  pila = 0;
                        pila.apilar(letra);  //pila = +;
                    }
                }

            } else {
                // Si es numero lo agregamos a nuestra cadena
                posfijo += letra;
            }
        }
        //Ahora solo falta vaciar la pila 
        while (!pila.estaVacia()) {
            posfijo += pila.desapilar();
        }

        //retornamos nuestra cadena posfija 3*8+5-6/2$3
        return posfijo;

    }

    private double evaluarPosfija(String OpPosfijo) {
        double num1;
        double num2;
        double num3;

        for (int i = 0; i < OpPosfijo.length(); i++) {
            char letra = OpPosfijo.charAt(i);
            if (!esOperador(letra)) {
                // si es operador lo meto a la pila nuevamente
                double num = new Double(letra + "");
                pila.apilar(num);
            } else {
                // Si no es operador y es numero lo saco y lo asigno a la varible num2
                // el segundo numero lo asigno a la variable num1 
                //  pila 1->2->3 
                // num2 = 3; num1 = 2;
                num2 = (double) pila.desapilar();
                num1 = (double) pila.desapilar();
                // operacion (+ , 2, 3) = 5 
                num3 = operacion(letra, num1, num2);
                // se mete a la pila el nuevo numero que es el resultado de la operacion.                
                // pila ->1-> 5
                pila.apilar(num3);

            }

        }
        // Se retorna el Valor top de la pila que es resultado final de todas las operaciones.
        return (double) pila.elementoTope();
    }

    private int prioridadExpresion(char operador) {
        if (operador == '$') {
            return 4;
        }
        if (operador == '*' || operador == '/') {
            return 2;
        }
        if (operador == '+' || operador == '-') {
            return 1;
        }

        return 0;
    }

    private int prioridadPila(char operador) {
        if (operador == '$') {
            return 3;
        }
        if (operador == '*' || operador == '/') {
            return 2;
        }
        if (operador == '+' || operador == '-') {
            return 1;
        }

        return 0;
    }

    private boolean esOperador(char letra) {
        if (letra == '*' || letra == '+' || letra == '-' || letra == '$' || letra == '/') {
            return true;
        }
        return false;
    }

    private double operacion(char letra, double num1, double num2) {
        if (letra == '*') {
            return num1 * num2;
        }
        if (letra == '/') {
            return num1 / num2;
        }
        if (letra == '+') {
            return num1 + num2;
        }
        if (letra == '-') {
            return num1 - num2;
        }
        if (letra == '$') {
            return Math.pow(num1, num2);
        }

        return 0;
    }

    public double getResultado() {
        return resultado;
    }

    public String getOpInfijo() {
        return OpInfijo;
    }

    public String getOpPosfijo() {
        return OpPosfijo;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setOpInfijo(String OpInfijo) {
        this.OpInfijo = OpInfijo;
    }

    public void setOpPosfijo(String OpPosfijo) {
        this.OpPosfijo = OpPosfijo;
    }
}
