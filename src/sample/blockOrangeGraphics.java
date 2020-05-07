package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class blockOrangeGraphics extends BlockAbstrakt {


    @Override
    public Pane blockLayout(Pane _gameBord, int horizontally, int vertical) {
         for (int i = horizontally; i <= horizontally+(2*25); i = i+25){
            for(int e = vertical; e <= vertical+25; e=e+25 ){
                if (((i==horizontally)&&(e==vertical))||((i == horizontally+(2*25))&&(e==vertical+25))){

                }else
                    _gameBord = setBlock(_gameBord,i,e, Color.rgb(255,174,10),Color.rgb(115,11,11));
            }
        }

        return _gameBord;
    }

    @Override
    public Pane removBlockLayout(Pane _gameBord, int horizontally, int vertical) {
        for (int i = horizontally; i <= horizontally+(2*25); i = i+25){
            for(int e = vertical; e <= vertical+25; e=e+25 ){
                if (((i==horizontally)&&(e==vertical))||((i == horizontally+(2*25))&&(e==vertical+25))){

                }else
                    _gameBord = setBlock(_gameBord,i,e, Color.rgb(0,0,0),Color.rgb(115,11,11));
            }
        }

        return _gameBord;
    }
}
