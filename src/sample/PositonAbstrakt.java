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

    public abstract boolean emtyPositon(int[][] positonArry, int horizontally , int vertical);
    public int[][] setPositon(int[][] positonArry,int horizontally,int vertical,int positonValu ){
            positonArry[horizontally][vertical] = positonValu;
        return positonArry;
    }
    public int getPositonValu(int[][]positonArry,int horizontally,int vertical ){

        return positonArry[horizontally][vertical];
    }
    public double[][] rotate(int horizontally, int vertical,double angle,int [][] pivital){
        double [][] results = new double [1][2];
        double [][] temp = new double[1][2];
        double [][] matrix = new double[2][2];
        temp[0][0] = horizontally;
        temp[0][1] = vertical;

        temp[0][0] = temp[0][0] - pivital[0][0];
        temp[0][1] = temp[0][1] - pivital[0][1];

        matrix[0][0]=Math.round(Math.cos(angle));
        matrix[1][0]=Math.round(-(Math.sin(angle)));
        matrix[0][1]=Math.round(Math.sin(angle));
        matrix[1][1]=Math.round(Math.cos(angle));

        results[0][0]=((matrix[0][0]*temp[0][0])+(matrix[1][0]*temp[0][1]));
        results[0][1]=((matrix[0][1]*temp[0][0])+(matrix[1][1]*temp[0][1]));

        results[0][0] = results[0][0] + pivital[0][0];
        results[0][1] = results[0][1] + pivital[0][1];


        return results;
    }
}
