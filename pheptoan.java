import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pheptoan {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Máy Tính Đơn Giản");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelA = new JLabel("Số thứ nhất (a):");
        labelA.setBounds(30, 30, 120, 25);
        frame.add(labelA);

        JTextField textA = new JTextField();
        textA.setBounds(160, 30, 200, 25);
        frame.add(textA);

        JLabel labelB = new JLabel("Số thứ hai (b):");
        labelB.setBounds(30, 70, 120, 25);
        frame.add(labelB);

        JTextField textB = new JTextField();
        textB.setBounds(160, 70, 200, 25);
        frame.add(textB);

        JButton btnCong = new JButton("Cộng (+)");
        btnCong.setBounds(30, 120, 100, 30);
        frame.add(btnCong);

        JButton btnTru = new JButton("Trừ (-)");
        btnTru.setBounds(140, 120, 100, 30);
        frame.add(btnTru);

        JButton btnNhan = new JButton("Nhân (×)");
        btnNhan.setBounds(250, 120, 100, 30);
        frame.add(btnNhan);

        JButton btnChia = new JButton("Chia (÷)");
        btnChia.setBounds(360, 120, 100, 30);
        frame.add(btnChia);

        JLabel resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(30, 180, 400, 25);
        frame.add(resultLabel);

        ActionListener tinhToan = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textA.getText());
                    double b = Double.parseDouble(textB.getText());
                    double ketQua = 0;

                    String phepToan = e.getActionCommand();
                    switch (phepToan) {
                        case "Cộng (+)":
                            ketQua = a + b;
                            break;
                        case "Trừ (-)":
                            ketQua = a - b;
                            break;
                        case "Nhân (×)":
                            ketQua = a * b;
                            break;
                        case "Chia (÷)":
                            if (b == 0) {
                                resultLabel.setText("Lỗi: Không thể chia cho 0!");
                                return;
                            }
                            ketQua = a / b;
                            break;
                    }

                    resultLabel.setText(String.format("Kết quả: %.2f", ketQua));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Lỗi: Vui lòng nhập số hợp lệ!");
                }
            }
        };

        btnCong.addActionListener(tinhToan);
        btnTru.addActionListener(tinhToan);
        btnNhan.addActionListener(tinhToan);
        btnChia.addActionListener(tinhToan);

        frame.setVisible(true);
    }
}

