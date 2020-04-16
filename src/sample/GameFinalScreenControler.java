package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class GameFinalScreenControler {
    @FXML
    GridPane _gridCenter;
    @FXML
    VBox _vboxCenterGameSeting;
    @FXML
    ImageView _imageViewCenterLog;
    @FXML
    Button _buttonCenterGameStart;
    @FXML
    Button _buttonCenterGemeLevel;
    @FXML
    Button _buttonCneterExit;

    public void initialize() {
        _vboxCenterGameSeting.getStyleClass().add("vboxCenterGameSeting");
        _buttonCenterGameStart.getStyleClass().add("buttonCenterGameStart");
        _buttonCenterGemeLevel.getStyleClass().add("buttonCenterGemeLevel");
        _buttonCneterExit.getStyleClass().add("buttonCneterExit");
        _gridCenter.getStyleClass().add("gridCenter");
        _vboxCenterGameSeting.setMargin(_imageViewCenterLog, new Insets(30, 1, 10, 50));
        _vboxCenterGameSeting.setMargin(_buttonCenterGameStart, new Insets(30, 1, 30, 50));
        _vboxCenterGameSeting.setMargin(_buttonCenterGemeLevel, new Insets(0, 1, 10, 50));
        _vboxCenterGameSeting.setMargin(_buttonCneterExit, new Insets(150, 1, 0, 50));
    }
    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }
    public void onButtonCenterGemeStart(ActionEvent actionEvent){

    }
    public void onButtonCenterGemeLevel(ActionEvent actionEvent){}
}
