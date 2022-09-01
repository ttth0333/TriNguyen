import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        int count, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số bất kì: ");
        int n = sc.nextInt();
        for (int num=1; num<=n ; num++)
        {
            count=0;
            for (int i=2; i<=num/2; i++)
            {
                if (num%i ==0)
                {
                    count++;
                    break;
                }
            }
            if ( count==0 && num!=1)
            {
                sum = sum + num;
            }
        }
        System.out.println("Tổng các số nguyên tố từ 1 tới "+n+ " là: " + sum);
    }
}