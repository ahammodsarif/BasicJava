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
public class AreaOfTriangle {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double base, height, area;
        
        System.out.print("Enter base : ");
        base = input.nextDouble();
        
        System.out.print("Enter height : ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        
        System.out.println("Area of Trinangle : "+area);
    }
    
}
