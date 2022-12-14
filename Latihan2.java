/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_8;

/**
 *
 * @author Nila Enjeli
 */
public class Latihan2 {
    public static void main(String[] args){
        
        //arguments = java ArithmeticOperation 20 4
        
        
        double a = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);
        
        double sum,difference,product,quotient;
        
        sum = a + b;
        difference = a - b;
        product = a * b;
        quotient = a / b ;
        
        System.out.println("Sum         = " + sum);
        System.out.println("Difference  = " + difference);
        System.out.println("Product     = " + product);
        System.out.println("Quotiennt   = " + quotient);
        
    }
    
}
