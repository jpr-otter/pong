package mikami;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;

public class Gui {

    public Gui(){

        Var.jframe = new JFrame();
        Var.jframe.setSize(Var.frameWidth, Var.frameHeight);
        Var.jframe.setTitle("ULTRA PONG");
        Var.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jframe.setLayout(null);
        Var.jframe.setResizable(false);
        Var.jframe.setVisible(true);
        Var.jframe.setLocationRelativeTo(null);
        Var.jframe.addKeyListener(new KeyHandler());
        Var.jframe.requestFocus();

        Draw.labelDraw = new Draw();
        Draw.labelDraw.setBounds(0,0,Var.frameWidth,Var.frameHeight);
        Draw.labelDraw.setVisible(true);
        Var.jframe.add(Draw.labelDraw);

    }
}
