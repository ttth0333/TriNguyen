package QuanLySinhVien;

import java.util.Scanner;

public class SinhVien {
    private String tenSV;
    private String maSV;
    private int tuoi;
    private String gioiTinh;
    private float diemToan, diemLy, diemHoa;

    public SinhVien() {

    }

    public SinhVien(String maSV, String tenSV,int tuoi, String gioiTinh, float diemToan, float diemLy, float diemHoa) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }


    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSV = sc.nextLine();
        System.out.println("Nhập tên học sinh: ");
        tenSV = sc.nextLine();
        System.out.println("Nhập số tuổi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhập Điểm Toán");
        diemToan = sc.nextFloat();
        System.out.println("Nhập Điểm Lý: ");
        diemLy = sc.nextFloat();
        System.out.println("Nhập Điểm Hoá: ");
        diemHoa = sc.nextFloat();
    }

    public float TinhDiemTrungBinh()
    {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    public void inSV() {
        System.out.println("Học sinh "+tenSV+" --"+tuoi+" tuổi -- có điểm trung bình 3 môn Toán +" +
                " Lý + Hoá là "+ TinhDiemTrungBinh());
    }

    public void XepLoai() {
        if (TinhDiemTrungBinh() >= 9 && TinhDiemTrungBinh() <= 10) {
            System.out.println("Học sinh Giỏi");
        } else if (TinhDiemTrungBinh() >= 8 && TinhDiemTrungBinh() <= 9) {
            System.out.println("Học sinh Khá");
        } else if (TinhDiemTrungBinh() >= 7 && TinhDiemTrungBinh() <= 8) {
            System.out.println("Học sinh Tiên Tiến");
        } else if (TinhDiemTrungBinh() >= 5 && TinhDiemTrungBinh() <= 7) {
            System.out.println("Học sinh Trung Bình");
        } else {
            System.out.println("Học sinh Yếu");
        }
    }

}
