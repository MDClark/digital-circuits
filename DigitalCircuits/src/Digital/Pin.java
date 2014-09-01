package Digital;

/**
 * A Pin reproduces the input it is given. A Pin takes only one input and outputs the value it is 
 * given. 
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class Pin extends UnaryGate {
    /**
     * Creates a Pin object and sets it's image
     */
    public Pin() {
        super("images/PIN.gif");
    }

    /**
     * Outputs true iff the input is true
     */
    @Override
    protected void recompute() {
        
        // Set the value of the gate to the value of the input
         this.getOutput().setValue(getTerminalValue(this.getInput0()));
    }
}
