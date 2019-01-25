/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;



import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Eduardo
 */
public class ProductoBean {



    
   public String reRepartamento = "";
   public String reDescripcion = "";
   public int    reExistencia = 0;
   public String reMarca = "";
   public double rePrecio = 0;
   public String retipo = "";
   
   ArrayList p = new ArrayList();
    
    //POJO
    private Producto producto = new Producto();
    private String archivo = "/Users/Eduardo/producto.dat";

    /**
     * Agrega un Producto al archivo producto.dat
     *
     * @return
     */
    public boolean guardarProducto() {

        try {

            MiObjectOutputStream oos = new MiObjectOutputStream(new FileOutputStream(archivo, true));

            oos.writeUnshared(this.producto);
            oos.close();
        } catch (IOException e) {
            return false;
        }

        return true;
    }// Fin metodo guardarProducto

    /**
     * Crea o Inicializa el Archivo
     *
     * @return
     */
    public boolean crearArchivo() {

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));

            oos.close();
        } catch (IOException e) {
            return false;
        }

        return true;
    }

    /**
     * Se leen todas las Persona en el archivo y se escriben por pantalla.
     *
     */
    public String leerArchivo() {
        String conte = " Codigo " + "\t" + "Departamento" + "\t" + "Descripcion " + "\t" + "Marca" +"\t" + "Tipo" + "\t" + "Existencia" + "\t" + "Precio" + "\t" + "\n";
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(archivo));

            // Se lee el primer objeto
            this.producto = null;

            // Mientras haya objetos
            do {
                this.producto = new Producto();
                this.producto = (Producto) ois.readObject();

                if (this.producto == null) {
                    break;
                }
                conte += this.producto.getCodigo() + "\t"
                        + this.producto.getDepartamento() + "\t"
                        + this.producto.getDescricion() + "\t"
                        + this.producto.getMarca() + "\t"
                        + this.producto.getTipo() + "\t"
                        + this.producto.getExistencia() + "\t"
                        + this.producto.getPrecio() + "\t"+"\n";
                        

            } while (true);

            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de archivo");
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println("Error = " + e2);
        }
        return conte;
    }

    
    public boolean Buscar(String codigoBuscar){
       try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(archivo));

            // Se lee el primer objeto
            this.producto = null;

            // Mientras haya objetos
            do {
                this.producto = new Producto();
                this.producto = (Producto) ois.readObject();
                

                if (this.producto == null) {
                    break;
                }
                
                if(this.producto.getCodigo().equals(codigoBuscar)){
                    this.setReRepartamento(this.producto.getDepartamento());
                    this.setReDescripcion(this.producto.getDescricion());
                    this.setReMarca(this.producto.getMarca());
                    this.setRetipo(this.producto.getTipo());
                    this.setReExistencia(this.producto.getExistencia());
                    this.setRePrecio(this.producto.getPrecio());
                    return true;
                }
               

            } while (true);

            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de archivo");
        } catch (IOException | ClassNotFoundException e2) {
            System.out.println("Error = " + e2);
        }
       return false;
    }
    
    
    
    
    
    
//    public static void main(String[] args) {
//        
//        ProductoBean app = new ProductoBean();
//        
//        app.crearArchivo();
////        app.getProducto().setCodigo("08929993");
////        app.getProducto().setDepartamento("Bebidas");
////        app.getProducto().setExistencia(50);
////        app.getProducto().setMarca("Ciel");
////        app.getProducto().setPrecio(5.50);
////        app.getProducto().setTipo("Agua");
////        
//        
////        app.guardarProducto();
//        
//        app.leerArchivo();
//        
//        
//    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getReRepartamento() {
        return reRepartamento;
    }

    public void setReRepartamento(String reRepartamento) {
        this.reRepartamento = reRepartamento;
    }

    public String getReDescripcion() {
        return reDescripcion;
    }

    public void setReDescripcion(String reDescripcion) {
        this.reDescripcion = reDescripcion;
    }

    public int getReExistencia() {
        return reExistencia;
    }

    public void setReExistencia(int reExistencia) {
        this.reExistencia = reExistencia;
    }

    public String getReMarca() {
        return reMarca;
    }

    public void setReMarca(String reMarca) {
        this.reMarca = reMarca;
    }

    public double getRePrecio() {
        return rePrecio;
    }

    public void setRePrecio(double rePrecio) {
        this.rePrecio = rePrecio;
    }

    public String getRetipo() {
        return retipo;
    }

    public void setRetipo(String retipo) {
        this.retipo = retipo;
    }

}// Fin de la Clase
