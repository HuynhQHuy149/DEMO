import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
// tính chu vi diện tích hình tròn
		//nhập liệu
		float chieuDai, chieuRong, dienTich, chuVi;
		Scanner input= new Scanner(System.in);
		System.out.println("Xin nhập chiều dài của hình chữ  nhật:");
		chieuDai= Float.parseFloat(input.nextLine());
		System.out.println("Xin nhập chiều rộng của hình chữ nhât:");
		chieuRong= Float.parseFloat(input.nextLine());
		
		//xử lý
		chuVi=(chieuDai+chieuRong)*2;
		dienTich=chieuDai*chieuRong;
		//in kết quả
		System.out.println("Chu vi của hình chữ nhật là:"+chuVi);
		System.out.println("Diện tích của hình chữ là:"+dienTich);
	}

}
