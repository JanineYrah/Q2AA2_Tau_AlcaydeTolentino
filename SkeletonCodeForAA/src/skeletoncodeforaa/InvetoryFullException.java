/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package skeletoncodeforaa;

/**
 *
 * @author Vaio
 */
public class InvetoryFullException extends Exception {

    /**
     * Creates a new instance of <code>InvetoryFullException</code> without
     * detail message.
     */
    public InvetoryFullException() {
    }

    /**
     * Constructs an instance of <code>InvetoryFullException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvetoryFullException(String msg) {
        super(msg);
    }
}
