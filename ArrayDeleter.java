import java.util.Scanner;

public class ArrayDeleter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng sau khi nhập: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.print("Nhập vị trí cần xóa: ");
        int n = scanner.nextInt();

        if (n < 1 || n > size) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }

        for (int i = n - 1; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Mảng sau khi xóa phần tử: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
