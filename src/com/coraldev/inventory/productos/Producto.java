package com.coraldev.inventory.productos;

public class Producto {
    private String  name;
    private int cantidad;
    private double precio;
    private int id;

    public String getName() {
        return name;
    }

    public Producto setName(String name) {
        this.name = name;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Producto setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    private void venta(int cantidad){
        if (this.cantidad > cantidad){
            this.cantidad -= cantidad;
        } else {
            System.out.println("Error");
        }
    }

    private void ingresoDeProducto(int cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        } else {
            System.out.println("No se puede ingresar cantidades negativas");
        }
    }

}
