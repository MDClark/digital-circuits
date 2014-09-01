package Digital;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Concrete implementation of the Terminal interface.
 *
 * Used for storing and retrieving the a boolean value, and notifying the system of updates to the
 * value.
 *
 * @author Jordan Hennell n8331472
 * @author Michael Clark n8583331
 */
public class OutputTerminal implements Terminal {

    // Bound property for OutputTerminal's value
    private boolean value;
    public static final String PROP_VALUE = "Value";
    private transient final PropertyChangeSupport propertyChangeSupport
            = new PropertyChangeSupport(this);

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(boolean value) {
        boolean oldValue = this.value;
        this.value = value;
        propertyChangeSupport.firePropertyChange(PROP_VALUE, oldValue, value);
    }

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    /**
     * Get the value of value
     *
     * @return the value of value
     */
    @Override
    public boolean getValue() {
        return value;
    }
}