/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarios;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author montes
 */
public class ArchivosBinarios {

    /**
     * Escribe en el archivo que se le pasa y empezandolo desde cero, 3 objetos
     * de la clase Alumno.
     *
     * @param archivo Path completo del fichero que se quiere escribir
     */
    public void escribeArchivo(String archivo) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));

            for (int i = 1; i <= 3; i++) {
                Alumno alumno = new Alumno();
                alumno.setMatricula("" + i);
                alumno.setNombre("Alumno No. " + i);
                alumno.setCarrera("ICO");

                oos.writeObject(alumno);
            }
            oos.close();
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }

    /**
     * Se leen todas las Persona en el archivo y se escriben por pantalla.
     *
     * @param archivo El path completo del archivo que contiene las ALumno.
     */
    public void leeFichero(String archivo) {
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(archivo));

            // Se lee el primer objeto
            Object aux = null;

            // Mientras haya objetos
            while ((aux = ois.readObject()) != null) {
                System.out.print(((Alumno) aux).getMatricula() + "\t"
                        + ((Alumno) aux).getNombre() + "\t"
                        + ((Alumno) aux).getCarrera() + "\n");

            }

            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de archivo");
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println("Error = " + e2);
        }
    }

    /**
     * añade al final del archivo que se le pasa 3 objetos de la clase Alumno.
     *
     * @param archivo Path completo del archivo
     */
    public void AgregaArchivo(String archivo) {
        try {
            // Se usa un ObjectOutputStream que no escriba una cabecera en
            // el stream.
            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(archivo, true));
            // Se hace el new fuera del bucle, sÛlo hay una instancia de persona.
            // Se debe usar entonces writeUnshared().
            for (int i = 4; i <= 7; i++) {
                Alumno alumno = new Alumno();
                alumno.setMatricula("" + i);
                alumno.setNombre("Alumno No. " + i);
                alumno.setCarrera("ICO");

                oos.writeUnshared(alumno);
            }
            oos.close();
        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(ArchivosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

  
    
}
