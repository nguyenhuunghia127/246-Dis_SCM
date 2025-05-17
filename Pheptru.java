package pheptru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pheptru extends JFrame {

    private JTextField field1, field2;
    private JLabel resultLabel;

    public Pheptru () {
        setTitle("Phép Trừ Hai Số");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        // Giao diện
        initUI();
    }

    private void initUI() {
        // Tạo panel chính
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Thành phần
        JLabel label1 = new JLabel("Số thứ nhất:");
        field1 = new JTextField();

        JLabel label2 = new JLabel("Số thứ hai:");
        field2 = new JTextField();

        JButton subtractButton = new JButton("Thực hiện trừ");
        resultLabel = new JLabel("Kết quả: ");

        // Gắn sự kiện cho nút
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performSubtraction();
            }
        });

        // Thêm vào panel
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(new JLabel()); // Dòng trống
        panel.add(subtractButton);
        panel.add(resultLabel);
        panel.add(new JLabel()); // Dòng trống

        // Thêm panel vào frame
        add(panel);
    }

    private void performSubtraction() {
        try {
            double num1 = Double.parseDouble(field1.getText().trim());
            double num2 = Double.parseDouble(field2.getText().trim());
            double result = num1 - num2;
            resultLabel.setText("Kết quả: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Pheptru().setVisible(true);
        });
    }
}
