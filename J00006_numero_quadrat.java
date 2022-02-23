//Programa que devuelva el cuadrado de un numero

package DAM_CORNELLA;

import java.util.Scanner;

public class J00006_numero_quadrat {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter the number");
        int number = keyboard.nextInt();
        
        System.out.println("the result of " +number+ " * " + number + " is: " + number*number);
    }
}   