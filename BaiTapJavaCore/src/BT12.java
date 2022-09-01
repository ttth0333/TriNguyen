import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Nhập chiều dài cạnh: ");
        n = sc.nextInt();
        if (1 <=n && n<= 9) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println("");
            }
        } else {
            System.out.println("Nhap 1 toi 9 thoi");
        }
    }
}
