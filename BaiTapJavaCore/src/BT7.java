import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so tu nhien: ");
        int n = sc.nextInt();

        System.out.println("Các ước số của " +n+ " là: ");
        for (int i= 1; i<=n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
    }
}
