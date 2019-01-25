/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones;

import estructurasLineales.nodos.NodoPila;
import estructurasLineales.operaciones.Pila;


/**
 *
 * @author imagensala1juarez
 */
public class Expresiones {

    NodoPila nodoPila = new NodoPila();
    Pila pila = new Pila();

    private double op1 = 0;
    private double op2 = 0;

    private String expresion = "";
    
    public boolean operatorJerarquia(String operator){
    
        int SUMA = 0,RESTA = 0,MULTIPLICACION = 1,DIVICION = 1,ELEVACION = 2;
        
    
        return true;
    }
    

    public void part1(String exprecion) {

        int[] numEntero = null;
        String[] operator = {"+", "-", "*", "/", "$"};
        String[] newExpresion = exprecion.split(" ");

        if (pila.isEmply() == true) {
            for (int i = 0; i >= newExpresion.length; i++) {
                for (int j = 0; j >= operator.length; j++) {
                    if (newExpresion[i].equals(operator[j])) {
                        pila.pushString(newExpresion[i]);
                        break;
                    } else {
                        numEntero[i] = Integer.parseInt(newExpresion[i]);
                        break;
                    }
                }
            }
        }
        
        
    }
    
    
    public void part2(){
        
    }
    
    
    

    public Expresiones() {
    }

    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }

    public void setOp1(double op1) {
        this.op1 = op1;
    }

    public void setOp2(double op2) {
        this.op2 = op2;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

}
