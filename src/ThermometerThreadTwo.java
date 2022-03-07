public class ThermometerThreadTwo implements Runnable
{
  private Thermometer thermometer;

  public ThermometerThreadTwo(Thermometer thermometer)
  {
    this.thermometer = thermometer;
  }

  @Override public void run()
  {
    for (int i = 0; i < 10; i++)
    {
      try
      {
        Thread.sleep(2000);

        System.out.println("T2: "+thermometer.calcTemp(2)+"\n");
      }
      catch (InterruptedException e)
      {
      }
    }
  }
}
