package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class blockBlueGraphics extends BlockAbstrakt {
    double [][] coordinates =new double [1][2];
    double [][] coordinatesTemp = new double[0][1];
    double angle;

    @Override
    public Pane blockLayout(Pane _gameBord, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally;
        coordinates[0][1] = vertical;
        if((angleNum == 0)||(angleNum==2)){
            angleNum = 0;
        }else {
            if(horizontally>(6*25)){
                angleNum = 1;
            }else
                angleNum =3;
        }
        angle = getAngle(angleNum) ;
        for(int i = vertical;i <= vertical+(3*25); i=i+25 ){
            for (int e = horizontally;e <= horizontally;e = e+25){

                double verticalTemp = i;
                double horizontallyTemp = e;
                coordinatesTemp = rotate(horizontallyTemp, verticalTemp, angle , coordinates);

                horizontallyTemp = coordinatesTemp[0][0];
                verticalTemp = coordinatesTemp[0][1];


                _gameBord = setBlock(_gameBord,(int)horizontallyTemp,(int)verticalTemp, Color.rgb(55,107,229),Color.rgb(115,11,11));
            }
        }
        return _gameBord;
    }

    @Override
    public Pane removBlockLayout(Pane _gameBord, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally;
        coordinates[0][1] = vertical;
        if((angleNum == 0)||(angleNum==2)){
            angleNum = 0;
        }else {
            if(horizontally>(6*25)){
                angleNum = 1;
            }else
            angleNum =3;
        }
        angle = getAngle(angleNum) ;
        for(int i = vertical;i <= vertical+(3*25); i=i+25 ){
            for (int e = horizontally;e <= horizontally;e = e+25){

                double verticalTemp = i;
                double horizontallyTemp = e;
                coordinatesTemp = rotate(horizontallyTemp, verticalTemp, angle , coordinates);

                horizontallyTemp = coordinatesTemp[0][0];
                verticalTemp = coordinatesTemp[0][1];


                _gameBord = setBlock(_gameBord,(int)horizontallyTemp,(int)verticalTemp, Color.rgb(0,0,0),Color.rgb(115,11,11));
            }
        }
        return _gameBord;
    }
}
