package baitapUT;
import javax.swing.*;
import java.awt.event.*;

public class DienTichHinhTron {
    public static void main(String[] args) {
        // Tạo cửa sổ
        JFrame frame = new JFrame("Tính diện tích hình tròn");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nhãn và ô nhập bán kính
        JLabel lblBanKinh = new JLabel("Nhập bán kính:");
        lblBanKinh.setBounds(30, 30, 100, 25);
        frame.add(lblBanKinh);

        JTextField txtBanKinh = new JTextField();
        txtBanKinh.setBounds(140, 30, 150, 25);
        frame.add(txtBanKinh);

        // Nút tính
        JButton btnTinh = new JButton("Tính diện tích");
        btnTinh.setBounds(100, 70, 130, 30);
        frame.add(btnTinh);

        // Nhãn hiển thị kết quả
        JLabel lblKetQua = new JLabel("Diện tích: ");
        lblKetQua.setBounds(30, 120, 300, 25);
        frame.add(lblKetQua);

        // Xử lý sự kiện khi nhấn nút
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double r = Double.parseDouble(txtBanKinh.getText());
                    if (r < 0) {
                        lblKetQua.setText("Bán kính phải >= 0");
                    } else {
                        double dienTich = Math.PI * r * r;
                        lblKetQua.setText("Diện tích: " + String.format("%.2f", dienTich));
                    }
                } catch (NumberFormatException ex) {
                    lblKetQua.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
