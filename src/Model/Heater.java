package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Heater implements PropertyChangeSubject
{

  ObservableList<Integer> hPowList = FXCollections.observableArrayList(0, 1, 2, 3);

  @FXML
  public Label t;
  @FXML
  public Label t0;
  @FXML
  public ChoiceBox hPow;

  @FXML
  private void initialize(){
    hPow.setValue(power);
    hPow.setItems(hPowList);
  }

  private HeaterSTATE currentState = new OffState();
  private PropertyChangeSupport powerChangeSupport = new PropertyChangeSupport(this);


  private int power; // somehow link it with the hPowList power values or idk
  public void turnUp(){}

  public void turnDown(){

  }
  public int getPower(){
    return 0;
  }
  public Heater(int power)
  {
    this.power = power;
  }

  public void setCurrentState(HeaterSTATE currentState)
  {
    this.currentState = currentState;
    powerChangeSupport.firePropertyChange("PowerChanged",0,currentState.getPower());
  }

  @Override public void addPropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    powerChangeSupport.addPropertyChangeListener(name,listener);
  }

  @Override public void addPropertyChangeListener(
      PropertyChangeListener listener)
  {
    powerChangeSupport.addPropertyChangeListener(listener);
  }

  @Override public void removePropertyChangeListener(String name,
      PropertyChangeListener listener)
  {
    powerChangeSupport.removePropertyChangeListener(name,listener);
  }

  @Override public void removePropertyChangeListener(
      PropertyChangeListener listener)
  {
    powerChangeSupport.removePropertyChangeListener(listener);
  }
}
