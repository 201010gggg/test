import java.util.Scanner;
/*Hello */
public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
		 SINHVIEN sinhVien1 = new SINHVIEN("SV001", "Nguyen Van A", "A01", 8.5, 7.0, 9.0);
	        SINHVIEN sinhVien2 = new SINHVIEN("SV002", "Tran Thi B", "B02", 7.0, 6.5, 6.0);

	        System.out.println("Sinh viên 1:");
	        sinhVien1.xuat();
	        System.out.println("Điểm trung bình: " + sinhVien1.tinhDiemTrungBinh());
	        System.out.println("Xếp loại: " + sinhVien1.xepLoai());

	        System.out.println("Sinh viên 2:");
	        sinhVien2.xuat();
	        System.out.println("Điểm trung bình: " + sinhVien2.tinhDiemTrungBinh());
	        System.out.println("Xếp loại: " + sinhVien2.xepLoai());

	}

}
