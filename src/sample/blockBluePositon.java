package sample;

public class blockBluePositon extends PositonAbstrakt {
    @Override
    public int [][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ){
                     positonArry = setPositon(positonArry,e,i, 1);
            }
        }

        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ){
                positonArry = setPositon(positonArry,e,i, 0);
            }
        }

        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical) {
        return false;
    }
}
