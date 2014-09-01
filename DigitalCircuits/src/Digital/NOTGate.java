package Digital;

/**
 * A NOT Gate inverses the input it is given. It accepts only one input and outputs the opposite of
 * the value it is given.
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class NOTGate extends UnaryGate {
    /**
     * Creates a NOTGate object and sets it's image
     */
    public NOTGate() {
        super("images/NOT.gif");
    }

    /**
     * Outputs true iff the input is false
     */
    @Override
    protected void recompute() {
        
        // Utilise the logical NOT operator to set the value of the gate
         this.getOutput().setValue(!getTerminalValue(this.getInput0()));
    }
}
