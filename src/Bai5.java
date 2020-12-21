import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		/* Nhập 1 số có 2 chữ số.
		 * Tính tổng 2 ký số của số vừa nhập 
		 */
		//Nhập liệu
		int soNhap, soNhat, soHai, tong;
		Scanner input=new Scanner(System.in);
		System.out.println("Mời nhập số cần tính:");
		soNhap= Integer.parseInt(input.nextLine());
		
		//Xử lý
		soNhat=soNhap/10;
		soHai=soNhap%10;
		tong=soNhat+soHai;
		//In
		System.out.println("Tổng số của 2 ký số là:"+ tong);
	}

}
