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
public class Floor {
    protected ArrayList<String> elementList;
    protected ArrayList<Character> characterList;
    protected ArrayList<Enemy> enemyList;
    protected String stage;
    protected boolean conquered;
    
    public Floor(ArrayList<String> E, ArrayList<Character> C, ArrayList<Enemy> e, String s){
        elementList = E;
        characterList = C;
        enemyList = e;
        stage = s;
        conquered = false;
    }
    
    public ArrayList<String> getElementList(){
        return elementList;
    }
    
    public ArrayList<Character> getCharacterList(){
        return characterList;
    }
    
    public ArrayList<Enemy> getEnemyList(){
        return enemyList;
    }
    
    public String getStage(){
        return stage;
    }
    
    public boolean getConquered(){
        return conquered;
    }
    
    
}
