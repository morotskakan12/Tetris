package sample;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

abstract class BlockAbstrakt {
    /*
        * grafick
        * sparar vilket spel bolck som används
        * ta bort och lägg till block
        * roterar block
        * skapar en raklangel till spelpjäserna
     */
    private int numBlock;

    public void setNumBlock(int numBlock) {
        this.numBlock = numBlock;
    }
    public int getNumBlock() {
        return numBlock;
    }

    public abstract Pane blockLayout(Pane _gameBord, int horizontally , int vertical,int angelNum);
    public abstract Pane removBlockLayout(Pane _gameBord, int horizontally , int vertical,int angelNum);


    public double[][] rotate(double horizontally, double vertical,double angle,double [][] matrixIn){
        double [][] matrixResults = new double [1][2];
        double [][] matrixTemp = new double[1][2];
        double [][] matrixTrigonometry = new double[2][2];

        matrixTemp[0][0] = horizontally;
        matrixTemp[0][1] = vertical;

        matrixTemp[0][0] = matrixTemp[0][0] - matrixIn[0][0];
        matrixTemp[0][1] = matrixTemp[0][1] - matrixIn[0][1];

        matrixTrigonometry[0][0]=Math.round(Math.cos(angle));
        matrixTrigonometry[1][0]=Math.round(-(Math.sin(angle)));
        matrixTrigonometry[0][1]=Math.round(Math.sin(angle));
        matrixTrigonometry[1][1]=Math.round(Math.cos(angle));

        matrixResults[0][0]=((matrixTrigonometry[0][0]*matrixTemp[0][0])+(matrixTrigonometry[1][0]*matrixTemp[0][1]));
        matrixResults[0][1]=((matrixTrigonometry[0][1]*matrixTemp[0][0])+(matrixTrigonometry[1][1]*matrixTemp[0][1]));

        matrixResults[0][0] = matrixResults[0][0] + matrixIn[0][0];
        matrixResults[0][1] = matrixResults[0][1] + matrixIn[0][1];


        return matrixResults;
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
    public double getAngle (int position){

        if (position ==1 ){
            return Math.PI/2;
        }else if (position == 2){
            return (Math.PI);
        } else if (position == 3){
            return ((Math.PI*3)/2);
        }else {
            return 0;
        }
    }

}
