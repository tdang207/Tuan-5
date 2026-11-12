package dungtichxe;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> dsXe = new ArrayList<>();

        System.out.print("Nhập số lượng xe: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("=== Nhập thông tin xe thứ " + (i + 1) + " ===");

            System.out.print("Nhập tên chủ xe: ");
            String chuXe = sc.nextLine();

            System.out.print("Nhập loại xe: ");
            String loaiXe = sc.nextLine();

            System.out.print("Nhập dung tích xe: ");
            int dungTich = sc.nextInt();

            System.out.print("Nhập trị giá xe: ");
            double triGiaXe = sc.nextDouble();
            sc.nextLine();

            dsXe.add(new Vehicle(chuXe, loaiXe, dungTich, triGiaXe));
        }

        System.out.println("===============================================");
        System.out.printf("%-20s %-10s %-10s %-15s %-15s\n",
                "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");

        for (Vehicle v : dsXe) {
            System.out.printf("%-20s %-10s %-10d %-15.2f %-15.2f\n",
                    v.getChuXe(), v.getLoaiXe(), v.getDungTich(), v.getTriGiaXe(), v.thue());
        }

        sc.close();
    }
}
