package sample;

public class blockRedPositon extends PositonAbstrakt {
    int [][] pivital = new int[1][2];
    double [][] temp = new double[0][1];
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        pivital[0][0] = horizontally;
        pivital[0][1] = vertical;
        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical + 1) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 2))) {

                } else {

                    int  temp1 = i ;
                    int temp2 = e;
                    temp = rotate(temp2,temp1,Math.PI/2,pivital);

                    temp1 = (int)temp[0][1];
                    temp2 = (int)temp[0][0];
                    positonArry = setPositon(positonArry, temp2, temp1, 1);
                }
            }

        }
        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        pivital[0][0] = horizontally;
        pivital[0][1] = vertical;
        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical + 1) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 2))) {

                } else {

                    int  temp1 = i ;
                    int temp2 = e;
                    temp = rotate(temp2,temp1,Math.PI/2,pivital);

                    temp1 = (int)temp[0][1];
                    temp2 = (int)temp[0][0];
                    positonArry = setPositon(positonArry, temp2, temp1, 0);
            }
            }

        }
        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical) {
        return false;
    }
}
