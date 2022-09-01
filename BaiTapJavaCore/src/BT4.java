import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số tự nhiên: ");
        int n = sc.nextInt();

        int tong = 0;
        for (int i=0; i <= n; i++) {
            tong = tong + i;
        }

        System.out.println("Tổng các số: " + tong);
    }
}
