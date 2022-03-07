public class Power1State implements HeaterSTATE
{
  private static final int power=1;
  private Heater state;

  public Power1State(){
    state=new Heater();
  }
  @Override public void turnUp()
  {
    state.setCurrentState(new Power2State());
  }

  @Override public void turnDown()
  {
    state.setCurrentState(new OffState());
  }

  @Override public int getPower()
  {
    return power;
  }
}

