/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_6;

/**
 *
 * @author mamas
 */
public class nestedloop {
    public static void main(String[] args) {
        for(int i =0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println(".........................");
        for(int i =0; i<5; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
