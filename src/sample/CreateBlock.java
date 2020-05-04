package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class CreateBlock extends BlockAbstrakt {


    public GridPane setGameBord(GridPane _gameBord){
        return this.blockLayout(_gameBord,0,0);
    }

        public GridPane getGemeBlock(GridPane _gameBord){
            _gameBord = setGameBord(_gameBord);
            ArrayList <BlockAbstrakt> typsOfGemeBrick = new ArrayList<BlockAbstrakt>();
            typsOfGemeBrick.add(new blockBlue());//klar 0
            typsOfGemeBrick.add(new blockYello());//klar 1
            typsOfGemeBrick.add(new blockPurpel());//klar 2
            typsOfGemeBrick.add(new blockGreen());//klar 3
            typsOfGemeBrick.add(new blockOrange());//klar 4
            typsOfGemeBrick.add(new blockRed());//klar 5
            typsOfGemeBrick.add(new blockWhite());//klar 6
            BlockAbstrakt block = typsOfGemeBrick.get(setRandomNUmber());

            _gameBord = block.blockLayout(_gameBord,5,0);

            return _gameBord;
        }
        public int  setRandomNUmber(){
             return (int)(Math.random() * ((6) + 1));

        }

    @Override
    public GridPane blockLayout(GridPane _gameBord, int horizontally, int vertical) {

        for(int i = horizontally; i <= 9; i++ ) {
            for (int e = vertical; e <= 19; e++) {
                _gameBord = setBlock(_gameBord, i, e,Color.rgb(0,0,0),Color.rgb(115,11,11));

            }
        }
        return _gameBord;
    }
}
