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
public class Invetory {
    private ArrayList<Item> invetory;
    private int maxCapacity;
    
    public Invetory (Item n, int a){
        invetory.add(n);
        maxCapacity = a;
    }
    
    public ArrayList<Item> getInvetoryList(){
        return invetory;
    }
    
    public int getMaxCapacity(){
        return maxCapacity;
    }
}
