package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class blockYelloGraphics extends BlockAbstrakt {

    @Override
    public Pane blockLayout(Pane _gameBord, int horizontally, int vertical,int angleNum) {
        for (int i = vertical;i <= vertical+25; i = i+25){
            for(int e = horizontally;e <= horizontally+25; e=e+25 ){
                _gameBord = setBlock(_gameBord,e,i, Color.rgb(228,235,37),Color.rgb(115,11,11));

            }
        }
        return _gameBord;
    }

    @Override
    public Pane removBlockLayout(Pane _gameBord, int horizontally, int vertical,int angleNum) {
        for (int i = vertical;i <= vertical+25; i = i+25){
            for(int e = horizontally;e <= horizontally+25; e=e+25 ){

                _gameBord = setBlock(_gameBord,e,i, Color.rgb(0,0,0),Color.rgb(115,11,11));

            }
        }
        return _gameBord;
    }
}
