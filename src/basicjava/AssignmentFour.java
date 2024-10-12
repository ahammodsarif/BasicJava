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
public class AssignmentFour {
    
    public static void main(String[]args){
        
        
        Scanner input = new Scanner(System.in);
        int phonePrice, number_of_installment, installment_per_month;

        System.out.println("Phone Price 1800 Euros");
        phonePrice = 1800 ;
        
        System.out.print("Enter your number of Installment,(I'll show your per month installment amount) = ");
        number_of_installment = input.nextInt();

        installment_per_month = phonePrice / number_of_installment;
        System.out.println("Your per month installment amount : "+installment_per_month+ " euros");
        
        
    }
    
}
