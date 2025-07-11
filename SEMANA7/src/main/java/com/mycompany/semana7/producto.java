/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7;

/**
 *
 * @author admin
 */
public class producto {
    
    private String nombre;
    private double precio;
    private int stock;
    
    public producto() {
        this.nombre = "Sin nommbre";
        this.precio = 0.0;
        this.stock = 0;
                
    }
    
    public producto(String nombre, double precio,  int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
                
    }
    
public producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = 0;
}   

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
    
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public int getStock() {
    return stock;
    
}

public void setStock(int stock) {
    this.stock = stock;
    
}

public void mostrarInfo() {
    System.out.println("Producto: "+ nombre);
    System.out.println("Precio: $" + precio);
    System.out.println("Stock: "+stock+ "unidades");
}
}
