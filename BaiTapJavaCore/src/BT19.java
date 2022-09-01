import java.text.DecimalFormat;
import java.util.Scanner;

public class BT19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("\nChọn phường trình muốn giải: 1 - 2 ");
            System.out.println("1: Giải phương trình bậc 2");
            System.out.println("2: Giải phương trình bậc 1");
            System.out.println("else: Ngừng chương trình \n");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    //Phương trình có dạng ax2 + bx + c = 0
                    //xét delta = b^2 - 4ac
                    //del < 0 => vô nghiệm
                    // del = 0 => có 1 nghiệm kép x1=x2 = -b/2a
                    // del > 0; có 2 nghiệm pb x1,x2 = (-b +- Math.sqrt(delta)) /2a
                    System.out.println("Giải phương trình bậc 2: ");
                    double a, b, c, x1, x2, delta;
                    System.out.print("Nhập a (a # 0): ");
                    a = sc.nextDouble();
                    System.out.print("Nhập b: ");
                    b = sc.nextDouble();
                    System.out.print("Nhập c: ");
                    c = sc.nextDouble();
                    System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: " + a + "x^2 + " + b + "x + " + c + " = 0");
                    delta = Math.pow(b, 2) - 4 * a * c;
                    if (delta < 0) {
                        System.out.println("Phương trình vô nghiệm!");
                    } else if (delta == 0) {
                        x1 = -b / (2 * a);
                        System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
                    } else {
                        x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
                    }
                    break;
                case 2:
                    System.out.println("Giải phương trình bậc 1: ");
                    int aNumber, bNumber;
                    double nghiem;
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
                    System.out.println("Nhập vào số a: ");
                    aNumber = sc.nextInt();
                    System.out.println("Nhập vào số b: ");
                    bNumber = sc.nextInt();
                    System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
                    if (aNumber == 0) {
                        if (bNumber == 0) {
                            System.out.println("Phương trình này có vô số nghiệm.");
                        } else {
                            System.out.println("Phương trình vô nghiệm.");
                        }
                    } else {
                        nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
                        System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
                    }
                    break;
                default:
                        System.out.println("Ngừng, không giải!");
                        cont = false;
                        break;
                    }
        }
           while (cont) ;
    }
}
