public class Power3State implements HeaterSTATE
{

  private static final int power=3;
  private Heater state;

  public Power3State()
  {
    state=new Heater();
    try{
    Thread.sleep(40000);
    state.setCurrentState(new Power2State());}
    catch (InterruptedException e){
      e.printStackTrace();
    }
  }
  @Override public void turnUp()
  {
  }

  @Override public void turnDown()
  {
    Thread.interrupted();
    state.setCurrentState(new Power2State());
  }

  @Override public int getPower()
  {
    return power;
  }
}
