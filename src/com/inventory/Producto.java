/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory;

import java.util.Scanner;

public class Producto {
    private String nombre;
    private String categoria;
    private int stock;
    private double precio;
    
    // Constructor
    public Producto(String nombre, String categoria, int stock, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
    }

    // Método para guardar el producto en un archivo de texto
    public void guardarProducto() {
        // Lógica para guardar el producto en un archivo de texto
    }

    // Método estático para crear un producto
    public static void crearProducto() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();
        
        System.out.print("Categoría del producto: ");
        String categoria = sc.nextLine();
        
        System.out.print("Stock inicial: ");
        int stock = sc.nextInt();
        
        System.out.print("Precio de venta: ");
        double precio = sc.nextDouble();
        
        // Crear una nueva instancia del producto y guardarla
        Producto producto = new Producto(nombre, categoria, stock, precio);
        producto.guardarProducto();
        
        System.out.println("Producto creado con éxito.");
    }
}
