package Phepcong1;

import java.util.Scanner;

public class Phepcong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (a): ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số thứ hai (b): ");
        double b = scanner.nextDouble();

        //output ketqua
        double ketQua = a + b;
        System.out.println("Kết quả: " + ketQua);

        scanner.close();
    }
}
