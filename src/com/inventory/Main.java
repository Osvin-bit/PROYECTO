/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Sistema de Gestión de Inventarios");
            System.out.println("1. Crear Producto");
            System.out.println("2. Crear Categoría");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombreProducto = sc.nextLine();
                    System.out.print("Categoría del producto: ");
                    String categoria = sc.nextLine();
                    System.out.print("Stock inicial: ");
                    int stock = sc.nextInt();
                    System.out.print("Precio de venta: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();  // Limpiar buffer
                    
                    Producto producto = new Producto(nombreProducto, categoria, stock, precio);
                    producto.guardarProducto();
                    break;
                case 2:
                    System.out.print("Nombre de la categoría: ");
                    String nombreCategoria = sc.nextLine();
                    System.out.print("Descripción de la categoría: ");
                    String descripcion = sc.nextLine();
                    
                    Categoria nuevaCategoria = new Categoria(nombreCategoria, descripcion);
                    nuevaCategoria.guardarCategoria();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
