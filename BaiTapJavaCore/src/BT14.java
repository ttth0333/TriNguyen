import java.util.Arrays;
import java.util.Scanner;

public class BT14 {
    public static int removeduplicates(int array[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }

        temp[j++] = array[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            array[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
             a = sc.nextInt();
        } while (a < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[a];
        int length = array.length;
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < a; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

       //  Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + "\t");
        }
        //xếp lại array
        Arrays.sort(array);

        length  = removeduplicates(array, length);
        System.out.println("\nMảng sau khi chỉnh: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
