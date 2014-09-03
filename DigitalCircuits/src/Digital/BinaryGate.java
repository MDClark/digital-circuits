package Digital;

/**
 * A Binary Gate accepts two inputs and produces an output.
 * The value of the output depends on the type of Binary Gate and the value/s of the input/s.
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public abstract class BinaryGate extends UnaryGate {
    
    // Additional input terminal (accompanied by Input0 inherited from UnaryGate)
    private Terminal input1;

    /**
     * Constructor, calls parent constructor to set object image representation
     * 
     * @param imageLocation the location of the image to use
     */
    public BinaryGate(String imageLocation) {
        super(imageLocation);
    }

    /**
     * Get the value of input1
     *
     * @return the value of input1
     */
    public Terminal getInput1() {
        return input1;
    }

    /**
     * Set the value of input1
     *
     * @param input1 new value of input1
     */
    public void setInput1(Terminal input1) {
        this.input1 = input1;
        
        recompute();
        
        // Do not add a listener if the value is null
        if (input1 != null) {
            this.input1.addPropertyChangeListener(this);
        }
    }
}