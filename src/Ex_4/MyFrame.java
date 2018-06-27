package Ex_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    public MyFrame(String name) {
        super(name);
        setBounds(250,250,300,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel lbl = new JLabel("Blue text",JLabel.CENTER);
        lbl.setBounds(10,30,280,50);
        lbl.setForeground(Color.BLUE);
        lbl.setBorder(BorderFactory.createEtchedBorder());
        add(lbl);
        JButton btn = new JButton("Close window");
        btn.setBounds(50,120,200,30);
        btn.setFocusPainted(false);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(btn);
        setVisible(true);

    }
}
