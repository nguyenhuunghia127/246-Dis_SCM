package baitapUT;

import javax.swing.*;
import java.awt.event.*;

public class BoiSoChungNhoNhatUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tính BCNN của hai số");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        lblSo1.setBounds(30, 20, 100, 25);
        frame.add(lblSo1);

        JTextField txtSo1 = new JTextField();
        txtSo1.setBounds(120, 20, 150, 25);
        frame.add(txtSo1);

        JLabel lblSo2 = new JLabel("Số thứ hai:");
        lblSo2.setBounds(30, 60, 100, 25);
        frame.add(lblSo2);

        JTextField txtSo2 = new JTextField();
        txtSo2.setBounds(120, 60, 150, 25);
        frame.add(txtSo2);

        JButton btnTinh = new JButton("Tính BCNN");
        btnTinh.setBounds(100, 100, 120, 30);
        frame.add(btnTinh);

        JLabel lblKetQua = new JLabel("Kết quả: ");
        lblKetQua.setBounds(30, 140, 300, 25);
        frame.add(lblKetQua);

        // Xử lý khi bấm nút
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtSo1.getText());
                    int b = Integer.parseInt(txtSo2.getText());
                    int bcnn = (a * b) / ucln(a, b);
                    lblKetQua.setText("Kết quả: BCNN(" + a + ", " + b + ") = " + bcnn);
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        });

        frame.setVisible(true);
    }

    // Hàm tìm Ước chung lớn nhất (dùng để tính BCNN)
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
