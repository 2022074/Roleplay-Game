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
        
        
            int i = 0;
            
            do{
                try{
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
                        System.out.println("The guards go through the Center Tunnel..." + 
                                           "Not even 5 minutes later the guards get ambushed from both sides by the traitors." + 
                                           "While their losses are massive, the guards are able to push through and arrive to the place where the bomb is located." +
                                           "The guards are able to deactivate the bomb in time and save the city even while under heavy fire from the remaining traitors..." + 
                                           "GOOD ENDING");
                        i++;
                        break;
                        
                    
                }
                
                }catch(Exception e){
            System.out.println("Sorry, that was not an available choice, try again!");
    }
            }while(i == 1);
            
    
        
        
}
}
