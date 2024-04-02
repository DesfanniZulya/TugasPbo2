/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikumpbo2;

import java.util.Scanner;

/**
 *
 * @author onang
 */
public class BacaInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name = "";
        boolean gameOver =true;
        int score = 11;
        int highScore=10;
          
        Scanner reader =new Scanner(System.in);
        if(gameOver && score > highScore){
             System.out.print("please input your name = ");
             name=reader.next();
              
              }
         System.out.println("thank you "+name+", ");
    }
    
}
