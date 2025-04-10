package PhepTinh;
import java.util.Scanner;

public class PhepTru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Test commit
        // nhap hai so tu ban phim
        System.out.print("Nhap so thu nhat: ");
        int so1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int so2 = scanner.nextInt();

        // thuc hien phep tru
        int ketQua = so1 - so2;

        // in ket qua
        System.out.println("Ket qua phep tru: " + so1 + " - " + so2 + " = " + ketQua);

        scanner.close();
    }
}


