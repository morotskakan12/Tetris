package sample;

public class blockOrangePositon extends PositonAbstrakt {
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical) {
        for (int i = vertical; i <= vertical+1; i++){
            for(int e = horizontally; e <= horizontally+2; e++ ){
                if (((i==vertical)&&(e==horizontally))||((i == vertical+1)&&(e==horizontally+2))){

                }else {
                    System.out.println(i+" "+"i");
                    System.out.println(e+" "+"e");
                    double [][] temp = new double[0][1];
                    int temp1 = i;
                    int temp2 = e;
                    temp = rotate(temp1,temp2,0);
                    temp1 = (int)temp[0][1];
                    temp2 = (int)temp[0][0];

                    System.out.println(temp1+" temp1");
                    System.out.println(temp2+" temp2");

                    positonArry = setPositon(positonArry, temp2, temp1, 1);
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

                    positonArry = setPositon(positonArry, e, i, 0);
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
