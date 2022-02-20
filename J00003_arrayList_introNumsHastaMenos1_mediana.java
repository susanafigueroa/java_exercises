//Dada una secuencia de numeros introducida por el usuario (que termina en -1)
//realizar un algoritmo que calcule la mediana
//Suponemos que el usuario no introduce numeros negativos

package DAM_CORNELLA;

import java.util.Scanner;
import java.util.ArrayList;

public class J00003_arrayList_introNumsHastaMenos1_mediana {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList nums = new ArrayList();
        
        //si quisiera hacer un array de int array ArrayList nameArrayList<Integer> = new ArrayList<Integer>
        
        int count = 0;
        int num = 0;
        
        System.out.println("enter a sequence of numbers , the last number will be -1");
        
        while (num != -1){
            System.out.println("enter a digit for the nums");
            num = keyboard.nextInt();
            
            nums.add(count, num);
            count++;
        }
        
        System.out.println("the list of numbers is" + nums);
        
        System.out.println("print the lenght of the arrayList" + count);
                        
        int suma = 0;
        
        for ( int k = 0; k < count ; k++ ){
            suma = suma +(int)nums.get(k);
        }
        
        //per saber la mitjana aritmètica: (a+b+c)/total -> total is count

        System.out.println("la mitjana es" + suma/count); 
    }
}   