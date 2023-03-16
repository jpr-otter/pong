package mikami;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {

    Timer move;
    public BallMovement(){
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                Var.ballX += Var.ballDirX;
                Var.ballY += Var.ballDirY;



            }
        },0,3);

    }
}
