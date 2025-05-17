
package daonguoc2so;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Daonguoc2so extends JFrame {
    private JTextField txtSo1, txtSo2;
    private JButton btnDaoNguoc;
    private JLabel lblKetQua;

    public Daonguoc2so() {
        setTitle("Đảo ngược 2 số");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Các thành phần giao diện
        JLabel lblSo1 = new JLabel("Số thứ nhất:");
        JLabel lblSo2 = new JLabel("Số thứ hai:");
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        btnDaoNguoc = new JButton("Đảo ngược");
        lblKetQua = new JLabel("Kết quả: ");

        // Panel nhập số 1
        JPanel panelSo1 = new JPanel();
        panelSo1.add(lblSo1);
        panelSo1.add(txtSo1);

        // Panel nhập số 2
        JPanel panelSo2 = new JPanel();
        panelSo2.add(lblSo2);
        panelSo2.add(txtSo2);

        // Panel chứa nút và kết quả
        JPanel panelKetQua = new JPanel(new GridLayout(2, 1));
        panelKetQua.add(btnDaoNguoc);
        panelKetQua.add(lblKetQua);

        // Sắp xếp các panel trong frame
        setLayout(new GridLayout(4, 1));
        add(panelSo1);
        add(panelSo2);
        add(panelKetQua);

        // Xử lý sự kiện nút đảo ngược
        btnDaoNguoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                daoNguocHaiSo();
            }
        });
    }

    private void daoNguocHaiSo() {
        try {
            int so1 = Integer.parseInt(txtSo1.getText());
            int so2 = Integer.parseInt(txtSo2.getText());

            // Đảo ngược
            int temp = so1;
            so1 = so2;
            so2 = temp;

            lblKetQua.setText("Sau đảo ngược: Số 1 = " + so1 + ", Số 2 = " + so2);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Daonguoc2so().setVisible(true);
        });
    }
}
