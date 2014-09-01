package Digital;

/**
 * An OR Gate is a type of Gate that outputs true if one of its two inputs is true
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class ORGate extends BinaryGate {
    /**
     * Creates an ORGate object and sets its image
     */
    public ORGate() {
        super("images/OR.gif");
    }

    /**
     * Outputs true if either input is true
     */
    @Override
    protected void recompute() {
        
        // Utilise the logical OR operator to set the value of the gate
        this.getOutput().setValue(
                getTerminalValue(this.getInput0()) || getTerminalValue(this.getInput1()));
    }
}
