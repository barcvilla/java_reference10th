/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.datatypes.longs;

/**
 * Numero de millas que viaja la luz en dias
 * @author barcvilla
 */
public class Light 
{
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        
        // velocidad aprox de la luz en milla x sec
        lightspeed = 186000;
        days = 1000; // numero de dias
        seconds = days * 24 * 60 * 60; // convertimos a segundos
        distance = lightspeed * seconds; // calc distancia
        
        System.out.print("En " + days);
        System.out.println(" dias la luz viajara " + distance + " en millas");
    }
}
