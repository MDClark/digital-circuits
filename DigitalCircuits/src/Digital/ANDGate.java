package Digital;

/**
 * An AND Gate is a type of Gate that outputs true iff both of the input values are true. 
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class ANDGate extends BinaryGate {

    /**
     * Creates an ANDGate object and sets it's image
     */
    public ANDGate() {
        super("images/AND.gif");
    }

    @Override
    protected void recompute() {
        
        // Utilise the logical AND operator to set the value of the gate
        this.getOutput().setValue(
                getTerminalValue(this.getInput0()) && getTerminalValue(this.getInput1()));
    }
}
