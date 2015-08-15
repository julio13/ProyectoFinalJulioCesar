/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inico;

import java.util.Random;


public class ComoJugar {
    
    public int[] getCardNumbers() {
        
        int[] numbers = new int[16];
        int con = 0;
        
        while(con < 16) {
            Random a = new Random();
            int ice = a.nextInt(8) + 1;
            int b = 0;
            
            for (int i = 0; i < 16; i++) {
                if(numbers[i] == ice) {
                    b++;
                }
            }
            if(b < 2) {
                numbers[con] = ice;
                con++;
            }//fin
            
        }
        
        
        return numbers;
    }
            
}
