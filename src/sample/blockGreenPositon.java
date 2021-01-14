package sample;

public class blockGreenPositon extends PositonAbstrakt {
    int [][] coordinates =new int [1][2];
    double [][] coordinatesTemp = new double[0][1];
    double angle;
    @Override
    public int [][]blockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+1;
        coordinates[0][1] = vertical+1;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical+2; i++){
            for(int e = horizontally; e <= horizontally+1;e++ ){
                if (((i==vertical+1)&&(e==horizontally+1))||((i == vertical+2)&&(e==horizontally+1))){

                }else {

                    double verticalTemp = i;
                    double horizontallyTemp = e;
                    coordinatesTemp = rotate((int)horizontallyTemp,(int)verticalTemp, angle, coordinates);

                    verticalTemp = coordinatesTemp[0][1];
                    horizontallyTemp = coordinatesTemp[0][0];

                    positonArry = setPositon(positonArry, (int)horizontallyTemp, (int)verticalTemp, 1);

                }
            }
        }
        return positonArry;
    }

    @Override
    public int [][]removBlockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+1;
        coordinates[0][1] = vertical+1;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical+2; i++){
            for(int e = horizontally; e <= horizontally+1;e++ ){
                if (((i==vertical+1)&&(e==horizontally+1))||((i == vertical+2)&&(e==horizontally+1))){

                }else {

                    double verticalTemp = i;
                    double horizontallyTemp = e;
                    coordinatesTemp = rotate((int)horizontallyTemp,(int)verticalTemp, angle, coordinates);

                    verticalTemp = coordinatesTemp[0][1];
                    horizontallyTemp = coordinatesTemp[0][0];

                    positonArry = setPositon(positonArry, (int)horizontallyTemp, (int)verticalTemp, 0);
                }
            }
        }
        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+1;
        coordinates[0][1] = vertical+1;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical+2; i++){
            for(int e = horizontally; e <= horizontally+1;e++ ){
                if (((i==vertical+1)&&(e==horizontally+1))||((i == vertical+2)&&(e==horizontally+1))){

                }else {

                    double verticalTemp = i;
                    double horizontallyTemp = e;
                    coordinatesTemp = rotate((int)horizontallyTemp,(int)verticalTemp, angle, coordinates);

                    verticalTemp = coordinatesTemp[0][1];
                    horizontallyTemp = coordinatesTemp[0][0];
                    if (getPositonValu(positonArry, (int) horizontallyTemp, (int) verticalTemp) == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
