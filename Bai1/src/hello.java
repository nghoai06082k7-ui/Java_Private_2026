import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double chieudai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double chieurong = sc.nextDouble();
        System.out.println("Chu vi: ");
        double chuvi = 2 * ( chieudai + chieurong);
        System.out.println(chuvi);
        System.out.println("Dien tich: ");
        double dientich = chieudai * chieurong;
        System.out.println(dientich);
    }
}