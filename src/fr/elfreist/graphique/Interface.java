package fr.elfreist.graphique;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    public static void main(String[] args) {
        JFrame first = new JFrame("To do list");
        JFrame second = new JFrame();
        JPanel panel = new JPanel();
        JTextArea text = new JTextArea();
        JButton firstbtn = new JButton("Ajouter une tâche");
        JButton secondbtn = new JButton("Ajouter une tâche");

        panel.setBounds(15, 20, 250, 150);
        text.setBounds(15, 20, 250, 150);
        firstbtn.setBounds(50, 210, 180, 30);
        secondbtn.setBounds(50, 210, 180, 30);
        second.setSize(300, 300);
        first.setSize(300, 300);

        first.add(panel);
        second.add(text);
        first.add(firstbtn);
        second.add(secondbtn);
        first.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        first.setLayout(null);
        second.setLayout(null);
        first.setVisible(true);
        firstbtn.addActionListener(e -> second.setVisible(true));

        secondbtn.addActionListener(e -> {
            String test = text.getText();
            System.out.println();
            JCheckBox check = new JCheckBox(test);
            panel.add(check);
            panel.updateUI();
            check.addActionListener(e1 -> {
                System.out.println("test");
                if (check.isSelected()) {
                    panel.remove(check);
                    panel.revalidate();
                    panel.updateUI();
                }
            });
        });

    }
}
