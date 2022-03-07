public class OffState implements HeaterSTATE
{
  private static int power = 0;

  @Override public void turnUp(Heater heater)
  {
    power++;
  }

  @Override public void turnDown(Heater heater)
  {
   // nothing
  }

  @Override public int getPower()
  {
    return power;
  }
}
