package mikami;

import java.util.Timer;
import java.util.TimerTask;

public class BallCollision {
    Timer ballCollision;

    public BallCollision(){
        ballCollision = new Timer();
        ballCollision.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Var.ballY + 40 >= Var.frameHeight){
                    Var.ballDirY = -1;
                }
                if (Var.ballY <= 20){
                    Var.ballDirY = 1;
                }

                if (Var.ballX + 20 >= Var.frameWidth){
                    Var.ballX = Var.frameWidth / 2 - 10;
                    Var.ballY = Var.frameHeight / 2 - 10;
                    Var.ballDirX = -1;
                    Var.playerLeftScore += 1;
                }
                if (Var.ballX <= 0){
                    Var.ballX = Var.frameWidth / 2 - 10;
                    Var.ballY = Var.frameHeight / 2 - 10;
                    Var.ballDirX = 1;
                    Var.playerRightScore += 1;
                }

                if (Var.ballX < Var.leftXPos + 20 && Var.ballX > Var.leftXPos && Var.ballY - 20 <= Var.leftYPos + 150 && Var.ballY > Var.leftYPos){
                    Var.ballDirX = 1;
                }
                if (Var.ballX < Var.rightXPos + 20 && Var.ballX > Var.rightXPos && Var.ballY - 20 <= Var.rightYPos + 150 && Var.ballY > Var.rightYPos){
                    Var.ballDirX = -1;
                }



            }
        },0,1);
    }
}
