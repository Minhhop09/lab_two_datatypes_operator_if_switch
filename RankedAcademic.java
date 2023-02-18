import java.util.Scanner;

public class RankedAcademic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();

        if (diemTrungBinh < 5.0) {
            System.out.println("Xếp loại kém");
        } else if (diemTrungBinh >= 5.0 && diemTrungBinh < 7.0) {
            System.out.println("Xếp loại trung bình");
        } else if (diemTrungBinh >= 7.0 && diemTrungBinh < 8.0) {
            System.out.println("Xếp loại khá");
        } else {
            System.out.println("Xếp loại giỏi");
        }
    }
}
