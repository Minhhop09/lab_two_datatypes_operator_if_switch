import java.util.Scanner;
public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hiển thị menu
        System.out.println("Chọn một chức năng:");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc hai");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Thoát");

        // Lặp lại việc hiển thị menu và yêu cầu người dùng chọn chức năng cho đến khi người dùng chọn chức năng 4 để thoát
        int choice;
        do {
            System.out.print("Chọn chức năng (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Gọi chức năng giải phương trình bậc nhất
                    solveLinearEquation();
                    break;
                case 2:
                    // Gọi chức năng giải phương trình bậc hai
                    solveQuadraticEquation();
                    break;
                case 3:
                    // Gọi chức năng tính tiền điện
                    calculateElectricityBill();
                    break;
                case 4:
                    // Thoát khỏi chương trình
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                default:
                    // Hiển thị thông báo lỗi khi người dùng chọn chức năng không hợp lệ
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);
    }

    // Chức năng giải phương trình bậc nhất
    public static void solveLinearEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình la x = " + x);
        }
    }

    // Chức năng giải phương trình bậc hai
    public static void solveQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập hệ số a: ");
        double coefficient_a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double coefficient_b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double coefficient_c = scanner.nextDouble();
        
        double discriminant = coefficient_b * coefficient_b - 4 * coefficient_a * coefficient_c;
        double result1, result2;
        
        if (discriminant > 0) {
            result1 = (-coefficient_b + Math.sqrt(discriminant)) / (2 * coefficient_a);
            result2 = (-coefficient_b - Math.sqrt(discriminant)) / (2 * coefficient_a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: " + result1 + " và " + result2);
        } else if (discriminant == 0) {
            result1 = -coefficient_b / (2 * coefficient_a);
            System.out.println("Phương trình có nghiệm kép: " + result1);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }

    public static void calculateElectricityBill(){
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
