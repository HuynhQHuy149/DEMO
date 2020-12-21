import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		/* Tính giá trị trung bình
		 * của 5 số thực và xuất ra màn hình
		 */
		//nhập liệu
		float soThuNhat, soThuHai, soThuBa, soThuTu, soThuNam, trungBinh;
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập giá trị số thứ 1:");
		soThuNhat=Float.parseFloat(input.nextLine());
		System.out.println("Nhập giá trị số thứ 2:");
		soThuHai=Float.parseFloat(input.nextLine());
		System.out.println("Nhập giá trị số thứ 3:");
		soThuBa=Float.parseFloat(input.nextLine());
		System.out.println("Nhập giá trị số thứ 4:");
		soThuTu=Float.parseFloat(input.nextLine());
		System.out.println("Nhập giá trị số thứ 5:");
		soThuNam=Float.parseFloat(input.nextLine());
				
		//xử lý
		trungBinh=(soThuNhat+ soThuHai+ soThuBa+ soThuTu+ soThuNam)/5;
		
		// in kết quả
		System.out.println("Giá trị trung bình là:"+trungBinh);
	}

}
