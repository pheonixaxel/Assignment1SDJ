package Model;

public class OffState implements HeaterSTATE
{
  private static int power = 0;

  @Override public void turnUp(Heater heater)
  {
   heater.setCurrentState(new Power1State());
  }

  @Override public void turnDown(Heater heater)
  {
  }

  @Override public int getPower()
  {
    return power;
  }
}

