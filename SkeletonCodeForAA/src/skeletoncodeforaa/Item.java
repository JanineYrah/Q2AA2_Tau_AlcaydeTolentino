/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public abstract class Item {
    protected String name, description, status;
    
    public Item (String n, String d, String s){
        name = n;
        description = d;
        status = s;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getStatus(){
        return status;
    }
    
}
