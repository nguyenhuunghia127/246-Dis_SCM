
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MayTinhDonGian extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JLabel lblKetQua;

    public MayTinhDonGian() {
        setTitle("Máy tính đơn giản");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        // Tạo các thành phần
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        lblKetQua = new JLabel("Kết quả: ");

        JButton btnCong = new JButton("+");
        JButton btnTru = new JButton("-");
        JButton btnNhan = new JButton("*");
        JButton btnChia = new JButton("/");

        // Panel nhập liệu
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Số 1:"));
        inputPanel.add(txtSo1);
        inputPanel.add(new JLabel("Số 2:"));
        inputPanel.add(txtSo2);

        // Panel nút phép tính
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnCong);
        buttonPanel.add(btnTru);
        buttonPanel.add(btnNhan);
        buttonPanel.add(btnChia);

        // Panel kết quả
        JPanel resultPanel = new JPanel();
        resultPanel.add(lblKetQua);

        // Thêm các panel vào frame
        setLayout(new GridLayout(3, 1));
        add(inputPanel);
        add(buttonPanel);
        add(resultPanel);

        // Xử lý sự kiện
        ActionListener tinhToan = e -> {
            try {
                double so1 = Double.parseDouble(txtSo1.getText());
                double so2 = Double.parseDouble(txtSo2.getText());
                double ketQua = 0;

                if (e.getSource() == btnCong) {
                    ketQua = so1 + so2;
                } else if (e.getSource() == btnTru) {
                    ketQua = so1 - so2;
                } else if (e.getSource() == btnNhan) {
                    ketQua = so1 * so2;
                } else if (e.getSource() == btnChia) {
                    if (so2 == 0) {
                        lblKetQua.setText("Lỗi: Không chia được cho 0");
                        return;
                    }
                    ketQua = so1 / so2;
                }

                lblKetQua.setText("Kết quả: " + ketQua);
            } catch (NumberFormatException ex) {
                lblKetQua.setText("Vui lòng nhập số hợp lệ!");
            }
        };

        btnCong.addActionListener(tinhToan);
        btnTru.addActionListener(tinhToan);
        btnNhan.addActionListener(tinhToan);
        btnChia.addActionListener(tinhToan);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MayTinhDonGian().setVisible(true));
    }
}

