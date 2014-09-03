package Digital;

import java.awt.Image;

/**
 * The LED component is used to visually represent gate outputs. It accepts only one input and 
 * visualises it as on or off depending on the value provided.
 *
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class LED extends javax.swing.JPanel {

    // Image representations of an LED
    private final Image onImage, offImage;
    private Image currentImage;

    // Input to LED
    private Terminal input;

    // Locations of the images
    private static final String onImageLocation = "images/LED_on.gif",
            offImageLocation = "images/LED_off.gif";

    /**
     * Creates an LED object and intialises its images
     */
    public LED() {
        
        // Initialise image urls
        java.net.URL onImageUrl = getClass().getResource(onImageLocation);
        java.net.URL offImageUrl = getClass().getResource(offImageLocation);

        // Set image fields
        onImage = new javax.swing.ImageIcon(onImageUrl).getImage();
        offImage = new javax.swing.ImageIcon(offImageUrl).getImage();

        // Set current state, off is default
        currentImage = offImage;

        // Resize component to match image
        this.setSize(onImage.getWidth(null), onImage.getHeight(null));
    }

    /**
     * Set the value of input
     *
     * @param input new value of input
     */
    public void setInput(Terminal input) {
        this.input = input;
    }
    
    /**
     * Get the value of input
     * 
     * @return the value of input
     */
    public Terminal getInput() {
        return input;
    }
    
    /**
     * Paints LED to screen
     *
     * @param g the Graphics object to protect
     */
    @Override
    public void paintComponent(java.awt.Graphics g) {
        
        // LED is set to off if a null value is provided, otherwise the input value sets the LED
        if (input != null && input.getValue()) {
            currentImage = onImage;
        } else {
            currentImage = offImage;
        }

        g.drawImage(currentImage, 0, 0, null);
    }

    /**
     * Triggers a call to paintComponent to repaint the LED
     *
     * @param g the Graphics object to protect
     */
    public void repaint(java.awt.Graphics g) {
        paintComponent(g);
    }
}
