package lab11.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Window extends JFrame{
    public int k = 0;
    Window(){
        super("Game");
        Random random = new Random();
        int numb = random.nextInt(20);
        JButton check = new JButton("Проверка значения");
        JButton exit = new JButton("Закрыть");
        check.setBackground(Color.green);
        JTextField field = new JTextField("Введите значение", 20);
        field.setFont(new Font("Times new roman", Font.PLAIN, 20));
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setBounds(85,100,320,40);
        check.setBounds(85,160,320,40);
        exit.setBounds(85,290,320,40);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        exit.setVisible(false);
        add(check);
        add(field);
        add(exit);
        JTextField text = new JTextField ("Результат угадывания",10);
        text.setBackground(Color.yellow);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setFont(new Font("Dialog", Font.PLAIN, 20));
        text.setBounds(85,230,320,30);
        add(text);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = Integer.parseInt(field.getText());
                if (n<numb){
                    text.setText("Число меньше необходимого");
                }else if (n>numb){
                    text.setText("Число больше необходимого");
                }else{
                    text.setText("Вы победили");
                    exit.setVisible(true);
                    check.setVisible(false);
                }
                k++;
                if (k==3){
                    text.setText("Вы проиграли");
                    text.setBounds(45,230,400,60);
                    check.setVisible(false);
                    exit.setVisible(true);
                }
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        check.addActionListener(actionListener);
        exit.addActionListener(actionListener2);
    }
}
