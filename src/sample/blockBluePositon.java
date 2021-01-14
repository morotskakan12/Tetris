package sample;

public class blockBluePositon extends PositonAbstrakt {
    int [][] coordinates =new int [1][2];
    double [][] coordinatesTemp = new double[0][1];
    double angle;
    @Override
    public int [][] blockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally;
        coordinates[0][1] = vertical;
        if((angleNum == 0)||(angleNum==2)){
            angleNum = 0;
        }else {
            if (horizontally > 6) {
                angleNum = 1;
            } else
                angleNum = 3;
        }
        angle = getAngle(angleNum) ;
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ){

                double verticalTemp = i;
                double horizontallyTemp = e;
                coordinatesTemp = rotate((int)horizontallyTemp,(int)verticalTemp, angle, coordinates);

                horizontallyTemp = coordinatesTemp[0][0];
                verticalTemp = coordinatesTemp[0][1];


                positonArry = setPositon(positonArry,(int)horizontallyTemp,(int)verticalTemp, 1);
            }
        }

        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally;
        coordinates[0][1] = vertical;
        if((angleNum == 0)||(angleNum==2)){
            angleNum = 0;
        }else {
            if (horizontally > 6) {
                angleNum = 1;
            } else
                angleNum = 3;
        }
        angle = getAngle(angleNum) ;
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ){

                double verticalTemp = i;
                double horizontallyTemp = e;
                coordinatesTemp = rotate((int)horizontallyTemp,(int)verticalTemp, angle, coordinates);

                horizontallyTemp = coordinatesTemp[0][0];
                verticalTemp = coordinatesTemp[0][1];


                positonArry = setPositon(positonArry,(int)horizontallyTemp,(int)verticalTemp, 0);
            }
        }

        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally;
        coordinates[0][1] = vertical;
        if((angleNum == 0)||(angleNum==2)){
            angleNum = 0;
        }else {
            if(horizontally>6){
                angleNum = 1;
            }else
                angleNum =3;
        }
        angle = getAngle(angleNum) ;
        for (int i = vertical;i <= vertical+3;i++){
            for(int e = horizontally;e <= horizontally; e++ ) {

                int verticalTemp = i;
                int horizontallyTemp = e;
                coordinatesTemp = rotate(horizontallyTemp, verticalTemp, angle, coordinates);

                verticalTemp = (int) coordinatesTemp[0][1];
                horizontallyTemp = (int) coordinatesTemp[0][0];
                if (getPositonValu(positonArry, horizontallyTemp, verticalTemp) == 1) {
                    return true;
                }
            }
        }

        return false;
    }
}
