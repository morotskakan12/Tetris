package sample;

import java.util.ArrayList;

abstract class PositonAbstrakt {
    /*
     * kordinatsystem
     * sparar vilket spel bolck som används
     * ta bort och läger till block
     * roterar block
     * undersöker om rutan är tom
     */
    private int numBlock;

    public void setNumBlock(int numBlock) {
        this.numBlock = numBlock;
    }

    public int getNumBlock() {
        return numBlock;
    }

    public abstract int[][] blockPositon(int[][] positonArry, int horizontally, int vertical, int angelNum);

    public abstract int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical, int angelNum);

    public abstract boolean emtyPositon(int[][] positonArry, int horizontally, int vertical, int angelNum);


    public int[][] setPositon(int[][] positonArry, int horizontally, int vertical, int positonValu) {
        positonArry[horizontally][vertical] = positonValu;
        return positonArry;
    }

    public double[][] rotate(int horizontally, int vertical, double angle, int[][] matrixIn) {
        double[][] matrixResults = new double[1][2];
        double[][] matrixTemp = new double[1][2];
        double[][] matrixTrigonometry = new double[2][2];

        matrixTemp[0][0] = horizontally;
        matrixTemp[0][1] = vertical;

        matrixTemp[0][0] = matrixTemp[0][0] - matrixIn[0][0];
        matrixTemp[0][1] = matrixTemp[0][1] - matrixIn[0][1];

        matrixTrigonometry[0][0] = Math.round(Math.cos(angle));
        matrixTrigonometry[1][0] = Math.round(-(Math.sin(angle)));
        matrixTrigonometry[0][1] = Math.round(Math.sin(angle));
        matrixTrigonometry[1][1] = Math.round(Math.cos(angle));

        matrixResults[0][0] = ((matrixTrigonometry[0][0] * matrixTemp[0][0]) + (matrixTrigonometry[1][0] * matrixTemp[0][1]));
        matrixResults[0][1] = ((matrixTrigonometry[0][1] * matrixTemp[0][0]) + (matrixTrigonometry[1][1] * matrixTemp[0][1]));

        matrixResults[0][0] = matrixResults[0][0] + matrixIn[0][0];
        matrixResults[0][1] = matrixResults[0][1] + matrixIn[0][1];


        return matrixResults;
    }

    public int getPositonValu(int[][] positonArry, int horizontally, int vertical) {

        return positonArry[horizontally][vertical];
    }

    public double getAngle(int position) {

        if (position == 1) {
            return Math.PI / 2;
        } else if (position == 2) {
            return (Math.PI);
        } else if (position == 3) {
            return ((Math.PI * 3) / 2);
        } else {
            return 0;
        }
    }



}