//Programa que devuelva el cuadrado de un numero
//crearlo con funcion

package DAM_CORNELLA;

import java.util.Scanner;

public class J00006_01_numero_cuadrado {    
    //PRIMERA CLASE DE FUNCION
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("introduce un num: ");
        int num = keyboard.nextInt();
        
        int operacion = calcularCuadrado(num);
        System.out.println(operacion);
    }
    
    public static int calcularCuadrado(int num) {
        return (int)Math.pow(num, 2);
    }
}   