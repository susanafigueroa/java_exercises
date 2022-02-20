//Teniendo en cuenta que la llave es EUREKA, esceibir algoritmo
//que pida la llave. Solo tenemos 3 intentos para encertar la llave.
//Si fallamos los 3 intentos nos mostrara mensaje indicando que hemos
//agotado los 3 intentos.
//Si acertamos la llave saldremos directamente del programa.

package DAM_CORNELLA;

import java.util.Scanner;
import java.util.ArrayList;

public class J00005_EUREKA_3_intentos_llave {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String key = "EUREKA";
        
        String keyUser = "";
        
        int count = 0;
        
        while ((! keyUser.equals(key)) && (count < 3)){
            count++;
            System.out.println("enter the key");
            keyUser = keyboard.nextLine();
        }
        if (keyUser.equals(key)){
            System.out.println("congratulations!");
        } else {
            System.out.println("im so sorry... bad for you.");
        }
    }
}   