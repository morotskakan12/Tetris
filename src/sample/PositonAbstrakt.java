package sample;

import java.util.ArrayList;

abstract class PositonAbstrakt  {
    private int numBlock;
    public void setNumBlock(int numBlock) {
        this.numBlock = numBlock;
    }

    public int getNumBlock() {
        return numBlock;
    }
    public abstract int[][] blockPositon(int[][] positonArry, int horizontally , int vertical);
    public abstract int[][] removBlockPositon(int[][] positonArry, int horizontally , int vertical);
    public int[][] setPositon(int[][] positonArry,int horizontally,int vertical,int positonValu ){
            positonArry[horizontally][vertical] = positonValu;
        return positonArry;
    }
    public int getPositonValu(int[][]positonArry,int horizontally,int vertical ){

        return positonArry[horizontally][vertical];
    }
}
