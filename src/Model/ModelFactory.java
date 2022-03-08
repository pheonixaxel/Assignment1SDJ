package Model;

public class ModelFactory
{
  private Model model;

  public Model getModel()
  {
    if(model==null)
    {
      Heater heater = new Heater(0);
      Thermometer t1 = new Thermometer(0,1,10.,heater);
      Thermometer t2 = new Thermometer(0,7,10.,heater);
      model = new SummerHouse(t1,t2,heater);
    }

    return model;
  }
}
