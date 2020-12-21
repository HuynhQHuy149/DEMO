import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
	/* Chương trình quy đổi USD sang VND 
	 * 1USD=23500VND	
	 */
		//Nhập liệu
		long soUSD, soVND;
		Scanner input=new Scanner(System.in );
		System.out.println("Xin nhập số USD cần đổi:");
		soUSD= Long.parseLong(input.nextLine());
		
		//Xử lý
		soVND= soUSD*23500;
		//In kết quả
		System.out.println("Số tiền quy đổi là:"+soVND);
		
	}

}
