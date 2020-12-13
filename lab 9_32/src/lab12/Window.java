package lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        JFrame frame = new JFrame("example");
        Label label1 = new Label("Выберите планету");
        label1.setBounds(30, 10, 320, 15);
        label1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        frame.add(label1);

        JComboBox faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        faceCombo.setBackground(Color.orange);
        faceCombo.addItem("Меркурий");
        faceCombo.addItem("Венера");
        faceCombo.addItem("Земля");
        faceCombo.addItem("Марс");
        faceCombo.addItem("Юпитер");
        faceCombo.addItem("Сатурн");
        faceCombo.addItem("Уран");
        faceCombo.addItem("Нептун");

        faceCombo.setBounds(30, 30, 100, 30);
        frame.add(faceCombo);

        Label label3 = new Label("Ускорение свободного падения");
        label3.setBackground(Color.orange);
        label3.setBounds(30, 70, 250, 20);
        label3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        frame.add(label3);

        Label label4 = new Label("выбранной планеты");
        label4.setBounds(30, 90, 140, 20);
        label4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        frame.add(label4);

        Label label2 = new Label("3,70 м/с²");
        label2.setBounds(170, 90, 70, 20);
        label2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        frame.add(label2);

        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (faceCombo.getSelectedIndex() == 0) {
                    label2.setText("3,70 м/с²");
                } else if (faceCombo.getSelectedIndex() == 1) {
                    label2.setText("8,87 м/с²");
                } else if (faceCombo.getSelectedIndex() == 2) {
                    label2.setText("9,81 м/с²");
                } else if (faceCombo.getSelectedIndex() == 3) {
                    label2.setText("3,71 м/с²");
                } else if (faceCombo.getSelectedIndex() == 4) {
                    label2.setText("24,79 м/с²");
                } else if (faceCombo.getSelectedIndex() == 5) {
                    label2.setText("10,44 м/с²");
                } else if (faceCombo.getSelectedIndex() == 6) {
                    label2.setText("8,87 м/с²");
                } else if (faceCombo.getSelectedIndex() == 7) {
                    label2.setText("11,15 м/с²");
                }

            }
        });

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

