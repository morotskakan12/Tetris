package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class blockYello extends BlockAbstrakt {
    public GridPane blockLayout(GridPane _gameBord, int horizontally, int vertical) {

        for (int i = horizontally;i <= horizontally+1; i ++){
            for(int e = vertical;e <= vertical+1; e++ ){
                _gameBord = setBlock(_gameBord,i,e, Color.rgb(228,235,37),Color.rgb(115,11,11));

            }
        }
        return _gameBord;
    }
}
