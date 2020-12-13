package lab11.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{
    public Window() {
        JFrame frame = new JFrame("Ex 3");

        Label label = new Label("Выбор цвета текста");
        label.setBounds(30, 10, 200, 15);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        frame.add(label);

        JComboBox faceCombo = new JComboBox();
        faceCombo.setBackground(Color.yellow);
        faceCombo.setEditable(true);
        faceCombo.addItem("Blue");
        faceCombo.addItem("Red");
        faceCombo.addItem("Black");
        faceCombo.setBounds(30, 25, 200, 25);
        frame.add(faceCombo);

        Label label1 = new Label("Выбор шрифта текста");
        label1.setBounds(30, 60, 200, 15);
        label1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        frame.add(label1);

        JComboBox faceCombo1 = new JComboBox();
        faceCombo1.setEditable(true);
        faceCombo1.setBackground(Color.orange);
        faceCombo1.addItem("Times New Roman");
        faceCombo1.addItem("MS Sans Serif");
        faceCombo1.addItem("Courier New");
        faceCombo1.setBounds(30, 75, 200, 25);
        frame.add(faceCombo1);

        JTextArea field = new JTextArea("Текст", 2, 3);
        field.setFont(new Font("Dialog", Font.PLAIN, 14));

        field.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        field.setBounds(30, 110, 200, 60);

        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo.getSelectedIndex()==0) {
                    field.setForeground(Color.BLUE);
                }
                else if (faceCombo.getSelectedIndex()==1) {
                    field.setForeground(Color.RED);
                }
                else if (faceCombo.getSelectedIndex()==2) {
                    field.setForeground(Color.BLACK);
                }
            }
        });

        faceCombo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo1.getSelectedIndex()==0) {
                    field.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                }
                else if (faceCombo1.getSelectedIndex()==1) {
                    field.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                }
                else if (faceCombo1.getSelectedIndex()==2) {
                    field.setFont(new Font("Courier New", Font.PLAIN, 14));
                }
            }
        });

        frame.add(field);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
