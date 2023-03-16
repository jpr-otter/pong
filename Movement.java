package mikami;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
    Timer move;

    public Movement(){

        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run() {

                if (Var.moveUp == true){
                    if (Var.leftYPos >= 10){
                        Var.leftYPos -= 2;
                    }
                } else if (Var.moveDown == true){
                    if (Var.leftYPos <= Var.frameHeight - 125)
                    Var.leftYPos += 2;
                }
            }
        }, 0, 6);

    }
}
