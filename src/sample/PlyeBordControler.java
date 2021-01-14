package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.IOException;



public class PlyeBordControler {
    /*
        * Spel plan
        * kordinat system
        * tid hantering
        * länkad till gameFinalScreen
     */

    @FXML
    GridPane _plyeBordContaner;
    @FXML
    Pane _plyeBordGameFild;

    GridPane _textContaner= new GridPane();
    Text _textPointsCount = new Text();
    Text _pointsCount = new Text();
    Text _textLevelCount = new Text();
    Text _levelCount = new Text();


    Pane _block = new Pane();
    createBlockGraphics createBlockG = new createBlockGraphics();
    createBlockPosion createBlockP = new createBlockPosion();
    int[][] positonArry = new int[12][22];
    int numBlock;
    int horizontally;
    int vertical;
    int angleNum;
    int points = 0;
    int numberOfRow;
    int indexLevel = 1;
    double[] level = new double[26];
    Timeline timelineAnimation = new Timeline();
    Button buttonWisobiletyFals = new Button();



    public void initialize() throws IOException {
        _plyeBordGameFild.setMinWidth(250);
        _plyeBordGameFild.setMinHeight(500);
        _plyeBordGameFild.getStyleClass().add("gameFild");
        _pointsCount.getStyleClass().add("textPoints");
        _pointsCount.setFill(Color.WHITE);
        _pointsCount.setText("" + points);

        _levelCount.getStyleClass().add("textPoints");
        _levelCount.setFill(Color.WHITE);
        _levelCount.setText("" + indexLevel);

        _textPointsCount.getStyleClass().add("textPoints");
        _textPointsCount.setFill(Color.WHITE);
        _textPointsCount.setText("points ");

        _textLevelCount.getStyleClass().add("textPoints");
        _textLevelCount.setFill(Color.WHITE);
        _textLevelCount.setText("Level ");

        buttonWisobiletyFals.setMinHeight(100);
        buttonWisobiletyFals.setMinWidth(200);
        _plyeBordGameFild.getChildren().add(buttonWisobiletyFals);
        createBlockG.setGameBord(_plyeBordGameFild);
        positonArry = createBlockP.blockPositon(positonArry,0,0,angleNum);
        printArry(positonArry);
        _plyeBordGameFild.getChildren().add(_block);
        _textContaner.add(_textPointsCount,0,0);
        _textContaner.add(_pointsCount,0,1);
        _textContaner.add(_textLevelCount,0,2);
        _textContaner.add(_levelCount,0,3);
        _plyeBordContaner.add(_textContaner,1,0);
        numBlock = setRandomNumber();
        level = setLevel(level);
        vertical = 0;
        angleNum = 0;
        horizontally = 4;
        this.event();
        this.gameLopp();
        this.timeAnimatin();
       }



    public void gameLopp() {

        if ((vertical==0)&&(createBlockP.emtyPositon(positonArry,horizontally,vertical,angleNum)==true)){

            try {

                chenge();
            } catch (IOException ioException) {

                ioException.printStackTrace();

            }
        }else {
            timelineAnimation.stop();
            _block = createBlockG.getGemeBlock(_block, horizontally, vertical, numBlock, angleNum);
            positonArry = createBlockP.getGemeBlock(positonArry, horizontally, vertical, numBlock, angleNum);

            printArry(positonArry);

                timelineAnimation.setDelay(Duration.seconds(level[indexLevel]));

                timelineAnimation.playFromStart();

        }


    }
    public void timeAnimatin(){
    timelineAnimation = new Timeline(new KeyFrame(Duration.seconds(0.01), ev -> {


        _block = createBlockG.removBlockLayout(_block,horizontally,vertical,angleNum);
        positonArry = createBlockP.removBlockPositon(positonArry,horizontally,vertical,angleNum);


        if (createBlockP.emtyPositon(positonArry,horizontally,vertical+1,angleNum)) {

            _block = createBlockG.getGemeBlock(_block, horizontally, vertical, numBlock,angleNum);
            positonArry = createBlockP.getGemeBlock(positonArry, horizontally, vertical, numBlock,angleNum);

            printArry(positonArry);




            if ((vertical==0)&&(createBlockP.emtyPositon(positonArry,horizontally,vertical,angleNum)==true)){
                try {

                    chenge();
                } catch (IOException ioException) {

                    ioException.printStackTrace();

                }
            }else {

                positonArry = clerPosition(positonArry);
                vertical = 0;
                horizontally = 4;
                angleNum = 0;
                numBlock = setRandomNumber();
                if(numberOfRow==5){
                    numberOfRow=0;
                    if (indexLevel==25){}else{
                        indexLevel++;
                        _levelCount.setText("" + indexLevel);
                    }

                }
                gameLopp();

            }
        }else {

            _block = createBlockG.removBlockLayout(_block, horizontally, vertical, angleNum);
            positonArry = createBlockP.removBlockPositon(positonArry, horizontally, vertical, angleNum);
            vertical++;
            gameLopp();
        }
    }));
        timelineAnimation.setCycleCount(Timeline.INDEFINITE);
        timelineAnimation.play();
    }





