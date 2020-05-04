package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class blockBlue extends BlockAbstrakt {
    public GridPane blockLayout(GridPane _gameBord, int horizontally, int vertical) {

        for (int i = horizontally;i <= horizontally; i ++){
            for(int e = vertical;e <= vertical+3; e++ ){
                _gameBord = setBlock(_gameBord,i,e, Color.rgb(55,107,229),Color.rgb(115,11,11));
            }
        }
        return _gameBord;
    }
}
