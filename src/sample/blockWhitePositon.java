package sample;

public class blockWhitePositon extends PositonAbstrakt {
    int [][] coordinates = new int[1][2];
    double [][] coordinatesTemp = new double[0][1];
    double angle;
    @Override
    public int[][] blockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+1;
        coordinates[0][1] = vertical+1;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 2))) {

                } else {

                    int verticalTemp = i;
                    int horizontallyTemp = e;
                    coordinatesTemp = rotate(horizontallyTemp, verticalTemp, angle, coordinates);

                    verticalTemp = (int) coordinatesTemp[0][1];
                    horizontallyTemp = (int) coordinatesTemp[0][0];


                    positonArry = setPositon(positonArry, horizontallyTemp, verticalTemp, 1);
                }
            }
        }
        return positonArry;
    }

    @Override
    public int[][] removBlockPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+1;
        coordinates[0][1] = vertical+1;
        angle = getAngle(angleNum) ;

        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 2))) {

                } else{

                    int  verticalTemp = i ;
                    int horizontallyTemp = e;
                    coordinatesTemp = rotate(horizontallyTemp,verticalTemp,angle,coordinates);

                    horizontallyTemp = (int)coordinatesTemp[0][0];
                    verticalTemp = (int)coordinatesTemp[0][1];


                    positonArry = setPositon(positonArry, horizontallyTemp, verticalTemp, 0);
            }
            }
        }
        return positonArry;
    }

    @Override
    public boolean emtyPositon(int[][] positonArry, int horizontally, int vertical,int angleNum) {
        coordinates[0][0] = horizontally+1;
        coordinates[0][1] = vertical+1;
        angle = getAngle(angleNum);

        for (int i = vertical; i <= vertical + 1; i++) {
            for (int e = horizontally; e <= horizontally + 2; e++) {
                if (((i == vertical) && (e == horizontally)) || ((i == vertical) && (e == horizontally + 2))) {

                } else {

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
        }
        return false;
    }
}
