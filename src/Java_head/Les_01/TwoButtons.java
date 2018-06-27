package Java_head.Les_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    private void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());

        label = new JLabel("I'm a label");
        MyDrawPanel drawPanel = new MyDrawPanel();



        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(600, 600);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }

    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }



}
