package sample;

public class blockBluePositon extends PositonAbstrakt {
    int [][] pivital =new int [1][2];
    double [][] temp = new double[0][1];
    @Override
    public int [][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        pivital[0][0] = horizontally;
        pivital[0][1] = vertical;
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ){

                double temp1 = i;
                double temp2 = e;
                temp = rotate((int)temp2,(int)temp1, Math.PI / 2, pivital);

                temp1 = temp[0][1];
                temp2 = temp[0][0];

                positonArry = setPositon(positonArry,(int)temp2,(int)temp1, 1);
            }
        }

        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        pivital[0][0] = horizontally;
        pivital[0][1] = vertical;
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ){

                double temp1 = i;
                double temp2 = e;
                temp = rotate((int)temp2,(int)temp1, Math.PI / 2, pivital);

                temp1 = temp[0][1];
                temp2 = temp[0][0];

                positonArry = setPositon(positonArry,(int)temp2,(int)temp1, 0);
            }
        }

        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical) {
        return false;
    }
}
