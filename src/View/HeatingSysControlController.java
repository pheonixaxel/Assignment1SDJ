package View;

import ViewModel.ViewModel;
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
  public Label t0;///
  @FXML
  public Button editButton;

  ViewHandler viewHandler;

  public void onEditButton(ActionEvent e) throws IOException
  {
    viewHandler.openView2();
  }

  public void init(double pos, String t1, String t2, String t0)
  {
    this.pos.setText(pos+"");
    this.t1.setText(t1);
    this.t2.setText(t2);
    this.t0.setText(t0);
  }
}
