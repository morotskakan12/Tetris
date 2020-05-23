package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class blockRedGraphics extends BlockAbstrakt {

    double [][] pivital =new double [1][2];
    double [][] temp = new double[0][1];

    @Override
    public Pane blockLayout(Pane _gameBord, int horizontally, int vertical) {
        pivital[0][0] = vertical ;
        pivital[0][1] = horizontally ;
        for (int i = horizontally ;i <= horizontally+(2*25); i = i+25) {
            for (int e = vertical; e <= vertical + 25; e = e + 25) {
                if (((i == horizontally) && (e == vertical + 25)) || ((i == horizontally + (2 * 25)) && (e == vertical))) {

                } else {

                    double temp1 = i;
                    double temp2 = e;
                    temp = rotate(temp2, temp1, Math.PI / 2, pivital);

                    temp1 = temp[0][1];
                    temp2 = temp[0][0];

                    _gameBord = setBlock(_gameBord, (int)temp1, (int)temp2, Color.rgb(255, 0, 0), Color.rgb(115, 11, 11));
                }
            }
        }
        return _gameBord;
    }

    @Override
    public Pane removBlockLayout(Pane _gameBord, int horizontally, int vertical) {
        pivital[0][0] = vertical ;
        pivital[0][1] = horizontally;
        for (int i = horizontally ;i <= horizontally+(2*25); i = i+25) {
            for (int e = vertical; e <= vertical + 25; e = e + 25) {
                if (((i == horizontally) && (e == vertical + 25)) || ((i == horizontally + (2 * 25)) && (e == vertical))) {

                } else {

                    double temp1 = i;
                    double temp2 = e;
                    temp = rotate(temp2, temp1, Math.PI / 2, pivital);

                    temp1 = temp[0][1];
                    temp2 = temp[0][0];

                    _gameBord = setBlock(_gameBord, (int)temp1, (int)temp2, Color.rgb(0, 0, 0), Color.rgb(115, 11, 11));
                }
            }
        }
        return _gameBord;
    }
}
