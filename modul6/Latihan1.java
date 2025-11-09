/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul06;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author rids2
 */
public class Latihan1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Kalkulator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(320, 420);
            frame.setLocationRelativeTo(null);

            JTextField display = new JTextField();
            display.setHorizontalAlignment(JTextField.RIGHT);
            display.setEditable(false);
            display.setFont(display.getFont().deriveFont(24f));
            frame.add(display, BorderLayout.NORTH);

            JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "C", "+"
            };

            for (String text : buttons) {
                JButton b = new JButton(text);
                b.setFont(b.getFont().deriveFont(18f));
                buttonPanel.add(b);
            }

            frame.add(buttonPanel, BorderLayout.CENTER);
            JLabel status = new JLabel("Modul 6 Latihan 1");
            status.setHorizontalAlignment(SwingConstants.CENTER);
            status.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
            frame.add(status, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }	
}
