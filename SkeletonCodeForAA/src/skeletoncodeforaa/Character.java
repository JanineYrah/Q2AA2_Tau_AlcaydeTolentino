/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skeletoncodeforaa;
import java.util.ArrayList;
/**
 *
 * @author Vaio
 */
public class Character {
    protected String name;
    protected int maxhp,hp, baseAttack, baseAgility, maxEquipped;
    protected Item currentItem;
    protected double baseDefense;
    protected Floor currentFloor;
    protected Surrounding currentSurrounding;
    protected Inventory inventory;
    
    public Character(String name, int hp, int attack, double defense, int agility, int maxEquipped, Floor floor, Invetory inventory){
        this.name = name;
        this.maxhp = hp;
        this.hp = hp;
        this.baseAttack = attack;
        this.baseDefense = defense;
        this.baseAgility = agility;
        this.maxEquipped = maxEquipped;
        this.currentFloor = floor;
        this.inventory = inventory;
    }
    
    public int getHp(){
        return hp;
    }
    
    public void setHp(int a){
        hp = a;
    }
    
    public double getDefense(){
        return baseDefense;
    }
    
    public void setDefense(int a){
        baseDefense = a;
    }
    
    public int getAgility(){
        return baseAgility;
    }
    
    public void setAgility(int a){
        baseAgility = a;
    }
    
    public int getMaxEquipped(){
        return maxEquipped;
    }
    
    public int getAtk(){
        return baseAttack;
    }
    
    public Invetory getInventory(){
        return inventory;
    }
    
    public Floor getFloor(){
        return currentFloor;
    }
    
    public void attack(Character c){
        int health = c.getHp();
        health -= (c.getDefense()*baseAttack);
        c.setHp(health);
    }
    
