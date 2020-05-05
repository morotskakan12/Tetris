package sample;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.collections.ObservableList;
import javafx.scene.Node;
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
    // tar in en in för lodrät och vågräta. och hriden som man ska undersöka.
    public Rectangle getNodeByRowColumnIndex (int row,int column, GridPane _gridPane) {
        column = (201-column);
        row= (201-row);
        ObservableList<Node> childrens = _gridPane.getChildren();
        Rectangle result = (Rectangle) childrens.get((row)+column);

            System.out.println(row);
            System.out.println(column);
            System.out.println(result.getHeight());
            System.out.println(result.getWidth());
            System.out.println(result.getStroke());
            System.out.println(result.getFill());
            System.out.println("end");

                System.out.println("hej");





        return result;
    }
    public GridPane test (GridPane _gameBord){
        Rectangle temp;
        Pane temp1 = new Pane();
        temp = getNodeByRowColumnIndex(0,7,_gameBord);


        temp1.getChildren().add(temp);
        if (temp.getFill() == Color.rgb(0,0,0)){
            System.out.println("hej");
        }
        _gameBord.add(temp1,5,5);
        return  _gameBord;
    }
}
