/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

/**
 * An AND Gate is a type of Gate that outputs true iff both of the input values are true 
 * 
 * @author Clarky
 */
public class ANDGate extends BinaryGate {

    /**
     * Creates an ANDGate object and sets it's image
     */
    public ANDGate() {
        super("images/AND.gif");
    }

    /**
     * Outputs true iff both of the input values are true
     */
    @Override
    protected void recompute() {
        output.setValue(getTerminalValue(Input0) && getTerminalValue(Input1));
    }
}
