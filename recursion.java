/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1;
import java.util.Scanner;

/**
 *
 * @author Thinkval
 */
public class recursion {
     //metodo wrapper
    public boolean Palindromo(String palabra){
       
        //validar si el metodo es null
        if(palabra==null){
            return false;
        }
        //este metodo validamos si las palabras convierte todo a minúsculas y 
        //remueve los espacios y sean evaluadas de forma correcta
        palabra = palabra.toLowerCase().replace(" ", "");
        //llamar al metod recursivo
        return PalindromoRecursivo(palabra, 0, palabra.length() - 1);
    }
    //metodo privado recursivo
    private boolean PalindromoRecursivo(String palabra,int izq,int der){
        //caso baso: llegamos al centro
        if(izq>=der){
            return true;
        }
        //si los caracteres son diferentes 
        if(palabra.charAt(izq)!=palabra.charAt(der)){
             return false;
        }
        //avanzar hacia el centro
        return PalindromoRecursivo(palabra, izq+1, der-1);
           
    }
    
    //metodo principal
    public static void main(String[] args) {   
    Scanner teclado = new Scanner(System.in);
    recursion prueba = new recursion();
    
    System.out.print("Escribe una Palabra Palindromo: ");
    String palabra = teclado.nextLine();

    if (prueba.Palindromo(palabra)) {
        System.out.println("La palabra SI es un Palindromo.");
    } else {
        System.out.println("La palabra NO es un Palindromo.");
    }

    teclado.close();
}  
}

