import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        double electricityUsed = scanner.nextDouble();

        double electricityCost;
        if (electricityUsed <= 50) {
            electricityCost = electricityUsed * 1000;
        } else {
            electricityCost = 50 * 1000 + (electricityUsed - 50) * 1200;
        }

        System.out.println("Số tiền điện cần thanh toán là: " + electricityCost + " VNĐ");
    }
}
