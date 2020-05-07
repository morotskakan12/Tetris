package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import javax.swing.*;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;


public class PlyeBordControler {
    @FXML
    GridPane _contaner;
    @FXML
    Pane _gameFild;
    Pane _block = new Pane();
    createBlockGraphics cbg = new createBlockGraphics();
    createBlockPosion cbp = new createBlockPosion();
    int[][] positonArry = new int[20][10];
    int numRot;
    int numBlock;
    int horizontally;
    int vertical;
    public void initialize() throws IOException {
        _gameFild.setMinWidth(250);
        _gameFild.setMinHeight(500);
        _gameFild.getStyleClass().add("gameFild");



        cbg.setGameBord(_gameFild);
        positonArry = cbp.blockPositon(positonArry,0,0);
        printArry(positonArry);
                _gameFild.getChildren().add(_block);
        this.time();


    }


    public void time() {

        Timeline timeline1 = new Timeline();

        timeline1.setCycleCount(Timeline.INDEFINITE);

        timeline1.getKeyFrames().add(new KeyFrame(
                Duration.seconds(3),
                ae -> {
                    numBlock = 2;
                    vertical = 0;
                    horizontally = 0;
                    _block = cbg.getGemeBlock(_block,horizontally,vertical,numBlock);

                    positonArry = cbp.getGemeBlock(positonArry,horizontally,vertical,numBlock);
                    printArry(positonArry);
                    positonArry = cbp.removBlockPositon(positonArry,horizontally,vertical);
                    printArry(positonArry);
                    /*numRot = numRot+90;
                    rot(_block,numRot);*/
                }));
        Timeline timeline2 = new Timeline();

        timeline2.setCycleCount(Timeline.INDEFINITE);

        timeline2.getKeyFrames().add(new KeyFrame(
                Duration.seconds(2),
                ae -> {
                    _block = cbg.removBlockLayout(_block,5,5);

                }));


       Timeline timeline = new Timeline(new KeyFrame(
                Duration.seconds(20),
                ae -> {
                    try {
                        chenge();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));


        timeline1.playFromStart();
        timeline2.playFromStart();

        timeline.play();
    }


    public void chenge() throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("gameFinalScreen.fxml"));
        _contaner.getChildren().setAll(pene);
    }
    public Pane rot(Pane block,int i ){

        block.rotateProperty().setValue(i);
        return block;
    }
    public void printArry(int [][] positonArry){
        for (int i = 0; i < 21; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == 20){
                    System.out.print(j+" ");
                }else
                    System.out.print(positonArry[i][j]+" ");
            }
            if(i!=20){
                System.out.println(i);
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public int  setRandomNumber(){
        return (int)(Math.random() * ((6) + 1));
    }




}

