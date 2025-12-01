/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.unpas.modul08.view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PersegiPanjangView extends JFrame {
    // Komponen UI sebagai atribut
    private JTextField txtPanjang = new JTextField(10);
    private JTextField txtLebar = new JTextField(10);
    private JLabel lblHasilLuas = new JLabel("-");
    private JLabel lblHasilKeliling = new JLabel("-");
    private JButton btnHitung = new JButton("Hitung Luas");
    private JButton btnHitungKeliling = new JButton("Hitung Keliling");
    private JButton btnReset = new JButton("Reset");
    
    public PersegiPanjangView() {
        // Inisialisasi UI
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLayout(new GridLayout(6, 2, 10, 10));
        this.setTitle("MVC Kalkulator Persegi Panjang");
        
        // Menambahkan komponen ke frame
        this.add(new JLabel(" Panjang: "));
        this.add(txtPanjang);
        this.add(new JLabel(" Lebar: "));
        this.add(txtLebar);
        this.add(new JLabel(" Hasil Luas: "));
        this.add(lblHasilLuas);
        this.add(new JLabel(" Hasil Keliling: "));
        this.add(lblHasilKeliling);
        this.add(btnHitung);
        this.add(btnHitungKeliling);
        this.add(new JLabel("")); // Spacer kosong
        this.add(btnReset);
    }
    
    // Getter untuk mengambil nilai dari textfield
    public double getPanjang() {
        return Double.parseDouble(txtPanjang.getText());
    }
    
    public double getLebar() {
        return Double.parseDouble(txtLebar.getText());
    }
    
    // Setter untuk menampilkan hasil
    public void setHasilLuas(double hasil) {
        lblHasilLuas.setText(String.valueOf(hasil));
    }
    
    public void setHasilKeliling(double hasil) {
        lblHasilKeliling.setText(String.valueOf(hasil));
    }
    
    // Method untuk reset input dan hasil
    public void resetInput() {
        txtPanjang.setText("");
        txtLebar.setText("");
        lblHasilLuas.setText("-");
        lblHasilKeliling.setText("-");
    }
    
    // Method untuk menampilkan pesan error
    public void tampilkanPesanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }
    
    // Method untuk mendaftarkan listener
    public void addHitungListener(ActionListener listener) {
        btnHitung.addActionListener(listener);
    }
    
    public void addHitungKelilingListener(ActionListener listener) {
        btnHitungKeliling.addActionListener(listener);
    }
    
    public void addResetListener(ActionListener listener) {
        btnReset.addActionListener(listener);
    }
}