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
    public Boss(String n, int h,int a,float d,int A,int m,Floor f,Inventory i, String S, String W, String E, int T){
        super(n,h,a,d,A,m,f,i,S,W,E,T);
        provoked = true;
    }
    
    public void specialMove(){
        
    }
}
