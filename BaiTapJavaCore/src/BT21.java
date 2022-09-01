import java.util.Scanner;

public class BT21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí kangaroo 1 x1= ");
        int x1 = sc.nextInt();
        System.out.println("Nhập vị trí kangaroo 2 x2=  ");
        int x2 = sc.nextInt();
        System.out.println("Nhập vận tốc kangaroo 1 v1= ");
        int v1 = sc.nextInt();
        System.out.println("Nhập vận tốc kangaroo 2 v2= ");
        int v2 = sc.nextInt();

        // nếu 1 đứng trước và chạy nhanh hơn thì 2 con không bao giờ gặp nhau
        if(x2>x1 && v2>v1) {
            System.out.println("NO, 2 con không gặp nhau");
        } else if (x2<x1 && v2<v1) {
            System.out.println("NO, 2 con không gặp nhau");
            // Cho kang nhảy từ từ đến khi không còn ở sau nữa
        }else{
            if (x1<x2) {
                while (x1<x2) {
                    x1 = x1 + v1;
                    x2 = x2 + v2;
                }
            } else {
                while (x2<x1) {
                    x1 = x1 + v1;
                    x2 = x2 + v1;
                }
            }
            // nếu không ở sau nữa check coi 2 kang có cùng chỗ hay vượt mặt nhau chưa
            if (x1 == x2) {
                System.out.println("YES, 2 con gặp nhau");
            } else {
                System.out.println("NO, 2 con không gặp nhau");
            }

        }

    }

}