    public void defend(Character c){
        System.out.println(name + " defended theirself! They won't take any damage");
    }
    
    
    public int[] findValue(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) { // Loop through columns
                if (array[row][col] == target) { // Check if the value matches
                    return new int[] {row, col}; // Return row and column as an array
                }
            }
        }
        return new int[] {-1, -1}; // Return -1, -1 if the value is not found
    }   
    
    public static void move(int[][] arr, int row, int col, String direction) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Determine the new position based on the direction
        int newRow = row, newCol = col;
        switch (direction.toLowerCase()) {
            case "up":
                newRow = row - 1;
                break;
            case "down":
                newRow = row + 1;
                break;
            case "left":
                newCol = col - 1;
                break;
            case "right":
                newCol = col + 1;
                break;
            default:
                System.out.println("Invalid direction. Use 'up', 'down', 'left', or 'right'.");
                return;
        }
    }
    
    public void sprint(String direction){
        int[][] Array = currentSurrounding.getArray();
        
        int[] position = findValue(Array, 8);
        currentPosition = position;
        System.out.println(position);
        
        move(Array, currentRow, currentColumn, direction);
        currentSurrounding.setArray(Array);
        System.out.println(name + " sprinted!");
        
        int[][] Arrayy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayy.length; i++) {
            for (int j = 0; j < Arrayy[i].length; j++) {
                
                System.out.print(Arrayy[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    public void dash(String direction){
        int[][] Array = currentSurrounding.getArray();
        
        int[] position = findValue(Array, 8);
        currentPosition = position;
        System.out.println(position);
        
        move(Array, currentRow, currentColumn, direction);
        move(Array, currentRow, currentColumn, direction);
        currentSurrounding.setArray(Array);
        System.out.println(name + " dashed!");
        
        int[][] Arrayy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayy.length; i++) {
            for (int j = 0; j < Arrayy[i].length; j++) {
                
                System.out.print(Arrayy[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    public void roll(String direction){
        int[][] Array = currentSurrounding.getArray();
        
        int[] position = findValue(Array, 8);
        currentPosition = position;
        System.out.println(position);
        
        move(Array, currentRow, currentColumn, direction);
        move(Array, currentRow, currentColumn, direction);
        move(Array, currentRow, currentColumn, direction);
        currentSurrounding.setArray(Array);
        System.out.println(name + " rolled!");
        
        int[][] Arrayy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayy.length; i++) {
            for (int j = 0; j < Arrayy[i].length; j++) {
                
                System.out.print(Arrayy[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    public void jump(){
        int[][] Array = currentSurrounding.getArray();
        
        int[] position = findValue(Array, 8);
        currentPosition = position;
        System.out.println(position);
        
        move(Array, currentRow, currentColumn, "up");
        currentSurrounding.setArray(Array);
        System.out.println(name + " jumped!");
        
        int[][] Arrayy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayy.length; i++) {
            for (int j = 0; j < Arrayy[i].length; j++) {
                
                System.out.print(Arrayy[i][j] + " ");
            }
            
            System.out.println();
        }
        
        int[][] Arrayyy = currentSurrounding.getArray();
        
        int[] positionn = findValue(Array, 8);
        currentPosition = positionn;
        System.out.println(positionn);
        
        move(Arrayyy, currentRow, currentColumn, "down");
        currentSurrounding.setArray(Arrayyy);
        
        int[][] Arrayyyy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayyyy.length; i++) {
            for (int j = 0; j < Arrayyyy[i].length; j++) {
                
                System.out.print(Arrayyyy[i][j] + " ");
            }
            
            System.out.println();
        }
    }
    
    public void doubleJump(){
        int[][] Array = currentSurrounding.getArray();
        
        int[] position = findValue(Array, 8);
        currentPosition = position;
        System.out.println(position);
        
        move(Array, currentRow, currentColumn, "up");
        move(Array, currentRow, currentColumn, "up");
        currentSurrounding.setArray(Array);
        System.out.println(name + " double jumped!");
        
        int[][] Arrayy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayy.length; i++) {
            for (int j = 0; j < Arrayy[i].length; j++) {
                
                System.out.print(Arrayy[i][j] + " ");
            }
            
            System.out.println();
        }
        
        int[][] Arrayyy = currentSurrounding.getArray();
        
        int[] positionn = findValue(Array, 8);
        currentPosition = positionn;
        System.out.println(positionn);
        
        move(Arrayyy, currentRow, currentColumn, "down");
        move(Arrayyy, currentRow, currentColumn, "down");
        currentSurrounding.setArray(Arrayyy);
        
        int[][] Arrayyyy = currentSurrounding.getArray();
        for (int i = 0; i < Arrayyyy.length; i++) {
            for (int j = 0; j < Arrayyyy[i].length; j++) {
                
                System.out.print(Arrayyyy[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
    
    public void equipItem(Item i) throws ItemNotFoundException, MaxEquippedException{
        ArrayList<Item> list = inventory.getInvetoryList();
        if (list.contains(i)){
            list.remove(i);
            Item currentItem = i;
            System.out.println(name + " currently equips " + i);
        } else if(currentItem != null){
            throw new MaxEquippedException(name +" is already currently holding an item in their hand.");
        } else{
            throw new ItemNotFoundException("The item can not be found");
        }
    }
    
    public void unequipItem(Item i) throws ItemNotFoundException{
        ArrayList<Item> list = inventory.getInvetoryList();
        if (currentItem != null){
            list.add(i); //exception
            Item currentItem = null;
            System.out.println(name + " unequipped their item, it is stored back in their invetory.");
        } else{
            throw new ItemNotFoundException(name + " currently is not equipping any item in their hand");
        }
        
    }
    
    public void pickupItem(Item i) throws ItemNotFoundException, InventoryFullException{
        ArrayList<Item> storage = invetory.getInvetoryList();
        if (storage.size() < maxEquipped){
            storage.add(i);
            System.out.println(name + " found an item and store it in their invetory!");
        } else if(storage.size() > maxEquipped){
            throw new InventoryFullException(name +"'s invetory is full! They can't equip any more items");
        } else{
            throw new ItemNotFoundException("The item can't be found in the surrounding");
        }
    }
    
    public void useItem(Item i) throws ItemNotFoundException, InventoryEmptyException{
        ArrayList<Item> storage = inventory.getInvetoryList();
        if (storage.contains(i)){
            storage.remove(i);
            System.out.println(name + " used " + i);
        } else if(storage.size()<1){
            throw new InventoryEmptyException(name + "'s invetory is empty! They can't use any item.");
        } else{
            throw new ItemNotFoundException("The item can't be found in " + name + "'s inventory.");
        }
    }
    
    public void dropItem(Item i) throws ItemNotFoundException, InventoryEmptyException{
        ArrayList<Item> storage = inventory.getInvetoryList();
        if (storage.contains(i)){
            storage.remove(i);
            System.out.println(name + " dropped " + i);
        } else if(storage.size()<1){
            throw new InventoryEmptyException(name + "'s invetory is empty! They can't drop any item.");
        } else{
            throw new ItemNotFoundException("The item can't be found in " + name + "'s inventory.");
        }
    }
    
    public void enterFloor(Floor f){
        currentFloor = f;
    }
}
