package Ex_6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("");
        String txt = "<html>Это жираф.<br>Он большой.<br>Он все видит</html>";
        new MyFrame("Обработчик - объект кнопки", txt,img);
    }
}
