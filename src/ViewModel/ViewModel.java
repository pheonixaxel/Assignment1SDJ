package ViewModel;

import Model.*;

import java.text.DecimalFormat;

public class ViewModel
{
  private Model model;

  public ViewModel(Model model)
  {
    this.model = model;
  }

  public String[] getTemperature()
  {
    String[] rtrn = new String[2];
    rtrn[0]=round(model.getT1().getTemp());
    rtrn[1]=round(model.getT2().getTemp());
    return rtrn;
  }

  public double getOutdoorTemp()
  {
    return model.getOutdoorTemp();
  }

  public String averageTemp()
  {
    return round((model.getT1().getTemp()+model.getT2().getTemp())/2);
  }

  private String round(double number)
  {
    DecimalFormat format = new DecimalFormat("#.0");
    return format.format(number);
  }
}
