//Introduce dos numeros
//Cuenta cuantos múltiples de 2 hay entre esos dos numeros
//Cuenta cuantod múltiples de 3 hay entre esos dos numeros

package DAM_CORNELLA;

import java.util.Scanner;

public class J00002_multiples_de2y3_de_N_a_M {
//Contar los numeros que son multiples de 2 o de 3 entre 2 valores que introduzca el usuario
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int a = 0;
        
        int b = 0;
    
        int countMult2 = 0;
        
        int countMult3 = 0;
        
        System.out.println("enter the value a");
        a = keyboard.nextInt();
        
        System.out.println("enter the value b");
        b = keyboard.nextInt();
       
        for ( int i = a; i < b; i++){
            if ( i % 2 == 0 ){
                countMult2++;
            } else if ( i%3 == 0){
                countMult3++;
            }
        }
        System.out.println("print countMult2" + countMult2);
        
        System.out.println("print countMult3" + countMult3);
    }
}   
