/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class Boss extends Enemy {
    public Boss(String name, int hp, int attack, float defense, int agility, int maxEquipped,
                Floor floor, Inventory inventory, String S, String W, String E, int T){
        super(name, hp, attack, defense, agility, maxEquipped, floor, inventory, S, W, E, T);
        provoked = true;
    }
    
    public void specialMove(){
        
    }
}
