import java.util.Scanner;

public class BT20 {
    public static void main(String[] args) {
        int n,ptChan,ptLe;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n =  sc.nextInt();
        } while (n<=0);
        int[] arr = new int[n];
        int[] ch = new int[n]; //phân tử chẵn
        int[] le = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i=0; i<n; i++) {
            System.out.println("Nhập phần tử thứ "+ i+ " : ");
            arr[i]  = sc.nextInt();
        }

        ptLe= ptChan = 0;

        for (int i =0; i < n; i++) {
            //nếu phần tử tại vị trí i chia hết cho 2 thì gán phần tử đó tại vị trí ptChan của mảng chẵn
            // ngược lại thì gán cho ptLe của mảng lẽ
            if (arr[i] % 2 ==0 ) {
                ch[ptChan] = arr[i];
                ptChan++;
            } else {
                le[ptLe] = arr[i];
                ptLe++;
            }
        }

        System.out.println("Phần tử của mảng chẵn là:  ");
        for (int i=0; i< ptChan; i++) {
            System.out.println(ch[i]);
        }

        System.out.println("Phần tử của mảng lẽ là:  ");
        for (int i=0; i< ptLe; i++) {
            System.out.println(le[i]);
        }
    }
}
