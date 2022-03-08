package Model;

import java.beans.PropertyChangeSupport;

public class ThermometerThreadOne implements Runnable
{
    private Thermometer thermometer;
    private PropertyChangeSupport propertyChangeSupport;

  public ThermometerThreadOne(Thermometer thermometer)
  {
    this.thermometer = thermometer;
  }

  @Override public void run()
  {
      while(true)
      {
        try
        {
          Thread.sleep(8000);
          propertyChangeSupport.firePropertyChange("Measured1",thermometer.getTemp(),thermometer.calcTemp(8));
        } catch (InterruptedException e) {}
      }
  }
}
