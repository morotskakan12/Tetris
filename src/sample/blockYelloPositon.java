package sample;

public class blockYelloPositon extends PositonAbstrakt {
    @Override
    public int [][]blockPositon(int[][] positonArry, int horizontally, int vertical) {
          for (int i = horizontally;i <= horizontally+1;  i++){
            for(int e = vertical;e <= vertical+1; e++ ){
                positonArry = setPositon(positonArry,e,i, 1);

            }
        }
        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {

        for (int i = horizontally;i <= horizontally+1;  i++){
            for(int e = vertical;e <= vertical+1; e++ ){
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
