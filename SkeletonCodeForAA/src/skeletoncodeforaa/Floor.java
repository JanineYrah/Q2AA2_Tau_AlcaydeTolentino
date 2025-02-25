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
    
    public Floor(ArrayList<String> elementList, ArrayList<Character> characterList, ArrayList<Enemy> enemyList, String stage){
        this.elementList = elementList;
        this.characterList = characterList;
        this.enemyList = enemyList;
        this.stage = stage;
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
