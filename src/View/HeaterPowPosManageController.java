package View;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class HeaterPowPosManageController
{
  @FXML public Label t;
  @FXML public Label t0;
  @FXML public ChoiceBox hPow;
  ViewHandler viewHandler;

  public void onSaveButton(ActionEvent e) throws IOException
  {
    viewHandler.openView1();
  }

  public void init(String temp, String temp0)
  {
    hPow.getItems().add(0);
    hPow.getItems().add(1);
    hPow.getItems().add(2);
    hPow.getItems().add(3);

    t.setText(t.getText()+" "+temp);
    t0.setText(t0.getText()+" "+temp0);
  }

  public int getHPow(){return (int)hPow.getValue();}
}
