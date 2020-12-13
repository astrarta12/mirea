package lab8.ex2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {
    Image image;
    String a;

    Window(String a){
        this.a = a;
        try {
            image = ImageIO.read(new File(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(0,0,image.getHeight(null),image.getWidth(null));
        setTitle ("Картинка");
        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        if(image!=null) {
            g.drawImage(image, 0, 0, null);
        }
    }
}
