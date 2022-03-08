package Model;

import java.beans.PropertyChangeSupport;

public class ThermometerThreadTwo implements Runnable
{
  private Thermometer thermometer;
  private PropertyChangeSupport propertyChangeSupport;

  public ThermometerThreadTwo(Thermometer thermometer)
  {
    this.thermometer = thermometer;
  }

  @Override public void run()
  {
    while(true)
    {
      try
      {
        Thread.sleep(4000);
        propertyChangeSupport.firePropertyChange("Measured2",thermometer.getTemp(),thermometer.calcTemp(4));
      }
      catch (InterruptedException e)
      {
      }
    }
  }
}
