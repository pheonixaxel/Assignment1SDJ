public class Power1State implements HeaterSTATE
{
  private static final int power=1;

  @Override public void turnUp(Heater heater)
  {
    heater.setCurrentState(new Power2State());
  }

  @Override public void turnDown(Heater heater)
  {
    heater.setCurrentState(new OffState());
  }

  @Override public int getPower()
  {
    return power;
  }
}

