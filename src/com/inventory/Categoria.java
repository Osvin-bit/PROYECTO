/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventory;

import java.util.Scanner;

public class Categoria {
    private String nombre;
    private String descripcion;
    
    // Constructor
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Método para guardar la categoría en un archivo de texto
    public void guardarCategoria() {
        // Lógica para guardar la categoría en un archivo de texto
    }

    // Método estático para crear una categoría
    public static void crearCategoria() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre de la categoría: ");
        String nombre = sc.nextLine();
        
        System.out.print("Descripción de la categoría: ");
        String descripcion = sc.nextLine();
        
        // Crear una nueva instancia de categoría y guardarla
        Categoria categoria = new Categoria(nombre, descripcion);
        categoria.guardarCategoria();
        
        System.out.println("Categoría creada con éxito.");
    }
}
