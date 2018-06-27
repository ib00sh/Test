package MyFrameWithBtn;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame()  {
        super("Window with button");
        setBounds(250,250,300,200);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl = new JLabel("Push to close");
        lbl.setBounds(10,30,280,50);
        add(lbl);
        JButton btn = new JButton("Close window");
        btn.setBounds(50,120,200,30);
        MyHandler hnd = new MyHandler();
        btn.addActionListener(hnd);
        add(btn);
        setVisible(true);
    }
}
