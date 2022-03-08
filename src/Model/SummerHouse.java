package Model;

public class SummerHouse
{
  private Thermometer inDoorTherm1;
  private Thermometer inDoorTherm2;
  private Heater heater;

  public SummerHouse(Thermometer inDoorTherm1, Thermometer inDoorTherm2, Heater heater)
  {
    this.inDoorTherm1 = inDoorTherm1;
    this.inDoorTherm2 = inDoorTherm2;
    this.heater = heater;
    heater.setCurrentState(new OffState());
  }

  public double getInDoorTherm1()
  {
    return inDoorTherm1.getTemp();
  }

  public double getInDoorTherm2()
  {
    return inDoorTherm2.getTemp();
  }

  public Heater getHeater()
  {
    return heater;
  }


}
