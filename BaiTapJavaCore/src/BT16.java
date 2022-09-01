import java.util.Scanner;

public class BT16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm: ");
        year = sc.nextInt();

        //năm chia hết cho 4 mà không chia hết cho 100 là năm nhận
        // năm chia hết cho 400 là năm nhuận
        if (((year % 4 ==0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Đây là năm nhuận.");
        } else {
            System.out.println("Đây là năm không nhuận");
        }
    }
}
