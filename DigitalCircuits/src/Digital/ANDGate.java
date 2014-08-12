/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Clarky
 */
public class ANDGate extends javax.swing.JPanel implements PropertyChangeListener {

    // Image representation of AND gate
    private final Image image;

    // ???
    private OutputTerminal output = new OutputTerminal();

    private Terminal Input0;
    private Terminal Input1;

    public ANDGate() {
        System.out.println("IN CONSTRUCTOR");
        /// Grab image for visual representation of ANDGate
        java.net.URL url = getClass().getResource("images/AND.gif");
        image = new javax.swing.ImageIcon(url).getImage();
        this.setSize(image.getWidth(null), image.getHeight(null));

    }

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
        System.out.println("IN PROPERTYCHANGE");
        recompute();
    }

    private void recompute() {
        System.out.println("IN RECOMPUTE");
        output.setValue(getTerminalValue(Input0) && getTerminalValue(Input1));
    }

    private boolean getTerminalValue(Terminal t) {
        if (t == null) {
            return false;
        } else {
            return t.getValue();
        }
    }
}
