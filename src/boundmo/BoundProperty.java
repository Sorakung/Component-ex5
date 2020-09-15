/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundmo;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author black
 */
public class BoundProperty implements Serializable {
    
    public static final String VALUE_PROPERTY = "Value";
    
    private String Value;
    
    private PropertyChangeSupport propertySupport;
    
    public BoundProperty() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getValue() {
        return Value;
    }
    
    public void setValue(String value) {
        String oldValue = this.Value;
        this.Value = value;
        propertySupport.firePropertyChange(VALUE_PROPERTY, oldValue, value);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
