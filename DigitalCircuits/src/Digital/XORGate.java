package Digital;

/**
 * An XOR Gate is a type of Gate that outputs true iff one of the inputs is true
 * 
 * @author Jordan
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
        output.setValue(getTerminalValue(Input0) ^ getTerminalValue(Input1));
    }
}
