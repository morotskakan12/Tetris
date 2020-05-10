package sample;

import java.util.ArrayList;

public class createBlockPosion extends PositonAbstrakt {
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        for(int i = vertical; i <21;i++){
            for(int e = horizontally; e <10;e++){
                if(i == 20){
                    positonArry = setPositon(positonArry,e,i,1);
                }else {
                    positonArry = setPositon(positonArry, e, i, 0);
                }
            }
        }

        return positonArry;
    }
    public int[][] getGemeBlock(int[][] positonArry,int horizontally, int vertical,int numBlock){

        ArrayList<PositonAbstrakt> typsOfGemeBrick = new ArrayList<PositonAbstrakt>();
        typsOfGemeBrick.add(new blockBluePositon());//klar 0
        typsOfGemeBrick.add(new blockYelloPositon());//klar 1
        typsOfGemeBrick.add(new blockPurpelPositon());//klar 2
        typsOfGemeBrick.add(new blockGreenPositon());//klar 3
        typsOfGemeBrick.add(new blockOrangePositon());//klar 4
        typsOfGemeBrick.add(new blockRedPositon());//klar 5
        typsOfGemeBrick.add(new blockWhitePositon());//klar 6
        setNumBlock(numBlock);
        PositonAbstrakt block = typsOfGemeBrick.get(getNumBlock());

        positonArry = block.blockPositon(positonArry,horizontally,vertical);


        return positonArry;
    }
    @Override
    public int [][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        ArrayList<PositonAbstrakt> typsOfGemeBrick = new ArrayList<PositonAbstrakt>();
        typsOfGemeBrick.add(new blockBluePositon());//klar 0
        typsOfGemeBrick.add(new blockYelloPositon());//klar 1
        typsOfGemeBrick.add(new blockPurpelPositon());//klar 2
        typsOfGemeBrick.add(new blockGreenPositon());//klar 3
        typsOfGemeBrick.add(new blockOrangePositon());//klar 4
        typsOfGemeBrick.add(new blockRedPositon());//klar 5
        typsOfGemeBrick.add(new blockWhitePositon());//klar 6
        setNumBlock(getNumBlock());
        PositonAbstrakt block = typsOfGemeBrick.get(getNumBlock());

        positonArry = block.removBlockPositon(positonArry,horizontally,vertical);


        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical) {
        ArrayList<PositonAbstrakt> typsOfGemeBrick = new ArrayList<PositonAbstrakt>();
        typsOfGemeBrick.add(new blockBluePositon());//klar 0
        typsOfGemeBrick.add(new blockYelloPositon());//klar 1
        typsOfGemeBrick.add(new blockPurpelPositon());//klar 2
        typsOfGemeBrick.add(new blockGreenPositon());//klar 3
        typsOfGemeBrick.add(new blockOrangePositon());//klar 4
        typsOfGemeBrick.add(new blockRedPositon());//klar 5
        typsOfGemeBrick.add(new blockWhitePositon());//klar 6
        setNumBlock(getNumBlock());
        PositonAbstrakt block = typsOfGemeBrick.get(getNumBlock());

        return block.emtyPositon(positonArry,horizontally,vertical);
    }
}
