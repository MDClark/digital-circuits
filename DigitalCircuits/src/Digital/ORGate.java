package Digital;

/**
 * An OR Gate is a type of Gate that outputs true if either of it's inputs is true
 * 
 * @author Jordan
 */
public class ORGate extends BinaryGate {
    

    /**
     * Creates an ORGate object and sets it's image
     */
    public ORGate() {
        super("images/OR.gif");
    }

    /**
     * Outputs true if either input is true
     */
    @Override
    protected void recompute() {
        this.getOutput().setValue(
                getTerminalValue(this.getInput0()) || getTerminalValue(this.getInput1()));
    }
}
