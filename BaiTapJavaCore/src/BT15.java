import java.util.Scanner;

public class BT15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi kí tự: ");
        String str = sc.nextLine();

        //In độ dài của chuỗi
        System.out.println("Chuỗi string '"+str+ "' vừa nhập có độ dài: " + str.length());

        //in kí tự char tại vị trí nhất định
        System.out.print("in ký tự ở index: ");
        for (int i= sc.nextInt(); i<str.length(); ) {
            System.out.println("Char at "+i+ " is: " + str.charAt(i));
            break;
        }
        //check coi có chứa chuỗi phụ abcdef
        System.out.println("Chuỗi trên có chứa chuỗi phụ abcdef hay không: ");
        System.out.println(str.matches("(.*)abcdef(.*)"));

    }

}
