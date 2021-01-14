package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class blockWhiteGraphics extends BlockAbstrakt {

    double [][] coordinates = new double [1][2];
    double [][] coordinatesTemp = new double[0][1];
    double angle;
    @Override
    public Pane blockLayout(Pane _gameBord, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally + 25;
        coordinates[0][1] = vertical + 25;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical+25; i = i+25){
            for(int e = horizontally; e <= horizontally+(2*25); e=e+25 ){
                if (((e==horizontally)&&(i==vertical))||((e == horizontally+(2*25))&&(i==vertical))){

                }else{

                    double verticalTemp = i;
                    double horizontallyTemp = e;
                    coordinatesTemp = rotate(horizontallyTemp, verticalTemp, angle, coordinates);

                    horizontallyTemp = coordinatesTemp[0][0];
                    verticalTemp = coordinatesTemp[0][1];


                    _gameBord = setBlock(_gameBord,(int)horizontallyTemp,(int)verticalTemp, Color.rgb(224,224,224),Color.rgb(115,11,11));
                }
            }
        }

        return _gameBord;
    }

    @Override
    public Pane removBlockLayout(Pane _gameBord, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+25;
        coordinates[0][1] = vertical+25;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical+25; i = i+25){
            for(int e = horizontally; e <= horizontally+(2*25); e=e+25 ){
                if (((e==horizontally)&&(i==vertical))||((e == horizontally+(2*25))&&(i==vertical))){

                }else{

                    double verticalTemp = i;
                    double horizontallyTemp = e;
                    coordinatesTemp = rotate(horizontallyTemp, verticalTemp, angle, coordinates);

                    horizontallyTemp = coordinatesTemp[0][0];
                    verticalTemp = coordinatesTemp[0][1];


                    _gameBord = setBlock(_gameBord,(int)horizontallyTemp,(int) verticalTemp, Color.rgb(0,0,0),Color.rgb(115,11,11));
            }
            }
        }

        return _gameBord;
    }
}
