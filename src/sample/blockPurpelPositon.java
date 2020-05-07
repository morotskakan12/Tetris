package sample;

public class blockPurpelPositon extends PositonAbstrakt {
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        for ( int i = vertical;i <= vertical+1;i++){
            for(int e = horizontally;e <= horizontally+2; e++ ){
                if (((i==horizontally+1)&&(e==vertical))||((i == horizontally)&&(e==vertical))){

                }else{
                positonArry = setPositon(positonArry,horizontally,vertical,1);
                }
            }


    }
        return positonArry;
    }

    @Override
    public int [][]removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        return null;
    }
}
