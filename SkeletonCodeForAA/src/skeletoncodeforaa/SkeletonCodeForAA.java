/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skeletoncodeforaa;

public class SkeletonCodeForAA {

    public static void main(String[] args) {

        //Use Case #1: Attack enemy with weapon
        System.out.println("Use Case #1: Attack enemy with Weapon");
        System.out.println("--------------------------------------");
        Character player = new player();
        Enemy enemy1 = new Enemy();
        enemy1.spawn(Surrounding);

        if(player.getLocation() in enemy.getSurrounding()) {
            enemy1.setProvoked(true);
            enemy.attack(player);
        }

        if (Item n instanceOf Weapon) {
            Player.attack(enemy1);
        } else {
            System.out.println("Cannot attack with the equipped Item");
        }


    
        //Use Case #2: Picking up an Item
        System.out.println("Use Case #2: Picking up an Item");
        System.out.println("--------------------------------------");




        
        //Use Case #3: Equipping an Item
        System.out.println("Use Case #3: Equipping an Itemn");
        System.out.println("--------------------------------------");



        
        //Use Case #4: Entering a Floor
        System.out.println("Use Case #4: Entering a Floor");
        System.out.println("--------------------------------------");



        

        //Use Case #5: Falling Down a Hole
        System.out.println("Use Case #5: Falling Down a Hole");
        System.out.println("--------------------------------------");        

        





        
    }
    
}
