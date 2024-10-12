/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

import java.util.Scanner;

/**
 *
 * @author MIKE
 */
public class TemperatureConverter {
    
    public static void main(String[] args) {
        // Write a program = Fahrenheit and Celsius Conversion;
        
        /*Celsius to Fahrenheit;
        F = 9/5 * C + 32;
        */
        
        /*Fahrenheit to Celsius;
        C = 5/9 * (F - 32);
        */
                
        Scanner input = new Scanner(System.in);
        double cels, farn;
        
        System.out.print("Enter Celsius : ");
        cels = input.nextDouble();
        
        farn = 1.8 * cels + 32;
        
        System.out.println("Farenheit : "+farn);
        
    }   
}
