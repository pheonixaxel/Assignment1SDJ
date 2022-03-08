package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import View.*;

public class HeatingSysCtrlApp extends Application {

    Scene scene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
        "View/HeatingSysControl.fxml")));

    public HeatingSysCtrlApp() throws IOException {
    }

    @Override
    public void start(Stage stage) throws Exception {
    }
}
