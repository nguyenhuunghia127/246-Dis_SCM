package SVNDEMO;
import java.util.Scanner;

public class PhepTru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();

        int ketQua = a - b;

        System.out.println("Kết quả phép trừ: " + a + " - " + b + " = " + ketQua);
        
        scanner.close();
    }
}

