package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class innerViewControler {

    /*
        * kanppar
        * navigering till starta spel
        * nivå hantering
        * avsluta
        * länkad till plyeBord
     */
    @FXML
    GridPane _innerViewGridCenter;
    @FXML
    VBox _innerViewVboxCenterGameSeting;
    @FXML
    ImageView _imageViewCenterLog;
    @FXML
    Button _innerViewButtonCenterGameStart;
    @FXML
    Button _innerViewButtonCenterGemeLevel;
    @FXML
    Button _innerViewButtonCneterExit;
    public void initialize() {
        _innerViewVboxCenterGameSeting.getStyleClass().add("vboxCenterGameSeting");
        _innerViewButtonCenterGameStart.getStyleClass().add("buttonCenterGameStart");
        _innerViewButtonCenterGemeLevel.getStyleClass().add("buttonCenterGemeLevel");
        _innerViewButtonCneterExit.getStyleClass().add("buttonCneterExit");
        _innerViewGridCenter.getStyleClass().add("gridCenter");
        _innerViewVboxCenterGameSeting.setMargin(_imageViewCenterLog,new Insets(30,1,10,0));
        _innerViewVboxCenterGameSeting.setMargin(_innerViewButtonCenterGameStart,new Insets(30,1,30,0));
        _innerViewVboxCenterGameSeting.setMargin(_innerViewButtonCenterGemeLevel,new Insets(0,1,10,0));
        _innerViewVboxCenterGameSeting.setMargin(_innerViewButtonCneterExit,new Insets(150,1,0,0));

    }
    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void onButtonCenterGemeStart(ActionEvent actionEvent) throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("plyeBord.fxml"));
        _innerViewGridCenter.getChildren().setAll(pene);
    }
    public void onButtonCenterGemeLevel(ActionEvent actionEvent){}
}
