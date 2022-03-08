package View;

import View.ViewHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class HeatingSysControlController
{
  @FXML
  public Label pos;
  @FXML
  public Label t2;
  @FXML
  public Label t1;
  @FXML
  public Label t;
  @FXML
  public Label t0;
  @FXML
  public Button editButton;


  ViewHandler viewHandler;

  public void onEditButton(ActionEvent e) throws IOException
  {
    viewHandler.openView2();
  }


  public void init()
  {

  }
}
