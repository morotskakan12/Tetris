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
    public double[][] rotate(int horizontally, int vertical,double angle){
        double [][] results = new double [1][2];
        double [][] matrix = new double[2][2];
        results[0][0]=(double)horizontally;
        results[0][1]=(double)vertical;
        matrix[0][0]=Math.round(Math.cos(angle));
        matrix[1][0]=Math.round(-(Math.sin(angle)));
        matrix[0][1]=Math.round(Math.sin(angle));
        matrix[1][1]=Math.round(Math.cos(angle));
        System.out.println(matrix[0][0]+" matrix[0][0]");
        System.out.println(matrix[1][0]+" matrix[1][0]");
        System.out.println(matrix[0][1]+" matrix[0][1]");
        System.out.println(matrix[1][1]+" matrix[1][1]");
        results[0][0]=((matrix[0][0]*results[0][0])+(matrix[0][1]*results[0][0]));
        results[0][1]=((matrix[1][0]*results[0][1])+(matrix[1][1]*results[0][1]));

        System.out.println(results[0][0]+" "+"positon of rotate x");
        System.out.println(results[0][1]+" "+"positon of rotate y");
            if (angle ==Math.PI) {
/*
                results[0][0] = (results[0][0] + (2 * horizontally));
                results[0][1] = (results[0][1] + (2 * vertical));
*/
                System.out.println(results[0][0]+" "+"after diff x");
                System.out.println(results[0][1]+" "+"after diff y");

            }else if(angle == Math.PI/2) {
                results[0][1] = results[0][1] + (2 * vertical);

                System.out.println(results[0][0]+" "+"after diff x");
                System.out.println(results[0][1]+" "+"after diff y");
            }else if(angle ==((3*Math.PI)/(2))){

                results[0][0]= results[0][0]+(2*vertical);
                results[0][1]=results[0][1]+(2*vertical);

            }

        return results;
    }
}
