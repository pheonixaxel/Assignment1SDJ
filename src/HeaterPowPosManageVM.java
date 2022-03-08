import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HeaterPowPosManageVM
{
  private Stage stage;
  private ViewModelFactory factory;

  public void openView() throws IOException{ // OPENS THIS WINDOW
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("heaterPowPosManage.fxml"));
    root =loader.load();
    HeatingSysControlController view = loader.getController();
    /// view.init() Connect to temperature with factory
    scene = new Scene(root);
    stage.setTitle("Temperature");
    stage.setScene(scene);
    stage.show();
  }

  public void changeView() throws IOException{ // OPENS OTHER WINDOW
    Scene scene = null;
    FXMLLoader loader = new FXMLLoader();
    Parent root = null;

    loader.setLocation(getClass().getResource("heatingSysControl.fxml"));
    root =loader.load();
    HeatingSysControlController view = loader.getController();
    //view.init() NOT YET WRITTEN
    scene = new Scene(root);
    stage.setTitle("Temperature");
    stage.setScene(scene);
    stage.show();
  }
}
