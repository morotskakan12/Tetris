package sample;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

abstract class BlockAbstrakt {
    private int numBlock;
    public abstract Pane blockLayout(Pane _gameBord, int horizontally , int vertical);
    public abstract Pane removBlockLayout(Pane _gameBord, int horizontally , int vertical);


    public void setNumBlock(int numBlock) {
        this.numBlock = numBlock;
    }

    public int getNumBlock() {
        return numBlock;
    }

    public Rectangle getBlock(Color fill, Color stroke){
        Rectangle temp = new Rectangle();
        temp.getStyleClass().add("tempBlock");
        temp.setFill(fill);
        temp.setStroke(stroke);
        temp.setStrokeWidth(0.5);
        temp.setHeight(24.5);
        temp.setWidth(24.5);

        return temp;
    }
    public Pane setBlock(Pane _gameBord, int horizontally, int vertical, Color fill, Color stroke){
            Rectangle rectangle = getBlock(fill,stroke);
            rectangle.setX(horizontally);
            rectangle.setY(vertical);
            _gameBord.getChildren().add(rectangle);

        return _gameBord;
    }
}
