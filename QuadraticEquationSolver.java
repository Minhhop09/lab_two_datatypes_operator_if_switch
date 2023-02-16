import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
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
}
