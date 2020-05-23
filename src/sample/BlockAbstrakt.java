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
    public double[][] rotate(double horizontally, double vertical,double angle,double [][] pivital){
        double [][] results = new double [1][2];
        double [][] temp = new double[1][2];
        double [][] matrix = new double[2][2];

        temp[0][0] = horizontally;
        temp[0][1] = vertical;

        temp[0][0] = temp[0][0] - pivital[0][0];
        temp[0][1] = temp[0][1] - pivital[0][1];

        matrix[0][0]=Math.round(Math.cos(angle));
        matrix[1][0]=Math.round(-(Math.sin(angle)));
        matrix[0][1]=Math.round(Math.sin(angle));
        matrix[1][1]=Math.round(Math.cos(angle));

        results[0][0]=((matrix[0][0]*temp[0][0])+(matrix[1][0]*temp[0][1]));
        results[0][1]=((matrix[0][1]*temp[0][0])+(matrix[1][1]*temp[0][1]));

        results[0][0] = results[0][0] + pivital[0][0];
        results[0][1] = results[0][1] + pivital[0][1];


        return results;
    }
}
