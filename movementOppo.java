package mikami;

import java.util.Timer;
import java.util.TimerTask;

public class MovementOppo {
    Timer move;

    public MovementOppo(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Var.ballX >= Var.frameWidth / 2 - 10){
                    if (Var.ballY == Var.rightYPos){

                    } else if (Var.ballY > Var.rightYPos + 40){
                        if (Var.rightYPos <= Var.frameHeight -125){
                            Var.rightYPos +=2;
                        }
                    } else if (Var.rightYPos < Var.rightYPos + 40){
                        if (Var.rightYPos >= 20){
                            Var.rightYPos-= 2;
                        }
                    }
                }

            }
        },0,6);

    }
}
