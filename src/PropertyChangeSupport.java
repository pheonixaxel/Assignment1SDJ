import java.beans.PropertyChangeListener;

public class PropertyChangeSupport
{
  public void addPropertyChangeListener(String name, PropertyChangeListener listener){};
  public void addPropertyChangeListener(PropertyChangeListener listener){};
  public void removePropertyChangeListener(String name, PropertyChangeListener listener){};
  public void removePropertyChangeListener(PropertyChangeListener listener){};
}
