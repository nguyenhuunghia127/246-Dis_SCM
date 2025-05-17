/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timso;

import javax.swing.*;
import java.awt.event.*;

public class UocChungLonNhat extends JFrame {
    private JTextField txtA, txtB, txtUCLN;
    private JButton btnTim;

    public UocChungLonNhat() {
        setTitle("Tìm Ước Số Chung Lớn Nhất");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(30, 30, 60, 25);
        txtA = new JTextField();
        txtA.setBounds(100, 30, 200, 25);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(30, 60, 60, 25);
        txtB = new JTextField();
        txtB.setBounds(100, 60, 200, 25);

        btnTim = new JButton("Tìm ƯCLN");
        btnTim.setBounds(100, 100, 120, 30);

        JLabel lblUCLN = new JLabel("ƯCLN:");
        lblUCLN.setBounds(30, 140, 60, 25);
        txtUCLN = new JTextField();
        txtUCLN.setBounds(100, 140, 200, 25);
        txtUCLN.setEditable(false);

        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(btnTim);
        add(lblUCLN); add(txtUCLN);

        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int ucln = timUCLN(a, b);
                    txtUCLN.setText(String.valueOf(ucln));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        setVisible(true);
    }

    // 🧠 Hàm tìm ƯCLN bằng thuật toán Euclid
    public int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        new UocChungLonNhat(); // 👉 Chạy độc lập
    }
}
