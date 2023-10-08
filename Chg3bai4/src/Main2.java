import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Nhập mã sinh viên: ");
	        String maSinhVien = scanner.nextLine();
	        System.out.print("Nhập họ tên: ");
	        String hoTen = scanner.nextLine();
	        System.out.print("Nhập lớp: ");
	        String lop = scanner.nextLine();
	        System.out.print("Nhập điểm môn 1: ");
	        double diemMon1 = scanner.nextDouble();
	        System.out.print("Nhập điểm môn 2: ");
	        double diemMon2 = scanner.nextDouble();
	        System.out.print("Nhập điểm môn 3: ");
	        double diemMon3 = scanner.nextDouble();
	        
	        SINHVIEN sinhVien = new SINHVIEN(maSinhVien, hoTen, lop, diemMon1, diemMon2, diemMon3);
	        
	        System.out.println("Thông tin sinh viên:");
	       // sinhVien.xuatSinhVien();

	}

}

