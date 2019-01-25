package proyecto;

import java.io.Serializable;

/**
 *
 * @author Eduardo
 */
public class Producto  implements Serializable{
    
    private String codigo = "";       // "0189aC88"
    private String descricion = "";   // "Botella de agua pepino limon" 
    private String tipo  = "";        // "agua"
    private String marca = "";        // "bonafon"
    private String departamento = ""; // "Bebidas" 
    private double precio = 0;        // 8.0
    private int existencia = 0;       // 100

    public Producto() {
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    
    
}
