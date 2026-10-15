/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author LENOVO
 */
public class recusividad {
    public static boolean esPalindromo(String palabra){
        if(palabra == null){
            return false;
        }
        return esPalindromoAux(palabra, 0, palabra.length() - 1);
    }
    
    private static boolean esPalindromoAux(String palabra, int i, int f){
        // Caso base 1 de exito
        if (i >= f) {
            return true;
        }
        // Caso base 2 de fallo
        if (palabra.charAt(i) != palabra.charAt(f)){
            return false;
        }
        return esPalindromoAux(palabra,i + 1, f - 1);
    }
}
