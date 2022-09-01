import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BT13 {
    public static void main(String[] args) {
        int n;
        double average, total = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = sc.nextInt();
        }

        // Hiển thị mảng vừa nhập
//        System.out.println("\nMảng ban đầu: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + "\t");
//        }

        //Tính Trung bình cộng của mảng
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        show(array);

        average = (double) (total / n);
        System.out.println("Giá trị trung bình của mảng là:: " + average);

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);

        int amMin = array[0];
        int amMax = array[0];
        int duongMin = array[0];
        int duongMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                if (array[i] < amMin) {
                    amMin = array[i];
                }
                if (array[i] > amMax) {
                    amMax = array[i];
                }
            }
            if (array[i] > 0) {
                if (array[i] < duongMin) {
                    duongMin = array[i];
                }
                if (array[i] > duongMax) {
                    duongMax = array[i];
                }
            }
        }
        System.out.println("Giá trị âm lớn nhỏ là: " + amMin);
        System.out.println("Giá trị âm lớn nhất là: " + amMax);
        System.out.println("Giá trị dương nhỏ nhất là: " + duongMin);
        System.out.println("Giá trị dương lớn nhất là: " + duongMax);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Các số chẵn là: " + array[i]);
            }
            if (array[i] % 2 != 0) {
                System.out.println("Các số lẻ là: " + array[i]);
            }
        }
        // Thêm + xoá phần tử mảng
        //Chuyển mảng thành ArrayList
        List<Integer> intList = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println("Các phần tử trong arrayList là: " + intList);
        //thêm 1 phần tử
        intList.add(7);
        intList.add(44);
        System.out.println("Các phần tử trong arrayList sau khi thêm là: " + intList);
        //xoá 1 phần tử
        intList.remove(4);
        System.out.println("Các phần tử trong arrayList sau khi xoá là: " + intList);
    }

    //Hàm show mảng
    public static void show(int array[]) {
        System.out.print("Các phần tử trong mảng: ");
        for (int i =0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.print("\n");
    }
}

