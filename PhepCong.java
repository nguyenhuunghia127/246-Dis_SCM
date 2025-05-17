/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phepcong;

import javax.swing.*;
import java.awt.event.*;

public class PhepCong extends JFrame {
    private JTextField txtA, txtB, txtResult;
    private JButton btnCong;

    public PhepCong() {
        setTitle("Phép Cộng Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Không tắt toàn bộ chương trình khi đóng
        setLayout(null);

        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(30, 20, 50, 25);
        txtA = new JTextField();
        txtA.setBounds(80, 20, 150, 25);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(30, 50, 50, 25);
        txtB = new JTextField();
        txtB.setBounds(80, 50, 150, 25);

        btnCong = new JButton("Cộng");
        btnCong.setBounds(100, 80, 80, 30);

        JLabel lblResult = new JLabel("Kết quả:");
        lblResult.setBounds(30, 120, 60, 25);
        txtResult = new JTextField();
        txtResult.setBounds(100, 120, 130, 25);
        txtResult.setEditable(false);

        add(lblA);
        add(txtA);
        add(lblB);
        add(txtB);
        add(btnCong);
        add(lblResult);
        add(txtResult);

        // Xử lý sự kiện nút Cộng
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int result = a + b;
                    txtResult.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên!");
                }
            }
        });

        setVisible(true);
    }

    // Cho phép chạy riêng để test
    public static void main(String[] args) {
        new PhepCong();
    }
}
