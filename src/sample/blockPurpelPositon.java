package sample;

public class blockPurpelPositon extends PositonAbstrakt {
    int [][] pivital =new int [1][2];
    double [][] temp = new double[0][1];
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        pivital[0][0] = horizontally;
        pivital[0][1] = vertical+1;
        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 1))) {

                } else {



                        double temp1 = i;
                        double temp2 = e;
                        temp = rotate((int)temp2,(int)temp1, Math.PI / 2, pivital);

                        temp1 = temp[0][1];
                        temp2 = temp[0][0];

                    positonArry = setPositon(positonArry, (int)temp2, (int)temp1, 1);

                }
            }


        }
        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        pivital[0][0] = horizontally;
        pivital[0][1] = vertical+1;
        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 1))) {

                } else {

                    double temp1 = i;
                    double temp2 = e;
                    temp = rotate((int)temp2,(int)temp1, Math.PI / 2, pivital);

                    temp1 = temp[0][1];
                    temp2 = temp[0][0];


                    positonArry = setPositon(positonArry, (int)temp2, (int)temp1, 0);
                }
            }

        }
        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical) {
       /* for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 1))||((i == vertical) && (e == horizontally + 2))) {

                } else {
                    System.out.println(e +" ," +i);
                    System.out.println();
                    if (getPositonValu(positonArry,i,e)== 1) {
                        return true;
                    }
                }
            }

        }*/
        return false;
    }

}