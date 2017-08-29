/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio07;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creando objeto Scanner 
        Scanner input = new Scanner(System.in);
        
        // Mostrando mensaje al usuario
        System.out.print("INGRESE LA DISTANCIA A RECORRER: ");
        double distancia = input.nextDouble();
        
        System.out.print("INGRESE MILLAS POR GALON: ");
        double millasPorGalon = input.nextDouble();
        
        System.out.print("INGRESE PRECIO POR GALON: ");
        double precioPorGalon = input.nextDouble();
        
        // Calcular el costo de viaje en auto
        double costoViaje = (distancia / millasPorGalon) * precioPorGalon;
        
        // Mostrando resultado 
        System.out.println("EL COSTO DE VIAJE EN AUTO ES $" + costoViaje);
        
        
    }
    
}
