/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.variables.scopes;

/**
 *
 * @author barcvilla
 */
public class VariableScopes {
    public static void main(String[] args) {
        int x; // conocido por todo el codigo
        
        x = 10;
        if(x == 10)
        { // empezamos un nuevo alcance
            int y = 20; // conocido solo x este bloque
            // x and y ambos conocidos aqui
            System.out.println("x and y " + x + " y " + y);
            x = y * 2;
        }
        
        // y = 100 error! y no es conocida aqui
        System.out.println("x is: " + x);
    }
}
