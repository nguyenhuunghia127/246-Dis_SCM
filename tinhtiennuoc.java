
package tinhtiennuoc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tinhtiennuoc extends JFrame {
    private JTextField tfSoDau, tfSoCuoi;
    private JLabel lbKetQua;

    public tinhtiennuoc() {
        setTitle("Tính tiền nước đơn giản");
        setSize(400, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Số đầu
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Số đầu (m³):"), gbc);

        gbc.gridx = 1;
        tfSoDau = new JTextField(15);
        add(tfSoDau, gbc);

        // Số cuối
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Số cuối (m³):"), gbc);

        gbc.gridx = 1;
        tfSoCuoi = new JTextField(15);
        add(tfSoCuoi, gbc);

        // Nút tính tiền
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        JButton btnTinh = new JButton("Tính tiền");
        add(btnTinh, gbc);

        // Label kết quả
        gbc.gridy = 3;
        lbKetQua = new JLabel("Thành tiền: ");
        lbKetQua.setFont(new Font("Arial", Font.BOLD, 14));
        add(lbKetQua, gbc);

        btnTinh.addActionListener(e -> tinhTienNuoc());
    }

    private void tinhTienNuoc() {
        try {
            int soDau = Integer.parseInt(tfSoDau.getText());
            int soCuoi = Integer.parseInt(tfSoCuoi.getText());

            if (soCuoi < soDau) {
                lbKetQua.setText("Lỗi: Số cuối phải lớn hơn số đầu.");
                return;
            }

            int tieuThu = soCuoi - soDau;
            int thanhTien = tieuThu * 10000;

            lbKetQua.setText("Thành tiền: " + thanhTien + " đ");
        } catch (NumberFormatException ex) {
            lbKetQua.setText("Lỗi: Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new tinhtiennuoc().setVisible(true);
        });
    }
}
