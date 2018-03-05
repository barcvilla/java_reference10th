/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.datatypes.booleans;

/**
 * boolean Datatype puede tener dos valores posibles: true y false
 * @author barcvilla
 */
public class BooleanDemo 
{
    public static void main(String[] args) {
        boolean b;
        
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        
        // un valor boolean puede controlar una sentencia if
        if(b)
        {
            System.out.println("esto es ejecutado...");
        }
        
        b = false;
        if(b)
        {
            System.out.println("esto no es ejecutado");
        }
        
        // el resultado de un operador relacional es un valor boolean
        System.out.println("10 > 9 is " + (10>9));
    }
}
