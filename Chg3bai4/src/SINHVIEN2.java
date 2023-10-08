import java.util.Scanner;

public class SINHVIEN2 {
	private String maSinhVien;
    private String hoTen;
    private String lop;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    public SINHVIEN2() {
    }

    public SINHVIEN2(String maSinhVien, String hoTen, String lop, double diemMon1, double diemMon2, double diemMon3) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public void nhapSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
        System.out.print("Nhập điểm môn 1: ");
        diemMon1 = scanner.nextDouble();
        System.out.print("Nhập điểm môn 2: ");
        diemMon2 = scanner.nextDouble();
        System.out.print("Nhập điểm môn 3: ");
        diemMon3 = scanner.nextDouble();
    }

    public void xuatSinhVien() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lớp: " + lop);
        System.out.println("Điểm môn 1: " + diemMon1);
        System.out.println("Điểm môn 2: " + diemMon2);
        System.out.println("Điểm môn 3: " + diemMon3);
        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
        System.out.println("Xếp loại: " + xepLoai());
    }

    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3) / 3.0;
    }

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
