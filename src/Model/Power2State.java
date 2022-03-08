package Model;

public class Power2State implements HeaterSTATE
{
  private static final int power=2;
  @Override public void turnUp(Heater heater)
  {
    heater.setCurrentState(new Power3State(heater));
  }

  @Override public void turnDown(Heater heater)
  {
    heater.setCurrentState(new Power1State());
  }

  @Override public int getPower()
  {
    return power;
  }
}
