package test;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton btn = new JButton("shock me");
        JButton btn1 = new JButton("bliss");
        JButton btn2 = new JButton("huh?");

        JPanel panel = new JPanel();
        panel.add(btn);
        panel.add(btn1);
        panel.add(btn2);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300,300);
        frame.setVisible(true);


    }
}

