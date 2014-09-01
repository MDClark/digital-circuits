package Digital;

import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * A Unary Gate accepts one input and produces an output.
 * The value of the output depends on the type of Unary Gate and the value of the input.
 * 
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public abstract class UnaryGate extends javax.swing.JPanel implements PropertyChangeListener {
    
    // Image representation of a gate
    private final Image image;

    // Output of gate
    private final OutputTerminal output = new OutputTerminal();

    // Input to gate 
    private Terminal input0;

    /**
     * Creates a UnaryGate object and sets its image
     * 
     * @param imageLocation the location of the image to use
     */
    public UnaryGate(String imageLocation) {
        
        /// Grab image for visual representation of a gate
        java.net.URL url = getClass().getResource(imageLocation);
        image = new javax.swing.ImageIcon(url).getImage();

        // Resize component to match image
        this.setSize(image.getWidth(null), image.getHeight(null));
    }

    /**
     * Paints image to screen
     * 
     * @param g the Graphics object to protect
     */
    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

    /**
     * Get the output terminal of a gate
     *
     * @return the OutputTerminal
     */
    public OutputTerminal getOutput() {
        return output;
    }

    /**
     * Get the value of input0
     *
     * @return the value of input0
     */
    public Terminal getInput0() {
        return input0;
    }

    /**
     * Set the value of input0
     *
     * @param input0 new value of input0
     */
    public void setInput0(Terminal input0) {
        this.input0 = input0;
        
        recompute();
        
        // Do not add a listener if the value is null
        if (input0 != null) {
            this.input0.addPropertyChangeListener(this);
        }
    }

    /**
     * TODO ---------------------------------------------------------------------------------------
     * It seems that this method is for bound properties only, and we don't have any?
     * Still not sure about this...
     * 
     * @param evt 
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        recompute();
    }
    
    /**
     * Returns the value of a terminal. A null value returns false.
     * 
     * @param t the terminal to get the value of
     * @return the value of the Terminal
     */
    protected boolean getTerminalValue(Terminal t) {
        if (t == null) {
            return false;
        } else {
            return t.getValue();
        }
    }
    
    
    /**
     * Recalculate the output of a logic gate
     */
    protected abstract void recompute();  
}