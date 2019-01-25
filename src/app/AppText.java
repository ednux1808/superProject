/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Eduardo
 */
public class AppText {

    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;


    public String abrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
         
            BufferedReader br = new BufferedReader(new InputStreamReader(entrada));

            String linea = "";
            while ((linea = br.readLine()) != null) {
                String lineaTxt = (String) linea;
              //documento+=lineaTxt;
                comprobarString(lineaTxt);
                for (int i = 0; i < lineaTxt.length(); i++) {
                    char letra = linea.charAt(i);
                    comprobarChar(letra);
                    documento += letra;
                }
            }
        } catch (Exception e) {
        }

       
        return documento;
    }

    public String guardarArchivo(File archivo, String documento) {
        String mensaje = null;

        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "Archivo Guardado con Exito :)";
        } catch (Exception e) {
        }
        return mensaje;
    }

    //@Method comprobarChar 
    /*
        Indetifica caracter por caracter si es un simbolo, numero, letra o un simple espacio
     */
    private int charEspacio = 0;
    private int charSimbolo = 0;
    private int charLetra = 0;
    private int charNumero = 0;
    private int charTotal = 0;

    private String charTexto = "";
    private void comprobarChar(char letra) {
        this.charTotal++;
        if (letra == ' ') {
            this.charEspacio++;
            this.charTexto+=letra;
        } else {
            if (Character.isAlphabetic(letra) == true) {
                this.charLetra++;
                this.charTexto+=letra;
            } else {
                if (Character.isDigit(letra) == true) {
                    this.charNumero++;
                    this.charTexto+=letra;
                } else {
                    this.charSimbolo++;
                    this.charTexto+=letra;
                }
            }
        }

    }

    public String datosChar() {
        String charInfo = "";

        charInfo += " Total de Caracteres : " + this.charTotal + "\n";
        charInfo += " Total de Digitos : " + this.charNumero + "\n";
        charInfo += " Total de Letras : " + this.charLetra + "\n";
        charInfo += " Total de Espacios : " + this.charEspacio + "\n";
        charInfo += " Total de Simbolos : " + this.charSimbolo + "\n";

        return charInfo;
    }

    //@method comprobarString
    
    private int lineasTotales = 0;
    private int lineasVacias = 0;
    private int lineasLlenas = 0;
    
    private void comprobarString(String lineaTxt) {
        this.lineasTotales++;
        if(lineaTxt.equals("")){
            this.lineasVacias++;
        }else{
            this.lineasLlenas++;
        }
    }
    
    public String datosLinea(){
        String stringInfo = "";
        
        stringInfo+=" Lineas Totales : "+this.lineasTotales+"\n";
        stringInfo+=" Lineas Vacias : "+this.lineasVacias+"\n";
        stringInfo+=" Lineas con Texto : "+this.lineasLlenas+"\n";
        
        return stringInfo;
    }
    
    public void limpiador(){
        //Char
        this.charEspacio = 0;
        this.charLetra = 0;
        this.charNumero = 0;
        this.charSimbolo = 0;
        this.charTotal = 0;
        
        //string
        this.lineasLlenas = 0;
        this.lineasTotales = 0;
        this.lineasVacias = 0;
        
        archivo = null;
        entrada = null;
        salida = null;
    }

    public int getCharEspacio() {
        return charEspacio;
    }

    public void setCharEspacio(int charEspacio) {
        this.charEspacio = charEspacio;
    }

    public int getCharSimbolo() {
        return charSimbolo;
    }

    public void setCharSimbolo(int charSimbolo) {
        this.charSimbolo = charSimbolo;
    }

    public int getCharLetra() {
        return charLetra;
    }

    public void setCharLetra(int charLetra) {
        this.charLetra = charLetra;
    }

    public int getCharNumero() {
        return charNumero;
    }

    public void setCharNumero(int charNumero) {
        this.charNumero = charNumero;
    }

    public int getCharTotal() {
        return charTotal;
    }

    public void setCharTotal(int charTotal) {
        this.charTotal = charTotal;
    }

    public int getLineasTotales() {
        return lineasTotales;
    }

    public void setLineasTotales(int lineasTotales) {
        this.lineasTotales = lineasTotales;
    }

    public int getLineasVacias() {
        return lineasVacias;
    }

    public void setLineasVacias(int lineasVacias) {
        this.lineasVacias = lineasVacias;
    }

    public int getLineasLlenas() {
        return lineasLlenas;
    }

    public void setLineasLlenas(int lineasLlenas) {
        this.lineasLlenas = lineasLlenas;
    }

    public String getCharTexto() {
        return charTexto;
    }

    public void setCharTexto(String charTexto) {
        this.charTexto = charTexto;
    }

}
