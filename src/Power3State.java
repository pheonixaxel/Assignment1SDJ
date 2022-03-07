public class Power3State implements HeaterSTATE
{

  private static final int power=3;
  private Heater state;

  public Power3State(Heater heater)
  {
    try{
    Thread.sleep(4000);
   heater.setCurrentState(new Power2State());}
    catch (InterruptedException e){
      e.printStackTrace();
    }
  }
  @Override public void turnUp(Heater heater)
  {
  }

  @Override public void turnDown(Heater heater)
  {
    Thread.interrupted();
    heater.setCurrentState(new Power2State());
  }

  @Override public int getPower()
  {
    return power;
  }
}
