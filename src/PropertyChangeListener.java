import java.beans.PropertyChangeEvent;

public interface PropertyChangeListener extends java.util.EventListener
{
  void propertyChange(PropertyChangeEvent evt);
}
