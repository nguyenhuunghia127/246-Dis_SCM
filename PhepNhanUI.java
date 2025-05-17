package baitapUT;

import javax.swing.*;
import java.awt.event.*;

public class PhepNhanDonGian {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frame = new JFrame("Nhân hai số");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Ô nhập số 1
        JTextField so1 = new JTextField();
        so1.setBounds(50, 20, 200, 25);
        frame.add(so1);

        // Ô nhập số 2
        JTextField so2 = new JTextField();
        so2.setBounds(50, 50, 200, 25);
        frame.add(so2);

        // Nút "Nhân"
        JButton btnNhan = new JButton("Nhân");
        btnNhan.setBounds(100, 80, 100, 25);
        frame.add(btnNhan);

        // Kết quả
        JLabel ketQua = new JLabel("Kết quả: ");
        ketQua.setBounds(50, 120, 200, 25);
        frame.add(ketQua);

        // Sự kiện khi nhấn nút
        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(so1.getText());
                    double b = Double.parseDouble(so2.getText());
                    ketQua.setText("Kết quả: " + (a * b));
                } catch (NumberFormatException ex) {
                    ketQua.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        // Hiển thị giao diện
        frame.setVisible(true);
    }
}
