package sample;

public class blockOrangePositon extends PositonAbstrakt {
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical; i <= vertical+1; i++){
            for(int e = horizontally; e <= horizontally+2; e++ ){
                if (((i==vertical)&&(e==horizontally))||((i == vertical+1)&&(e==horizontally+2))){

                }else {

                    positonArry = setPositon(positonArry, i, e, 1);
                }
            }
        }


        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical; i <= vertical+1; i++){
            for(int e = horizontally; e <= horizontally+2; e++ ){
                if (((i==vertical)&&(e==horizontally))||((i == vertical+1)&&(e==horizontally+2))){

                }else {
                    positonArry = setPositon(positonArry, i, e, 0);
                }
            }
        }


        return positonArry;
    }
}
