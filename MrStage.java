import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MrStage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Stage Modality");

        Stage stage = new Stage();
        //Modality.APPLICATION_MODAL - Defines a modal window that blocks events from being delivered to any other application window.
        stage.initModality(Modality.APPLICATION_MODAL);
        //stage.initModality(Modality.WINDOW_MODAL);
        //stage.initModality(Modality.NONE);

        primaryStage.show();

        stage.showAndWait();

    }
}