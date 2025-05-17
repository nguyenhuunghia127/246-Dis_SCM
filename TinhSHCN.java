package tinhshcn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TinhSHCN extends JFrame {

    private JTextField widthField, heightField;
    private JLabel resultLabel;

    public TinhSHCN() {
        setTitle("Tính Diện Tích Hình Chữ Nhật");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        // Khởi tạo giao diện
        initUI();
    }

    private void initUI() {
        // Panel chính với layout lưới
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Thành phần giao diện
        JLabel widthLabel = new JLabel("Chiều rộng:");
        widthField = new JTextField();

        JLabel heightLabel = new JLabel("Chiều dài:");
        heightField = new JTextField();

        JButton calcButton = new JButton("Tính diện tích");
        resultLabel = new JLabel("Diện tích: ");

        // Xử lý sự kiện khi bấm nút
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });

        // Thêm thành phần vào panel
        panel.add(widthLabel);
        panel.add(widthField);
        panel.add(heightLabel);
        panel.add(heightField);
        panel.add(new JLabel()); // Trống
        panel.add(calcButton);
        panel.add(resultLabel);
        panel.add(new JLabel()); // Trống

        // Gắn panel vào cửa sổ chính
        add(panel);
    }

    private void calculateArea() {
        try {
            double width = Double.parseDouble(widthField.getText().trim());
            double height = Double.parseDouble(heightField.getText().trim());
            if (width < 0 || height < 0) {
                throw new NumberFormatException();
            }
            double area = width * height;
            resultLabel.setText("Diện tích: " + area);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số dương hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TinhSHCN().setVisible(true);
        });
    }
}
