package a;

import java.util.Scanner;

public class phepnhan {
    
    // Phương thức thực hiện phép nhân
    public static void nhan(double a, double b) {
        double ketQua = a * b;
        System.out.println("Ket qua: " + ketQua);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap so thu nhat (a): ");
            double a = scanner.nextDouble();

            System.out.print("Nhap so thu hai (b): ");
            double b = scanner.nextDouble();

            // Gọi phương thức
            nhan(a, b);
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
