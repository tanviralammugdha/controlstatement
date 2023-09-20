/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author MY PC
 */
 import java.util.Scanner;
public class JavaApplication7 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number");
        int a =sc.nextInt();
        System.out.print("Enter the second number");
        int b =sc.nextInt();
        if(a>b){
        System.out.print("first number big" +a);
       
        
        }
        else{
        System.out.print("second number is big"+b);
        
        }
        
        
        
        
        
    }
    
    
    
}
