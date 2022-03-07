public class Heater
{
  private HeaterSTATE currentState = new OffState();

  private int power;

  public Heater(int power)
  {
    this.power = power;
  }

  public void setCurrentState(HeaterSTATE currentState)
  {
    this.currentState = currentState;
  }
}
