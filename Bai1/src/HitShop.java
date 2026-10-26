import java.util.Scanner;

public class HitShop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ten mat hang: ");
        String TenMatHang = sc.nextLine();

        System.out.println("Don gia: ");
        double DonGia = sc.nextDouble();

        System.out.println("So luong: ");
        int SoLuong = sc.nextInt();

        double ThanhTien = DonGia * SoLuong;

        System.out.println("Tên mặt hàng: " + TenMatHang);
        System.out.println("Đơn giá: " + DonGia);
        System.out.println("Số lượng: " + SoLuong);
        System.out.println("Thành tiền " + ThanhTien);
        sc.close();
    }
}