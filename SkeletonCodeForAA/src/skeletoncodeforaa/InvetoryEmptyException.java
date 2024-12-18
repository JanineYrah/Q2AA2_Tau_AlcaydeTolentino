/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class InvetoryEmptyException extends Exception{

    /**
     * Creates a new instance of <code>InvetoryEmptyException</code> without
     * detail message.
     */
    public InvetoryEmptyException() {
    }

    /**
     * Constructs an instance of <code>InvetoryEmptyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvetoryEmptyException(String msg) {
        super(msg);
    }
}
