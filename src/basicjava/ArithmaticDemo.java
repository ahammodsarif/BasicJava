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
public class ArithmaticDemo {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2, result;
        
        System.out.print("Enter given first number = ");
        num1 = input.nextInt();
        
        System.out.print("Enter given second number = ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Subtractor = "+result);
        
        result = num1 * num2;
        System.out.println("Multiplication = "+result);
        
        double result2 = (double) num1 / num2;
        System.out.println("Divided = "+result2);
        
        result = num1 % num2;
        System.out.println("Reminder = "+result);
    }
    
}
