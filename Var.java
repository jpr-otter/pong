package mikami;

import javax.swing.*;

public class Var {

    static JFrame jframe;
    static int frameWidth = 640;
    static int frameHeight = 480;
    static int leftXPos = Var.frameWidth/2 - 300;
    static int leftYPos = Var.frameHeight / 2 - 60;
    static int rightXPos = Var.frameWidth/2 + 280;
    static int rightYPos = Var.frameHeight / 2 - 60;
    static boolean moveUp = false;
    static boolean moveDown = false;
    static int playerLeftScore = 0;
    static int playerRightScore = 0;
    static int ballX = Var.frameWidth / 2;
    static int ballY = Var.frameHeight / 2;
    static int ballDirX = 1;
    static int ballDirY = -1;

    public Var(){

    }
}
