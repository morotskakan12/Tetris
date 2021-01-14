package sample;

public class blockYelloPositon extends PositonAbstrakt {
    @Override
    public int [][]blockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        for(int i = vertical;i <= vertical+1; i++ ){
            for (int e = horizontally;e <= horizontally+1;  e++){

                positonArry = setPositon(positonArry,e,i, 1);

            }
        }
        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        for(int i = vertical;i <= vertical+1; i++ ){
            for (int e = horizontally;e <= horizontally+1;  e++){

                positonArry = setPositon(positonArry,e,i, 0);

            }
        }
        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        for(int i = vertical;i <= vertical+1; i++ ){
            for (int e = horizontally;e <= horizontally+1;  e++) {
                if (getPositonValu(positonArry, e, i) == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
