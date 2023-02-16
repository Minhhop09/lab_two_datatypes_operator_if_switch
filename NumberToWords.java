import java.util.Scanner;

public class NumberToWords {

    private static final String[] ones = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
            "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", "mười tám", "mười chín"};

    private static final String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

    private static final String[] ones_special = {"", "mốt", "", "", "tư", "lăm"};
    
    public static String convertNumberToWords(int number) {
        if (number < 20) {
            return ones[number];
        }

        if (number < 100) {
            if (number % 10 == 1){
                if (number / 10 <= 1) {
                    return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
                }else{
                    return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones_special[number % 10];
                }
            }else if (number % 10 == 4) {
                if (number / 10 <= 1) {
                    return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
                }else{
                    return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones_special[number % 10];
                }
            }else if (number % 10 == 5) {
                if (number / 10 <= 0) {
                    return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
                }else{
                    return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones_special[number % 10];
                }
            }else{
                return tens[number / 10] + ((number % 10 != 0) ? " " : "") + ones[number % 10];
            }
        }

        if (number < 1000) {
            if (number % 100 < 10){
                return ones[number / 100] + " trăm linh " + convertNumberToWords(number % 100);
            }else{
                return ones[number / 100] + " trăm " + convertNumberToWords(number % 100);
            }
        }
        return "Số quá lớn";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count=0;
        do{
            if (count!=0){
                System.out.print("Vui lòng nhập lại số nguyên trong khoảng 100 đến 999: ");
                number = scanner.nextInt();
            }else{
                System.out.print("Nhập vào 1 số nguyên 3 chữ số: ");
                number = scanner.nextInt();
                count++;
            }
        }while (number < 100 || number >= 1000);

        String numberInWords = convertNumberToWords(number);
        System.out.println(number + " in words: " + numberInWords);
    }
}
