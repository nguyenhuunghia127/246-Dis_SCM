/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaiptbn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GiaiPTBN extends JFrame {

    private JTextField aField, bField;
    private JLabel resultLabel;

    public GiaiPTBN() {
        setTitle("Giải phương trình bậc nhất ax + b = 0");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa cửa sổ

        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel aLabel = new JLabel("Hệ số a:");
        aField = new JTextField();

        JLabel bLabel = new JLabel("Hệ số b:");
        bField = new JTextField();

        JButton solveButton = new JButton("Giải phương trình");
        resultLabel = new JLabel("Kết quả: ");

        solveButton.addActionListener(e -> solveEquation());

        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(new JLabel());
        panel.add(solveButton);
        panel.add(resultLabel);
        panel.add(new JLabel());

        add(panel);
    }

    private void solveEquation() {
        try {
            double a = Double.parseDouble(aField.getText().trim());
            double b = Double.parseDouble(bField.getText().trim());

            if (a == 0) {
                if (b == 0) {
                    resultLabel.setText("Kết quả: Vô số nghiệm");
                } else {
                    resultLabel.setText("Kết quả: Vô nghiệm");
                }
            } else {
                double x = -b / a;
                resultLabel.setText("Nghiệm x = " + x);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GiaiPTBN().setVisible(true));
    }
}
