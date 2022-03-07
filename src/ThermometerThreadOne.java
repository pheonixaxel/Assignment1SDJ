public class ThermometerThreadOne implements Runnable
{
    private Thermometer thermometer;

  public ThermometerThreadOne(Thermometer thermometer)
  {
    this.thermometer = thermometer;
  }

  @Override public void run()
  {
      for (int i = 0; i < 10; i++)
      {
        try
        {
          Thread.sleep(1000);
          System.out.println("T1: "+thermometer.calcTemp(1)+"\n");
        } catch (InterruptedException e) {}
      }
  }
}
