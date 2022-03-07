import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Heater implements PropertyChangeSubject
{
  private HeaterSTATE currentState = new OffState();
  private PropertyChangeSupport powerChangeSupport = new PropertyChangeSupport(this);


  public void turnUp(){

  }
  public void turnDown(){

  }
  public void getPower(){

  }
  public void setCurrentState(HeaterSTATE currentState)
  {
    this.currentState = currentState;
    powerChangeSupport.firePropertyChange("PowerChanged",0,currentState.getPower());
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    powerChangeSupport.addPropertyChangeListener(name,listener);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    powerChangeSupport.addPropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    powerChangeSupport.removePropertyChangeListener(name,listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    powerChangeSupport.removePropertyChangeListener(listener);
  }
}

