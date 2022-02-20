//Hacer un programa que muestre por pantalla:
//1-Sumar
//2-Restar
//3-Multiplicar
//4-Dividir
//5-Salir

//caso 1: pedir dos numeros, mostrar suma por pantalla
//caso 2: pedir dos numeros, mostrar resta por pantalla
//caso 3: pedir dos numeros, mostrar producto por pantalla
//caso 4: pedir dos numeros, si el segundo es 0 error, sino hacer division

package DAM_CORNELLA;

import java.util.Scanner;

public class J00001_calculadora {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int numberA = 0;
        
        int numberB = 0;
        
        int selectOption = 8;
        
        System.out.println("enter the numberA");
        numberA = keyboard.nextInt();
        
        System.out.println("enter the numberB");
        numberB = keyboard.nextInt();
        
        while (selectOption != 0){
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Salir");
            
            System.out.println("Introduce la opcion que quieres usar:");
            selectOption = keyboard.nextInt();                
            
            if (selectOption == 1){
                System.out.println("la suma es" + (numberA + numberB));
            } else if (selectOption == 2){
                System.out.println("la resta es" + (numberA - numberB));
            } else if (selectOption == 3){
                System.out.println("la multiplicacion es" + (numberA * numberB));
            } else if (selectOption == 4){
                if (numberB == 0){
                    System.out.println("error, el segundo numero no puede ser un 0");
                } else {
                    System.out.println("la division es" + (numberA / numberB));
                }
            }
        }
    }
}   