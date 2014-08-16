package Digital;

/**
 * A NOT Gate is a type of Gate that outputs true iff the input is false
 * 
 * @author Jordan
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
         this.getOutput().setValue(!getTerminalValue(this.getInput0()));
    }
}
