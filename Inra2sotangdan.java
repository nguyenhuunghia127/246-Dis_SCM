
package inra2sotangdan;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Inra2sotangdan extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnSapXep;
    private JLabel lblKetQua;

    public Inra2sotangdan() {
        setTitle("Sắp xếp 2 số tăng dần");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo các thành phần giao diện
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        btnSapXep = new JButton("Sắp xếp");
        lblKetQua = new JLabel("Kết quả: ");

        // Panel nhập số 1
        JPanel panelSo1 = new JPanel();
        panelSo1.add(lblSo1);
        panelSo1.add(txtSo1);

        // Panel nhập số 2
        JPanel panelSo2 = new JPanel();
        panelSo2.add(lblSo2);
        panelSo2.add(txtSo2);

        // Panel nút và kết quả
        JPanel panelKetQua = new JPanel(new GridLayout(2,1));
        panelKetQua.add(btnSapXep);
        panelKetQua.add(lblKetQua);

        // Sắp xếp layout chính
        setLayout(new GridLayout(4,1));
        add(panelSo1);
        add(panelSo2);
        add(panelKetQua);

        // Sự kiện nút sắp xếp
        btnSapXep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sapXepTangDan();
            }
        });
    }

    private void sapXepTangDan() {
        try {
            int so1 = Integer.parseInt(txtSo1.getText());
            int so2 = Integer.parseInt(txtSo2.getText());

            int min = Math.min(so1, so2);
            int max = Math.max(so1, so2);

            lblKetQua.setText("Thứ tự tăng dần: " + min + " , " + max);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Inra2sotangdan().setVisible(true);
        });
    }
}
