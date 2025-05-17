
package phepchia2so;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

public class phepchia2so extends JFrame {
    private JTextField textSo1, textSo2;
    private JLabel labelKetQua;

    public phepchia2so () {
        setTitle("Chương trình chia hai số");
        setSize(400, 250);
        setLocationRelativeTo(null); // Căn giữa màn hình
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding

        // Label và TextField Số thứ nhất
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Số thứ nhất:"), gbc);

        gbc.gridx = 1;
        textSo1 = new JTextField(15);
        add(textSo1, gbc);

        // Label và TextField Số thứ hai
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Số thứ hai:"), gbc);

        gbc.gridx = 1;
        textSo2 = new JTextField(15);
        add(textSo2, gbc);

        // Nút Chia
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton btnChia = new JButton("Chia");
        add(btnChia, gbc);

        // Label hiển thị kết quả
        gbc.gridy = 3;
        labelKetQua = new JLabel("Kết quả: ");
        labelKetQua.setFont(new Font("Arial", Font.BOLD, 14));
        add(labelKetQua, gbc);

        // Xử lý sự kiện nhấn nút "Chia"
        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thucHienPhepChia();
            }
        });
    }

    private void thucHienPhepChia() {
        try {
            double so1 = Double.parseDouble(textSo1.getText());
            double so2 = Double.parseDouble(textSo2.getText());

            if (so2 == 0) {
                labelKetQua.setText("Lỗi: Không thể chia cho 0!");
            } else {
                double ketQua = so1 / so2;
                labelKetQua.setText("Kết quả: " + ketQua);
            }
        } catch (NumberFormatException ex) {
            labelKetQua.setText("Lỗi: Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        // Chạy giao diện ở luồng riêng của Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new phepchia2so().setVisible(true);
            }
        });
    }
}
