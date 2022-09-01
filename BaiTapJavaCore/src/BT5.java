import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        double xA, yA;
        double xB, yB;
        double lengthAB;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap xA: ");
        xA = sc.nextDouble();
        System.out.println("Nhap yA: ");
        yA = sc.nextDouble();
        System.out.println("A("+xA+", "+yA+")");

        System.out.println("Nhap xB: ");
        xB = sc.nextDouble();
        System.out.println("Nhap yB: ");
        yB = sc.nextDouble();
        System.out.println("B("+xB+", "+yB+")");

        lengthAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
        System.out.println("Do dai AB = " + lengthAB);


    }
}
