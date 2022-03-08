package ViewModel;

import Model.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.text.DecimalFormat;

public class ViewModel
{
  private Model model;
  private StringProperty t1, t2;
  private PropertyChangeSupport propertyChangeSupport;

  public ViewModel(Model model)
  {
    this.model = model;
    t1 = new SimpleStringProperty("0");
    t2 = new SimpleStringProperty("0");
    ((PropertyChangeSubject) model).addPropertyChangeListener((PropertyChangeEvent evt) -> this.update());

  }

  public String[] getTemperature()
  {
    String[] rtrn = new String[2];
    rtrn[0]=round(model.getT1().getTemp());
    rtrn[1]=round(model.getT2().getTemp());
    return rtrn;
  }

  public String getOutdoorTemp()
  {
    return round(model.getOutdoorTemp());
  }

  public String averageTemp()
  {
    return round((model.getT1().getTemp()+model.getT2().getTemp())/2);
  }

  public int getPower()
  {
    return model.getHeater().getPower();
  }

  public void update()
  {
    t1.setValue(getTemperature()[0]);
    t2.setValue(getTemperature()[1]);
  }

  public StringProperty T1Property(){return t1;}

  public StringProperty T2Property(){return t2;}

  private String round(double number)
  {
    DecimalFormat format = new DecimalFormat("#.0");
    return format.format(number);
  }
}
