package View;

import View.HeatingSysControlController;
import ViewModel.ViewModel;
import ViewModel.ViewModelFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler
{
  private Stage stage;
  private ViewModelFactory factory;

  public ViewHandler(Stage stage, ViewModelFactory factory)
  {
    this.stage=stage;
    this.factory=factory;
  }

  public void openView1() throws IOException{ // OPENS heatingSysControl WINDOW
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("View/heatingSysControl.fxml"));
    root =loader.load();
    HeatingSysControlController view = loader.getController();
    view.init();
    scene = new Scene(root);
    stage.setTitle("Temperature");
    stage.setScene(scene);
    stage.show();
  }

  public void openView2() throws IOException{ // OPENS heaterPowPosManage WINDOW
  Scene scene = null;
  FXMLLoader loader = new FXMLLoader();
  Parent root = null;

  loader.setLocation(getClass().getResource("View/heaterPowPosManage.fxml"));
  root =loader.load();
  HeaterPowPosManageController view = loader.getController();
  view.init(factory.getViewModel().averageTemp(),factory.getViewModel().getOutdoorTemp());
  scene = new Scene(root);
  stage.setTitle("Temperature");
  stage.setScene(scene);
  stage.show();
}
}
