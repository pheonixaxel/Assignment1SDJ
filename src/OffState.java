public class OffState implements HeaterSTATE
{
  private static int power = 0;
  private Heater state;
  public OffState(){
    state=new Heater();
  }

  @Override public void turnUp()
  {
   state.setCurrentState(new Power1State());
  }

  @Override public void turnDown()
  {
  }

  @Override public int getPower()
  {
    return power;
  }
}

