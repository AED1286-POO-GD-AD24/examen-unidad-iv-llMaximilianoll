// Clase abstracta Producto
package clases;

public abstract class Producto {

    protected String nombre;
    protected double precio;

    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public abstract String getNombre();

    public abstract double getPrecio();
}

