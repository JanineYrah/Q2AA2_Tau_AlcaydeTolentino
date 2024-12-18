/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class Potion extends Item {
    
    private boolean used;
    private String type;
    private int specialEffect;
    
    public Potion(String n, String d, String s, int S){
        super(n,d,s);
        used = false;
        specialEffect = S;
    }
    
    public String getType(){
        return type;
    }
    
    public int getSpecialEffect(){
        return specialEffect;
    }
}
