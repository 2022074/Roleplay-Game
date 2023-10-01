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
        
        
        
            int i = 0;
            
            do{
                try{
                    
                Scanner sc = new Scanner(System.in);
                System.out.println("After a long fight in the tunnels under the city against the traitors of the Imperium, \n"  + 
                                   "the guards have come to a 3-way division in the tunnel. \n" +
                                   "Choose which tunnel the guards will take in order to find the remaining traitor troops and stop their plan:");
                System.out.println( "1. Left Tunnel \n"   +
                                    "2. Center Tunnel \n" +
                                    "3. Right Tunnel");
                int userChoice = sc.nextInt();
                
                switch(userChoice){
                    case 1:
                        System.out.println("The guards go through the Left Tunnel... \n" + 
                                           "After a couple of minutes of running the end up at a dead end and they hear the sounds of a massive explosion and the ground shaking. \n" + 
                                           "They failed to find the traitors in time, the city is gone and the tunnel is collapsing... \n" + 
                                           "BAD ENDING");
                        i++;
                        break;
                    
                    case 2:
                        System.out.println("The guards go through the Center Tunnel... \n" + 
                                           "Not even 5 minutes later the guards get ambushed from both sides by the traitors. \n" + 
                                           "While their losses are massive, the guards are able to push through and arrive to the chamber where the bomb is located. \n" +
                                           "The guards are able to deactivate the bomb in time and save the city even while under heavy fire from the remaining traitors... \n" + 
                                           "GOOD ENDING");
                        i++;
                        break;
                        
                    case 3:
                        System.out.println("The guards go through the Right Tunnel... \n" + 
                                           "The tunnel twists and weaves in different directions, after what felt like hours the guards start hearing distant talking. \n" + 
                                           "Sneaking becomes the best choice to avoid the traitor forces from discovering the guards, 3 lone specialists go forth to scout ahead. \n"+ 
                                           "One of them finds the bomb in the center of the chamber the traitors have choosen as their last stand, they procede to make their way to the device. \n"+
                                           "The device is carefully and quietly deactivaded without the traitors noticing, and the specialists plant explosives to get rid of the unaware traitors. \n" + 
                                           "The explosives go off, annihilating the traitor forces and getting rid of the bomb as well without suffering any casualties... \n" + 
                                           "PERFECT ENDING");
                        i++;
                        break;
                        
                    default:
                        System.out.println("Sorry, that was not an available choice, try again!");
                }
                
                }catch(Exception e){
            System.out.println("Sorry, only numbers are an accepted answer, try again!");
    }
            }while(i == 0);
            
        System.out.println("Thanks for playing!");
        
        
}
}
