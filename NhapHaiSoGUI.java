/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nhaphaiso;

import javax.swing.*;
import java.awt.event.*;

public class NhapHaiSoGUI extends JFrame {
    private JTextField txtA, txtB;
    private JButton btnOK;
    private int a, b;

    public NhapHaiSoGUI() {
        setTitle("Nhập Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(30, 30, 60, 25);
        txtA = new JTextField();
        txtA.setBounds(100, 30, 150, 25);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(30, 60, 60, 25);
        txtB = new JTextField();
        txtB.setBounds(100, 60, 150, 25);

        btnOK = new JButton("Xác nhận");
        btnOK.setBounds(100, 100, 100, 30);

        add(lblA); add(txtA);
        add(lblB); add(txtB);
        add(btnOK);

        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Integer.parseInt(txtA.getText());
                    b = Integer.parseInt(txtB.getText());
                    JOptionPane.showMessageDialog(null, "Bạn đã nhập:\nA = " + a + "\nB = " + b);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        setVisible(true);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        new NhapHaiSoGUI(); // 👉 Chạy được độc lập
    }
}
