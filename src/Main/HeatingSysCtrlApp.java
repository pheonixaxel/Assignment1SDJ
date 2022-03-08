package Main;

import Model.*;
import Model.ModelFactory;
import Model.SummerHouse;
import ViewModel.ViewModelFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

import View.*;

public class HeatingSysCtrlApp extends Application {

    /*
    Scene scene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
        "View/HeatingSysControl.fxml")));

    public HeatingSysCtrlApp() throws IOException {
    }

    @Override
    public void start(Stage stage) throws Exception {
    }
    */

    public void start(Stage stage) throws Exception
    {
        ModelFactory factory = new ModelFactory();
        ViewModelFactory viewModelFactory = new ViewModelFactory(factory);
        ViewHandler viewHandler = new ViewHandler(stage,viewModelFactory);
        viewHandler.openView1();
        runAutoUpdate(factory.getModel());
    }

    private void runAutoUpdate(Model model)
    {
        Thread thread1 = new Thread(new ThermometerThreadOne(model.getT1()));
        Thread thread2 = new Thread(new ThermometerThreadTwo(model.getT2()));
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }
}
