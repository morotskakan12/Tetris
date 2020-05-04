package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class blockOrange extends BlockAbstrakt {
    @Override
    public GridPane blockLayout(GridPane _gameBord, int horizontally, int vertical) {

        for (int i = horizontally; i <= horizontally+2; i++){
            for(int e = vertical; e <= vertical+1; e++ ){
                if (((i==horizontally)&&(e==vertical))||((i == horizontally+2)&&(e==vertical+1))){

                }else
                _gameBord = setBlock(_gameBord,i,e, Color.rgb(255,174,10),Color.rgb(115,11,11));
            }
        }

        return _gameBord;
    }
}
