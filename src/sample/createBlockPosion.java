package sample;

import java.util.ArrayList;

public class createBlockPosion extends PositonAbstrakt {
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical, int angleNum) {
        for (int i = horizontally; i < 12; i++) {
            for (int e = vertical; e < 21; e++) {
                if ((e == 20) || (i == 0) || (i == 11)) {
                    positonArry = setPositon(positonArry, i, e, 1);
                } else {
                    positonArry = setPositon(positonArry, i, e, 0);
                }
            }
        }

        return positonArry;
    }

    public int[][] getGemeBlock(int[][] positonArry, int horizontally, int vertical, int numBlock, int angleNum) {

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

        positonArry = block.blockPositon(positonArry, horizontally, vertical, angleNum);


        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical, int angleNum) {
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

        positonArry = block.removBlockPositon(positonArry, horizontally, vertical, angleNum);


        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical, int angleNum) {

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

        return block.emtyPositon(positonArry, horizontally, vertical, angleNum);
    }
    public boolean clerPosition(int[][] positonArry, int vertical) {

        for (int i = 1; i <= 10; i++) {
            if (getPositonValu(positonArry, i, vertical) == 0) {
                return false;
            }
        }
        return true;
    }

}