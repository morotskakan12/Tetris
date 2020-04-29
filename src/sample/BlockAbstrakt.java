package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

abstract class BlockAbstrakt {
    private int blockNumber;
    public BlockAbstrakt (int blockNumberTemp){
        blockNumber = blockNumberTemp;
    }

    public abstract void coler();
    public Pane block(Color coler){
        Pane temp = new Pane();
        temp.getStyleClass().add("tempBlock");
        temp.setStyle("-fx-background-color: #"+ coler);
        return temp;
    }

}
