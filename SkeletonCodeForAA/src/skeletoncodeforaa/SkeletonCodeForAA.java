/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skeletoncodeforaa;

public class SkeletonCodeForAA {

    public static void main(String[] args) {

        //Creating variables for the sake of scenarios
        Item sword = new Item("Sword", "A sword.", "unequipped");
        Inventory playerInventory = new Inventory(sword, 10);
        Floor Hell = new Floor();
        Character player = new Character("Hadria", 20, 10, 5, 10, 2, Hell, playerInventory);

        //Use Case #1: Attack enemy with weapon
        System.out.println("Use Case #1: Attack enemy with Weapon");
        System.out.println("--------------------------------------");

        //The player encounters an Enemy in the Floor.
        //System displays this Enemy.

        //The enemy is provoked once the player is a certain distance close to them.

        //The player equips an Item from their Inventory.
        //The player attacks the enemy.

        //System checks if the Item is a Weapon:
            //If the Item is not a weapon, the player will not attack
            //System displays that they cannot attack with the equipped item.

        //System checks if the player has any potion effect that would do more or do less damage to the Enemy.
            //If they do, the player does more/less damage to the Enemy.

        //The player damages the Enemy, lowering their HP.

        //Use Case #2: Picking up an Item
        System.out.println("Use Case #2: Picking up an Item");
        System.out.println("--------------------------------------");

        //Character encounters an Item in the Surrounding of the Floor.

        //The System checks if the Character’s Inventory has reached maxCapacity:
            //If it hasn’t, the code moves on.
            //If it does, the InventoryFullException is caught.

        //The System checks if the Character is the Player or an Enemy:
            //If Player, they pick up the Item, and it gets added to itemList in their Inventory.
            //If Enemy, the System decides at random whether to pick or ignore the item.
    
        
        //Use Case #3: Equipping an Item
        System.out.println("Use Case #3: Equipping an Item");
        System.out.println("--------------------------------------");

        //A Character selects an Item from their Inventory.

        System.out.println("Do you want to equip " + sword + "?"); //The Character confirms if they want to equip the Item.

        //The System checks if the maxEquipped value has not yet been met:
            //If it has, EquippedFullException is caught, and the character cannot equip the Item.
            //If it hasn’t, the Item’s status turns into equipped
            //Item is added to the currentEquippedList.

        
        //Use Case #4: Entering a Floor
        System.out.println("Use Case #4: Entering a Floor");
        System.out.println("--------------------------------------");

        //The system checks if the Floor has been conquered (finished):
            //If it hasn't, FloorNotFinished is caught
                //The player is informed to first conquer the Floor before they can leave.
            //If it has, the player may enter the next Floor.

        //The previous Floor removes the Player from its characterList.
        //The next floor adds the player into its characterList.


        //Use Case #5: Falling Down a Hole
        System.out.println("Use Case #5: Falling Down a Hole");
        System.out.println("--------------------------------------");     

        //The player encounters a Hole in the current Floor.
            //When the hole is first generated, the system rolls a small, random chance that it will have a certain number of enemies in it.

        //The player falls down the hole.

        //The system checks how deep the Hole is:
            //If the Hole is deep enough, potion effect or not, the player instantly dies.
            //If the Hole is not deep enough to kill the player, the player is simply damaged.
    }
    
}
