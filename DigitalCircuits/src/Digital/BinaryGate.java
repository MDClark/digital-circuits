package Digital;

import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * A Binary Gate accepts two inputs and produces an output
 * The value of the output depends on the type of Binary Gate and the value/s of the input/s
 * 
 * @author Jordan
 */
public abstract class BinaryGate extends javax.swing.JPanel implements PropertyChangeListener {
    // Image representation of AND gate
    private final Image image;

    // Single output terminal
    protected final OutputTerminal output = new OutputTerminal();

    // inputs
    protected Terminal Input0;
    protected Terminal Input1;

    /**
     * Creates a BinaryGate object and sets it's image
     * 
     * @param imageLocation the location of the image to use
     */
    public BinaryGate(String imageLocation) {
        /// Grab image for visual representation of ANDGate
        java.net.URL url = getClass().getResource(imageLocation);
        image = new javax.swing.ImageIcon(url).getImage();

        // resize component to match image
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
     * Get the value of Output
     *
     * @return the value of Output
     */
    public Terminal getOutput() {
        return output;
    }

    /**
     * Get the value of Input0
     *
     * @return the value of Input0
     */
    public Terminal getInput0() {
        return Input0;
    }

    /**
     * Set the value of Input0
     *
     * @param Input0 new value of Input0
     */
    public void setInput0(Terminal Input0) {
        this.Input0 = Input0;
        recompute();
        if (Input0 != null) {
            this.Input0.addPropertyChangeListener(this);
        }
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        recompute();
    }

    /**
     *
     * @param t
     * @return
     */
    protected boolean getTerminalValue(Terminal t) {
        if (t == null) {
            return false;
        } else {
            return t.getValue();
        }
    }
    
    
    /**
     * Determines the output of a BinaryGate
     */
    protected abstract void recompute();
    
}
