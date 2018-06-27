package Ex_6;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
     MyFrame(String name, String txt, ImageIcon img){
         super(name);
         setBounds(250,250,300,200);
         setResizable(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(null);
         MyPanel pnl = new MyPanel(txt, img);
         MyButton btn = new MyButton(50,120,200,30);
         add(pnl);
         add(btn);
         setVisible(true);
    }
}
