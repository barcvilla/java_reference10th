/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.datatypes.pointfloat;

/**
 * double   64 bits
 * float    32 bits
 * @author barcvilla
 */
public class TestPointFloat 
{
    /**
     * Las variables de tipo float son utiles cuando se necesita un componente fraccionario, pero no requieren
     * un alto grado de precision. Por ejemplo, float puede ser util cuando se representa dolares y centavos
     */
    
    public static void demoDouble()
    {
        double pi, r, a;
        r = 10.8; // radio circulo
        pi = 3.1416; //pi approximately
        a = pi * r * r;
        
        System.out.println("Area del circulo: " + a);
    }
    
    public static void main(String[] args) 
    {
        demoDouble();
    }
}
