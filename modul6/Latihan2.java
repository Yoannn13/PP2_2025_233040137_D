/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan2 {

	public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            JFrame frame = new JFrame("Konverter Suhu - Celcius ke Fahrenheit");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            frame.setSize(400, 140);
	            frame.setLocationRelativeTo(null);

	            JPanel panel = new JPanel(new GridBagLayout());
	            GridBagConstraints c = new GridBagConstraints();
	            c.insets = new Insets(6, 8, 6, 8);
	            c.fill = GridBagConstraints.HORIZONTAL;

	            JLabel lblC = new JLabel("Celcius:");
	            c.gridx = 0; c.gridy = 0; c.weightx = 0;
	            panel.add(lblC, c);

	            JTextField tfC = new JTextField();
	            tfC.setToolTipText("Masukkan angka, misal 36.6");
	            c.gridx = 1; c.gridy = 0; c.weightx = 1.0;
	            panel.add(tfC, c);

	            JButton btnConvert = new JButton("Konversi");
	            c.gridx = 2; c.gridy = 0; c.weightx = 0;
	            panel.add(btnConvert, c);

	            JLabel lblF = new JLabel("Fahrenheit:");
	            c.gridx = 0; c.gridy = 1; c.weightx = 0;
	            panel.add(lblF, c);

	            JLabel result = new JLabel("");
	            result.setFont(result.getFont().deriveFont(14f));
	            c.gridx = 1; c.gridy = 1; c.gridwidth = 2; c.weightx = 1.0;
	            panel.add(result, c);

	            btnConvert.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    String text = tfC.getText().trim();
	                    if (text.isEmpty()) {
	                        JOptionPane.showMessageDialog(frame, 
                                        "Masukkan nilai Celcius terlebih dahulu.", "Input kosong", 
                                        JOptionPane.WARNING_MESSAGE);
	                        return;
	                    }
	                    try {
	                        double celsius = Double.parseDouble(text);
	                        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
	                        String formatted = String.format("%.2f °F", fahrenheit);
	                        result.setText(formatted);
	                    } catch (NumberFormatException ex) {
	                        JOptionPane.showMessageDialog(frame, 
                                        "Input tidak valid. Masukkan angka (contoh: 36.6).", "Error", 
                                        JOptionPane.ERROR_MESSAGE);
	                        result.setText("");
	                    }
	                }
	            });
	            tfC.addActionListener(btnConvert.getActionListeners()[0]);
	            frame.add(panel);
	            frame.setVisible(true);
	        });
	    }
}