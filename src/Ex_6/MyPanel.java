package Ex_6;

import javax.swing.*;

class MyPanel extends JPanel {
    MyPanel(String txt, ImageIcon img) {
        super();
        setBounds(5,5,285,110);
        setBorder(BorderFactory.createEtchedBorder());
        setLayout(null);
        JLabel imgLbl = new JLabel(img);
        imgLbl.setBounds(10,10,90,90);
        imgLbl.setBorder(BorderFactory.createEtchedBorder());
        JLabel txtLbl = new JLabel(txt, JLabel.CENTER);
        txtLbl.setBounds(110,10,165,90);
        txtLbl.setBorder(BorderFactory.createEtchedBorder());
        add(txtLbl);
        add(imgLbl);
    }
}
