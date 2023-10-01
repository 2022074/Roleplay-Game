/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roleplay.game;

import java.util.Scanner;

/**
 *
 * @author achap
 */
public class RoleplayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            int i = 0;
            
            do{
                System.out.println("After a long fight in the tunnels under the city against the traitors of the Imperium, the guards have come to a 3-way division in the tunnel." +
                                   "Choose which tunnel the guards will take in order to find the remaining traitor troops and stop their plan:");
                System.out.println( "1. Left Tunnel"   +
                                    "2. Center Tunnel" +
                                    "3. Right Tunnel");
                int userChoice = sc.nextInt();
                
                switch(userChoice){
                    case 1:
                        System.out.println("The guards go through the Left Tunnel..." + 
                                           "After a couple of minutes of running the end up at a dead end, while they hear the sounds of a massive explosion and the ground shaking." + 
                                           "They failed to find the traitors in time, the city is gone and the tunnel is collapsing..." + 
                                           "BAD ENDING");
                        i++;
                        break;
                    
                    case 2:
            }
            }while(i == 1);
            
    }catch(Exception e){
            System.out.println("Sorry, that was not an available choice, try again!");
    }
        
        
}
}
