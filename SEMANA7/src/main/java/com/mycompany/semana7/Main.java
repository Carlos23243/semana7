/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[]args) {
        
        Producto producto1 = new Producto();
        producto1.mostrarInfo();
        
        System.out.println("---------------");
        
        Producto producto2 = new Producto("Laptop", 1200.50,5);
        producto2.mostrarInfo();
        
        System.out.println("---------------");
        
        Producto producto3 = new Producto("Teclado", 25.99);
        producto3.mostrarInfo();
    }
    
}
