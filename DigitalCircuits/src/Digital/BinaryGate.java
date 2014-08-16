package Digital;

/**
 * A Binary Gate accepts two inputs and produces an output
 * The value of the output depends on the type of Binary Gate and the value/s of the input/s
 * 
 * @author Jordan
 */
public abstract class BinaryGate extends UnaryGate {
    // second input
    private Terminal Input1;

    /**
     * Creates a BinaryGate object and sets it's image
     * 
     * @param imageLocation the location of the image to use
     */
    public BinaryGate(String imageLocation) {
        super(imageLocation);
    }

    /**
     * Get the value of Input1
     *
     * @return the value of Input1
     */
    public Terminal getInput1() {
        return Input1;
    }

    /**
     * Set the value of Input1
     *
     * @param Input1 new value of Input1
     */
    public void setInput1(Terminal Input1) {
        this.Input1 = Input1;
        recompute();
        if (Input1 != null) {
            this.Input1.addPropertyChangeListener(this);
        }
    }
    
}
