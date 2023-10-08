import java.util.Scanner;
public class SINHVIEN {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    // Hàm thiết lập không tham số
    public SINHVIEN () {
        this.maSinhVien = "";
        this.hoTen = "";
        this.lop = "";
        this.diemMon1 = 0.0;
        this.diemMon2 = 0.0;
        this.diemMon3 = 0.0;
    }

    // Hàm thiết lập có tham số
    public SINHVIEN (String maSinhVien, String hoTen, String lop, double diemMon1, double diemMon2, double diemMon3) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    /*// Phương thức nhập thông tin sinh viên
    public void nhap(String maSinhVien, String hoTen, String lop, double diemMon1, double diemMon2, double diemMon3) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }*/

    // Phương thức xuất thông tin sinh viên
    public void xuat() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm môn 1: " + diemMon1);
        System.out.println("Điểm môn 2: " + diemMon2);
        System.out.println("Điểm môn 3: " + diemMon3);
    }

    // Phương thức tính điểm trung bình
    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3) / 3.0;
    }

    // Phương thức xếp loại
    public String xepLoai() {
        double diemTrungBinh = tinhDiemTrungBinh();
        if (diemTrungBinh >= 8.0) {
            return "Giỏi";
        } else if (diemTrungBinh >= 6.5) {
            return "Khá";
        } else if (diemTrungBinh >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}


