public class ThermometerThreadOne implements Runnable
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
          Thread.sleep(4000);
          thermometer.calcTemp(4);
        } catch (InterruptedException e) {}
      }
  }
}
