package bootcamp.screens;


import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static bootcamp.Canvas.PADDING;


public class WinningScreen implements Screen {

    Timer countdownTimer = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            countdownAction();
        }
    });
    private Picture backGround;
    private boolean canMoveToNextScreen = false;
    private int countdown = 3;
    private boolean showPlayAgain = true;


    @Override
    public void init() {
        createPics();
        backGround.draw();
        countdownTimer.start();
    }

    @Override
    public void delete() {
        backGround.delete();
    }

    @Override
    public void createPics() {
        backGround = new Picture(PADDING, PADDING, "kingWon.png");
    }


    private boolean countdownAction() {
        while (countdown != 0) {
            countdown--;
            return false;
        }
        countdown = 3;
        countdownTimer.stop();
        return canMoveToNextScreen = true;
    }

    public boolean getCanMoveToNextScreen() {
        return canMoveToNextScreen;
    }

}