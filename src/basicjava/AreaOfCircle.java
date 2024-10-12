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
public class AreaOfCircle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, area;
        
        System.out.print("Enter Radius :");
        radius = input.nextDouble();
        
        area = 3.1416 * radius * radius;
        
        System.out.println("Area of Circle : "+area);
    }
    
}
