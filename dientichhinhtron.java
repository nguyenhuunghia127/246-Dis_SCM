
package dientichhinhtron;
   import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dientichhinhtron extends JFrame {
    private JTextField txtBanKinh;
    private JButton btnTinh;
    private JLabel lblKetQua;

    public dientichhinhtron() {
        setTitle("Tính diện tích hình tròn");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Hiển thị ở giữa màn hình

        // Tạo các thành phần giao diện
        JLabel lblNhap = new JLabel("Nhập bán kính:");
        txtBanKinh = new JTextField(10);
        btnTinh = new JButton("Tính diện tích");
        lblKetQua = new JLabel("Kết quả: ");

        // Panel chứa nhập bán kính
        JPanel panelNhap = new JPanel();
        panelNhap.add(lblNhap);
        panelNhap.add(txtBanKinh);

        // Panel chứa nút tính và kết quả
        JPanel panelKetQua = new JPanel();
        panelKetQua.setLayout(new GridLayout(2, 1));
        panelKetQua.add(btnTinh);
        panelKetQua.add(lblKetQua);

        // Thêm panel vào frame
        setLayout(new BorderLayout());
        add(panelNhap, BorderLayout.NORTH);
        add(panelKetQua, BorderLayout.CENTER);

        // Xử lý sự kiện nút tính
        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tinhDienTich();
            }
        });
    }

    private void tinhDienTich() {
        try {
            double banKinh = Double.parseDouble(txtBanKinh.getText());

            if (banKinh < 0) {
                lblKetQua.setText("Lỗi: Bán kính phải là số dương!");
                return;
            }

            double dienTich = Math.PI * banKinh * banKinh;
            lblKetQua.setText(String.format("Diện tích hình tròn: %.4f", dienTich));
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Lỗi: Vui lòng nhập số hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new dientichhinhtron().setVisible(true);
        });
    }
}
