package Model;

public class SummerHouse implements Model
{
  private Thermometer t1;
  private Thermometer t2;
  private Heater heater;
  private final double outdoorTemp =-5.;

  public SummerHouse(Thermometer inDoorTherm1, Thermometer inDoorTherm2, Heater heater)
  {
    this.t1 = inDoorTherm1;
    this.t2 = inDoorTherm2;
    this.heater = heater;
    heater.setCurrentState(new OffState());
  }

  @Override public Thermometer getT1()
  {
    return t1;
  }

  @Override public Thermometer getT2()
  {
    return t2;
  }

  @Override public Heater getHeater()
  {
    return heater;
  }

  @Override public double getOutdoorTemp(){return outdoorTemp;}
}
