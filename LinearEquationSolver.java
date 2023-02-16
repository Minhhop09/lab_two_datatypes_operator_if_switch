import java.util.Scanner;

public class LinearEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double coefficient_a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double coefficient_b = scanner.nextDouble();

        if (coefficient_a == 0) {
            if (coefficient_b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double result = -coefficient_b / coefficient_a;
            System.out.println("Nghiệm của phương trình la x = " + result);
        }
    }
}


