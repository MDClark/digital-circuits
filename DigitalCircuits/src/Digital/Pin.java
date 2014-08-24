package Digital;

/**
 * A Pin is a type of Gate that outputs true iff the input is true
 * 
 * @author Jordan
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
         this.getOutput().setValue(getTerminalValue(this.getInput0()));
    }
}
