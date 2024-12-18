/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class Enemy extends Character {
    protected String element, strongAgainst, weakAgainst;
    protected int tier;
    protected boolean provoked;
    
    public Enemy(String n, int h,int a,float d,int A,int m,Floor f,Invetory i, String S, String W, String E, int T){
        super(n,h,a,d,A,m,f,i);
        element = E;
        strongAgainst = S;
        weakAgainst = W;
        tier = T;
        provoked = false;
    }
    
    public void spawn(Surrounding s){
        //spawn enemy in a surrounding
    }
}
