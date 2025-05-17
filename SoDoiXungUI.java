package baitapUT;

import javax.swing.*;
import java.awt.event.*;

public class SoDoiXungUI {
    public static void main(String[] args) {
        // Tạo cửa sổ chính
        JFrame frame = new JFrame("Kiểm tra số đối xứng");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nhãn + ô nhập
        JLabel lblNhap = new JLabel("Nhập số nguyên:");
        lblNhap.setBounds(30, 30, 100, 25);
        frame.add(lblNhap);

        JTextField txtSo = new JTextField();
        txtSo.setBounds(140, 30, 150, 25);
        frame.add(txtSo);

        // Nút kiểm tra
        JButton btnKiemTra = new JButton("Kiểm tra");
        btnKiemTra.setBounds(110, 70, 120, 30);
        frame.add(btnKiemTra);

        // Nhãn kết quả
        JLabel lblKetQua = new JLabel("Kết quả: ");
        lblKetQua.setBounds(30, 120, 300, 25);
        frame.add(lblKetQua);

        // Sự kiện nút
        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(txtSo.getText());
                    if (laSoDoiXung(n)) {
                        lblKetQua.setText("Kết quả: " + n + " là số đối xứng.");
                    } else {
                        lblKetQua.setText("Kết quả: " + n + " không phải là số đối xứng.");
                    }
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        });

        // Hiển thị UI
        frame.setVisible(true);
    }

    // Hàm kiểm tra số đối xứng
    public static boolean laSoDoiXung(int n) {
        int soGoc = n;
        int daoNguoc = 0;

        while (n > 0) {
            int chuSo = n % 10;
            daoNguoc = daoNguoc * 10 + chuSo;
            n /= 10;
        }

        return soGoc == daoNguoc;
    }
}
