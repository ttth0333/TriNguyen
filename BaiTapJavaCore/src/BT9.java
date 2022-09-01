import java.util.Scanner;

public class BT9    {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean same = true;
        System.out.println("Nhap so thứ 1: ");
        int n1 = sc.nextInt();
        System.out.println("Nhap so thu 2: ");
        int n2 = sc.nextInt();
        System.out.println("Có số giống nhau: " + soGiongNhau(n1, n2));

        }
    public static boolean soGiongNhau(int number1, int number2){

        if((number1 <10 || number1 >99) && (number2 <10 || number2 >99)) {
            System.out.println("chi nhap trong 10-99");
            return false;

        }
        else {
            int numberOneFirstDigit = number1 / 10;
            int numberTwoFirstDigit = number2 / 10;
            int numberOneLastDigit = number1 % 10;
            int numberTwoLastDigit = number2 % 10;

            if (numberOneFirstDigit == numberTwoFirstDigit ||
                    numberOneFirstDigit == numberTwoLastDigit  ||
                    numberOneLastDigit  == numberTwoFirstDigit ||
                    numberOneLastDigit  == numberTwoLastDigit) {
                return true;
            } else {
                return false;
            }
        }
    }
}
