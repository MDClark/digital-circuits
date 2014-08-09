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
public class ANDGate extends javax.swing.JPanel {

    private final Image image;

    public ANDGate() {
        /// Grab image for visual representation of ANDGate
        java.net.URL url = getClass().getResource("images/AND.gif");
        image = new javax.swing.ImageIcon(url).getImage();
        this.setSize(image.getWidth(null), image.getHeight(null));
    }

    @Override
    public void paintComponent(java.awt.Graphics g) {
        g.drawImage(image, 0, 0, null);
    }
}
