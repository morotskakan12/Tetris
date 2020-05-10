package sample;

public class blockPurpelPositon extends PositonAbstrakt {
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 1))) {

                } else {

                    positonArry = setPositon(positonArry, e, i, 1);
                }
            }


        }
        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 1))) {

                } else {

                    positonArry = setPositon(positonArry, e, i, 0);
                }
            }

        }
        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical; i <= vertical + 1; i++) {
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

        }
        return false;
    }

}