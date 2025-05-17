/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timso;

import javax.swing.*;
import java.awt.event.*;

public class TimSoNhoNhat extends JFrame {
    private JTextField txtA, txtB, txtMin;
    private JButton btnTim;

    public TimSoNhoNhat() {
        setTitle("Tìm Số Nhỏ Nhất");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(30, 30, 50, 25);
        txtA = new JTextField();
        txtA.setBounds(100, 30, 150, 25);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(30, 60, 50, 25);
        txtB = new JTextField();
        txtB.setBounds(100, 60, 150, 25);

        btnTim = new JButton("Tìm nhỏ nhất");
        btnTim.setBounds(80, 100, 120, 30);

        JLabel lblMin = new JLabel("Kết quả:");
        lblMin.setBounds(30, 140, 60, 25);
        txtMin = new JTextField();
        txtMin.setBounds(100, 140, 150, 25);
        txtMin.setEditable(false);

        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(btnTim);
        add(lblMin); add(txtMin);

        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int min = (a < b) ? a : b;
                    txtMin.setText(String.valueOf(min));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TimSoNhoNhat(); // 👉 Class này chạy được
    }
}
