/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class Weapon extends Item{
    
    private int durability, atkboost;
    private String strongAgainst, weakAgainst;
    
    public Weapon(String n, String d, String s, int D, int A, String S, String W){
        super(n,d,s);
        durability = D;
        atkboost = A;
        strongAgainst = S;
        weakAgainst = W;
    }
    
    public int getDurability(){
        return durability;
    }
    
    public void setDurability(int a){
        durability = a;
    }
    
    public int getAtkboost(){
        return atkboost;
    }
    
    public String getStrongAgainst(){
        return strongAgainst;
    }
    
    public String getWeakAgainst(){
        return weakAgainst;
    }
    
    public void defend(){
        //defend
    }
    
}
