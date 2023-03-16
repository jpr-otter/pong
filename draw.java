package mikami;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {
    public static Draw labelDraw;

    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,Var.frameWidth,Var.frameHeight);

        g.setColor(Color.WHITE);
        for (int i = 0; i <= 30; i++){
            g.fillRect(Var.frameWidth / 2 ,i * 20, 1, 10);
        }

        g.fillRect(Var.leftXPos , Var.leftYPos , 10, 80);
        g.fillRect(Var.rightXPos, Var.rightYPos ,10,80);
        g.drawString("" + Var.playerLeftScore, Var.frameWidth / 2 - 100, 20);
        g.drawString("" + Var.playerRightScore, Var.frameWidth / 2 + 100, 20);
        g.fillRoundRect(Var.ballX - 10, Var.ballY - 20, 20,20,20,20);
        repaint();
    }
}
