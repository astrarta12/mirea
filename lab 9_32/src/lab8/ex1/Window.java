package lab8.ex1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {

    Window(){
        super("Фигуры");
        setBounds(0,0,1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        for (int i=0, q=0; i<20; i++, q=((int)(Math.random()*10))%3){
            Random random= new Random();
            graphics2D.setColor(new Color (Math.abs(random.nextInt())));
            drawShape(new Circle( Math.random()*500, Math.random()*500, Math.random()*500), graphics2D);
            drawShape(new Rectangle(Math.random()*500, Math.random()*500, Math.random()*500, Math.random()*500), graphics2D);
        }
    }
    
    private void drawShape(Shape a, Graphics2D graphics2D){
        a.draw(graphics2D);
    }
}