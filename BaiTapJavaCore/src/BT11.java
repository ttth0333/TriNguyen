import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n trong log2(n): ");
        int n = sc.nextInt();
        int result = (int)(Math.log(n) / Math.log(2));
        System.out.println("Log2("+n+") = "+ result);
        int k = (int)(result -1);
        System.out.println("Số tự nhiên lớn nhất nhỏ hơn " +result+" là: " + k);
    }
}