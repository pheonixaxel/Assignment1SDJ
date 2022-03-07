public class Power2State implements HeaterSTATE
{
  private static final int power=2;
  private Heater state;

  public Power2State(){
    state=new Heater();
  }
  @Override public void turnUp()
  {
    state.setCurrentState(new Power3State());
  }

  @Override public void turnDown()
  {
    state.setCurrentState(new Power1State());
  }

  @Override public int getPower()
  {
    return power;
  }
}