     public void event (){
         buttonWisobiletyFals.setOnKeyPressed(new EventHandler<KeyEvent>() {
             @Override
             public void handle(KeyEvent t) {

                if (t.getCode() == KeyCode.W){
                    timelineAnimation.pause();

                    _block = createBlockG.removBlockLayout(_block,horizontally,vertical,angleNum);
                    positonArry = createBlockP.removBlockPositon(positonArry,horizontally,vertical,angleNum);
                        if (angleNum== 3){
                            if (createBlockP.emtyPositon(positonArry,horizontally,vertical,0)==false){

                                angleNum = 0;
                            }
                        }else {

                            if (createBlockP.emtyPositon(positonArry,horizontally,vertical,angleNum+1)==false){

                                angleNum++;
                            }
                        }
                    _block = createBlockG.getGemeBlock(_block,horizontally,vertical,numBlock,angleNum);
                    positonArry = createBlockP.getGemeBlock(positonArry,horizontally,vertical,numBlock,angleNum);


                    timelineAnimation.play();

                }else if(t.getCode()== KeyCode.A){
                    timelineAnimation.pause();


                    _block = createBlockG.removBlockLayout(_block, horizontally, vertical,angleNum);
                    positonArry = createBlockP.removBlockPositon(positonArry, horizontally, vertical,angleNum);

                    if (createBlockP.emtyPositon(positonArry,horizontally-1,vertical,angleNum)==false){


                        horizontally--;

                    }
                    _block = createBlockG.getGemeBlock(_block, horizontally, vertical, numBlock,angleNum);
                    positonArry = createBlockP.getGemeBlock(positonArry, horizontally, vertical, numBlock,angleNum);

                    timelineAnimation.play();


                }else if (t.getCode() == KeyCode.D){
                    timelineAnimation.pause();


                    _block = createBlockG.removBlockLayout(_block, horizontally, vertical,angleNum);
                    positonArry = createBlockP.removBlockPositon(positonArry, horizontally, vertical,angleNum);

                    if (createBlockP.emtyPositon(positonArry,horizontally+1,vertical,angleNum)==false){

                        horizontally++;

                    }
                    _block = createBlockG.getGemeBlock(_block, horizontally, vertical, numBlock,angleNum);
                    positonArry = createBlockP.getGemeBlock(positonArry, horizontally, vertical, numBlock,angleNum);

                    timelineAnimation.play();

                }else if (t.getCode() == KeyCode.S){
                    timelineAnimation.pause();



                    _block = createBlockG.removBlockLayout(_block, horizontally, vertical,angleNum);
                    positonArry = createBlockP.removBlockPositon(positonArry, horizontally, vertical,angleNum);
                    if (createBlockP.emtyPositon(positonArry,horizontally,vertical+1,angleNum)==false){
                        points = points+(1*indexLevel);
                        _pointsCount.setText("" + points);
                        vertical++;

                    }
                    _block = createBlockG.getGemeBlock(_block, horizontally, vertical, numBlock,angleNum);
                    positonArry = createBlockP.getGemeBlock(positonArry, horizontally, vertical, numBlock,angleNum);

                    timelineAnimation.play();


                }else {


                }

             }
         });

     }
    public void chenge() throws IOException {

        timelineAnimation.stop();
        GridPane pene = FXMLLoader.load(getClass().getResource("gameFinalScreen.fxml"));
        _plyeBordContaner.getChildren().setAll(pene);
    }

    public void printArry(int [][] positonArry){

        for (int i = 0; i < 22; i++) {
            for (int e = 0; e < 12; e++) {
                if (i == 21){
                    if(e >= 10){
                        System.out.print(e);
                    }else
                    System.out.print(e+" ");
                }else
                    System.out.print(positonArry[e][i]+" ");
            }
            if(i!=21){
                System.out.println(i);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public int  setRandomNumber(){
        return (int)(Math.random() * ((6) + 1));
    }
    public int[][] clerPosition(int[][] positonArry) {
        int number = 0;
        for (int i = 19; i > 0; i--) {

            if ( createBlockP.clerPosition(positonArry,i)) {
                number++;
                for (int z = i;z>0;z--){
                    for (int e = 1; e <= 10; e++) {
                            positonArry = createBlockP.setPositon(positonArry,e,z,positonArry[e][z-1]);
                            _block = createBlockG.clerPosition(_block,e,z,positonArry[e][z-1]);

                    }
                }
                points=(points)+(10*number*indexLevel);
                numberOfRow++;

                _pointsCount.setText("" + points);
                i++;
            }

        }
        return positonArry;
    }
    public double[] setLevel(double[] level){
         for ( int i = 0; i < 26; i++){
             level[i]= (-i*0.05)+1.3;
         }
        return level;
    }

}
