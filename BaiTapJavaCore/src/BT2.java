import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 or 2");
        System.out.println("1: convert decimal to binary");
        System.out.println("2: convert binary to decimal");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Convert decimal to binary");
                System.out.println("input a decimal: ");
                int decimal = sc.nextInt();
                String binary = Integer.toBinaryString(decimal);
                System.out.println(decimal + " in decimal = " + binary+" in binary");
                break;
            case 2:
                System.out.println("Convert binary to decimal");
                System.out.println("input a binary: ");
                binary = sc.nextLine();
                System.out.println("Giá trị số thập phân là: "+Integer.parseInt(binary,2));
//                binary = String.valueOf(Integer.parseInt(binary, 2));
//                System.out.println(binary + " in binary = " + decimal + "in decimal");
            default:
                System.out.println("Incorect input");


        }
//        System.out.println("input a decimal: ");
//        int decimal = sc.nextInt();
//
//        String binary = Integer.toBinaryString(decimal);
//        System.out.println(decimal + " in decimal = " + binary+" in binary");
    }
}
