package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

abstract class BlockAbstrakt {
    private double blockNumber;

   public abstract GridPane blockLayout(GridPane _gameBord, int horizontally , int vertical);

    public Rectangle getBlock(Color fill, Color stroke){
        Rectangle temp = new Rectangle();
        temp.getStyleClass().add("tempBlock");
        temp.setFill(fill);
        temp.setStroke(stroke);
        temp.setStrokeWidth(0.5);
        temp.setHeight(24.5);
        temp.setWidth(24.5);
        if (temp.getFill()==Color.RED){

        }
        return temp;
    }
    public GridPane setBlock(GridPane _gameBord, int i, int e, Color fill, Color stroke){

        _gameBord.add(getBlock(fill, stroke),i,e);

        return _gameBord;
    }
}
