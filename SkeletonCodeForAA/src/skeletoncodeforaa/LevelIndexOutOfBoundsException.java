/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class LevelIndexOutOfBoundsException extends Exception {

    /**
     * Creates a new instance of <code>LevelIndexOutOfBoundsException</code> without detail
     * message.
     */
    public ComboException() {
    }

    /**
     * Constructs an instance of <code>LevelIndexOutOfBoundsException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public LevelIndexOutOfBoundsException(String msg) {
        super(msg);
    }
}