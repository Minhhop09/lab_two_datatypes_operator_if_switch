import java.util.Scanner;

public class SymmetricMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số đỉnh của đồ thị: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Nhập các trọng số của cạnh nối giữa các đỉnh:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Trọng số của cạnh nối giữa đỉnh %d và đỉnh %d: ", i + 1, j + 1);
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận đối xứng:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
