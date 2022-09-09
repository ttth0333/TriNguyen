package QuanLySinhVien;

import java.util.Scanner;

public class DemoQLSV {
    public static void main(String[] args) {
        SinhVien sinhvien = new SinhVien();
        sinhvien.nhap();
        sinhvien.inSV();
        System.out.print("Học sinh xếp loại: ");
        sinhvien.XepLoai();

    }
}
