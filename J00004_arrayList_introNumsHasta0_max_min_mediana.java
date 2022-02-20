//Algoritmo que lea numeros enteros hasta teclear el 0
//y nos muestre el maximo, el minimo y la media de todos ellos

package DAM_CORNELLA;

import java.util.Scanner;
import java.util.ArrayList;

public class J00004_arrayList_introNumsHasta0_max_min_mediana {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //declarar arrayList
        ArrayList llistaNums = new ArrayList();
        
        int num = 1;
        int count = 0;
        int max = 0;
        int min = 0;
        
        while ( num != 0 ){
            System.out.println("enter a digit that you want to be in the llistaNums");
            num = keyboard.nextInt();
            if (count == 0) {
                max = num;
                min = num;
            } else {    
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            count++;
            llistaNums.add(num);
        }
        
        System.out.println("print llistaNums" + llistaNums);
        
        System.out.println("max is " + max);
        
        System.out.println("min is " + min);
        
        int suma = 0;
        
        for ( int k = 0 ; k < count ; k++ ){
            suma = suma + (int)llistaNums.get(k);
        }
        
        System.out.println("la mitjana es " + suma / count);
        
    }
}   