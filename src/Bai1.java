import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		/* Tính tiền lương nhân viên
		 *lương 100.000/ngày
		 *
		 */
		//Nhập liệu
		int luong, ngay;
		Scanner input= new Scanner(System.in);
		System.out.println("Nhập số ngày làm:");
		ngay= Integer.parseInt(input.nextLine());
		
		//xử lý
		luong=ngay*100000;
		
		// in
		System.out.println("Lương nhân viên trong là:"+luong);
	}

}
