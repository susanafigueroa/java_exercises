//Escribir un programa que pregunte al usuario:
//nombre, y luego lo salude
//dos numeros y luego muestre el producto de ambos

package DAM_CORNELLA;

import java.util.Scanner;

public class J00007_nom_dosNums_producte {
    public static void main(String[] args) {
        Scanner keyboardString = new Scanner(System.in);
        Scanner keyboardInt = new Scanner(System.in);

        System.out.println("enter your name ");
        String name = keyboardString.nextLine();
        
        System.out.println(nombre(name));
                
        System.out.println("enter the number a ");
        double a = keyboardInt.nextDouble();
        
        System.out.println("enter the number b ");
        double b = keyboardInt.nextDouble();
        
        System.out.println("the mult " +a+ " * " +b+ " is " + product(a, b));
    }
    
    public static String nombre(String name){
        return name + " hello "; 
    }
    
    public static Double product(Double c, Double d){
        return c * d;
    }
}   