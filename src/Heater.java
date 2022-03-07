import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Heater
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

  private int power; // somehow link it with the hPowList power values or idk

  public Heater(int power)
  {
    this.power = power;
  }

  public void setCurrentState(HeaterSTATE currentState)
  {
    this.currentState = currentState;
  }
}
