public class Power3State implements HeaterSTATE
{

  private static final int power=3;

  public Power3State(Heater heater)
  {
    try{
      Thread.sleep(3000);
      heater.setCurrentState(new Power2State());
    }
    catch (InterruptedException e){}
  }
  @Override public void turnUp(Heater heater)
  {
  }

  @Override public void turnDown(Heater heater)
  {
    heater.setCurrentState(new Power2State());
  }

  @Override public int getPower()
  {
    return power;
  }
}
