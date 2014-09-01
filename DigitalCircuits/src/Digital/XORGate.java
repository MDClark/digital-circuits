package Digital;

/**
 * An XOR Gate is a type of Gate that outputs true iff one of its two inputs is true
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class XORGate extends BinaryGate {
    /**
     * Creates an XORGate object and sets it's image
     */
    public XORGate() {
        super("images/XOR.gif");
    }

    /**
     * Outputs true if either input is true
     */
    @Override
    protected void recompute() {
        
        // Utilise the bitwise exlusive OR operator to set the value of this gate
         this.getOutput().setValue(
                getTerminalValue(this.getInput0()) ^ getTerminalValue(this.getInput1()));
    }
}
