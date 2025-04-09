
package phepchia;

import java.util.Scanner;

public class Phepchia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so bi chia (a): ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so chia (b): ");
        double b = scanner.nextDouble();

        if (b == 0) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        } else {
            double ketQua = a / b;
            System.out.println("Ket qua: " + ketQua);
        }

        scanner.close();
    }
}
