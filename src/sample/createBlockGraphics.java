package sample;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class createBlockGraphics extends BlockAbstrakt {


    public Pane setGameBord(Pane _gameBordPane){

        return this.blockLayout(_gameBordPane,0,0,0);
    }

        public Pane getGemeBlock(Pane _gameBordPane,int horizontally, int vertical,int numBlock,int angelNum){

            ArrayList <BlockAbstrakt> typsOfGemeBrick = new ArrayList<BlockAbstrakt>();
            typsOfGemeBrick.add(new blockBlueGraphics());//klar 0
            typsOfGemeBrick.add(new blockYelloGraphics());//klar 1
            typsOfGemeBrick.add(new blockPurpelGraphics());//klar 2
            typsOfGemeBrick.add(new blockGreenGraphics());//klar 3
            typsOfGemeBrick.add(new blockOrangeGraphics());//klar 4
            typsOfGemeBrick.add(new blockRedGraphics());//klar 5
            typsOfGemeBrick.add(new blockWhiteGraphics());//klar 6
            setNumBlock(numBlock);
            BlockAbstrakt block = typsOfGemeBrick.get(numBlock);

           _gameBordPane = block.blockLayout(_gameBordPane,(horizontally*25)-25,(vertical*25),angelNum);


           return _gameBordPane;
        }




    @Override
    public Pane blockLayout(Pane _gameBord, int horizontally, int vertical,int angelNum) {

        for (int i = 0; i<= 225 ;i= i+25) {

            for (int e = 0; e < 500; e = e+25) {
                _gameBord = setBlock(_gameBord, i,e, Color.rgb(0, 0, 0), Color.rgb(115, 11, 11));

            }

        }



        return _gameBord;
    }

    @Override
    public Pane removBlockLayout(Pane _gameBord, int horizontally, int vertical,int angelNum) {
        ArrayList<BlockAbstrakt> typsOfGemeBrick = new ArrayList<BlockAbstrakt>();
        typsOfGemeBrick.add(new blockBlueGraphics());//klar 0
        typsOfGemeBrick.add(new blockYelloGraphics());//klar 1
        typsOfGemeBrick.add(new blockPurpelGraphics());//klar 2
        typsOfGemeBrick.add(new blockGreenGraphics());//klar 3
        typsOfGemeBrick.add(new blockOrangeGraphics());//klar 4
        typsOfGemeBrick.add(new blockRedGraphics());//klar 5
        typsOfGemeBrick.add(new blockWhiteGraphics());//klar 6
        BlockAbstrakt block = typsOfGemeBrick.get(getNumBlock());

        _gameBord = block.removBlockLayout(_gameBord,(horizontally*25)-25,(vertical*25), angelNum);


        return _gameBord;
    }
    public Pane clerPosition(Pane _gameBord,int horizontally,int vertical,int positonValu) {
        if (positonValu==1) {
            setBlock(_gameBord, (horizontally * 25) - 25, (vertical * 25) , Color.rgb(240, 0, 25), Color.rgb(115, 11, 11));
        }else {
            setBlock(_gameBord, (horizontally * 25) - 25, (vertical * 25), Color.rgb(0, 0, 0), Color.rgb(115, 11, 11));
        }
        return _gameBord;
    }


}
