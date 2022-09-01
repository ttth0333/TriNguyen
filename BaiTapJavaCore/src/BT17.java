import java.util.Random;
import java.util.Scanner;

public class BT17 {
    public static void main(String[] args) {
        int answer, guess;
        final int max = 1000;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        answer= rand.nextInt(max) +1;

        System.out.print("Đoán 1 số từ 1 tới 1000: ");
        guess = sc.nextInt();
        if(guess > 1 && guess < 1000) {
            if (guess == answer) {
                System.out.println("Good job, số bí mật là: " + answer);
            }
            if (guess < answer) {
                System.out.println("Sai rồi! Số bạn đang nhập nhỏ hơn số bí mật. Số bí mật là: " + answer);
            }
            if (guess > answer) {
                System.out.println("Sai rồi! Số bạn đang nhập lớn hơn số bí mật.Số bí mật là: " + answer);
            }
        }
    }
}
