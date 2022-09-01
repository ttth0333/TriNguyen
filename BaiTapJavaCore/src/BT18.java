import java.util.Scanner;

public class BT18 {
// Tính lãi = gửi x lãi%/năm x360(năm)
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double tienLai, tienGui, laiSuat, ngay;
    System.out.println("nhập số tiền gửi: ");
    tienGui = sc.nextDouble();
    System.out.println("Nhập số tiền lãi mong muốn: ");
    tienLai = sc.nextDouble();
    System.out.println("Nhập lãi Suất năm: ");
    laiSuat = sc.nextDouble();

    ngay = ((100*360)*tienLai)/(tienGui*laiSuat);

    System.out.println("số ngày anh X cần đợi là: " + ngay+" ngày");
    double year = ngay/360;
    System.out.println("Tương đương với: "+year+" năm.");
}
}
