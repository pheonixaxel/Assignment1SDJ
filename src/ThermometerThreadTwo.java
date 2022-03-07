public class ThermometerThreadTwo implements Runnable
{
  private Thermometer thermometer;

  public void setThermometer(Thermometer thermometer)
  {
    this.thermometer = thermometer;
  }

  @Override public void run()
  {
    for (int i = 0; i < 10; i++)
    {
      try
      {
        Thread.sleep(8000);
        thermometer.calcTemp(8);
      }
      catch (InterruptedException e)
      {
      }
    }
  }
}
