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
public class InputDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        
        System.out.println("The name is : "+name);
        
        
        double num1;
        System.out.print("Enter your double value : ");
        num1 = input.nextDouble();
        
        System.out.println("The double value is : "+num1);
        
        
        
        int number;
        System.out.print("Enter any Number : ");
        number = input.nextInt();
        
        System.out.println("Number = "+number);
    }
    
}
