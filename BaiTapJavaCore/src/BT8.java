import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự viết thường: ");
        String chuoi = sc.nextLine();


        char[] charArr = chuoi.toCharArray(); //tạo mảng => toCharArray để chuyển chuỗi thành mảng kiểu char
        boolean khoangTrang = true;
        for (int i=0; i< charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (khoangTrang) { //kiểm tra nếu khoảng trắng trước chữ cái
                    charArr[i] = Character.toUpperCase((charArr[i]));
                    khoangTrang = false;
                }
            }
            else {
                khoangTrang = true;
            }
        }

        chuoi = String.valueOf(charArr); // chuyển mảng char thành string
        System.out.println("Chuỗi sau khi in hoa: " + chuoi);
    }
}
