import java.util.Scanner;

public class StudyCase {

	public static void main(String[] args) {
		/* Viết chương trình cho người dùng nhập 
		 * chiều dài sân, bán kính cây phát triển đầy đủ, không gian cần thiết giữa các cây phát triển đủ
		 * để tính số cây cần thiết và không gian cây trưởng thành cần.
		 * Giả sử số trên đều là số nguyên.
		 */
		//Nhập dữ liệu
		Scanner input=new Scanner(System.in);
		int chieuDai, r, khoangCach, soCay, khongGian;
		System.out.println("Nhập chiều dài sân: ");
		chieuDai= Integer.parseInt(input.nextLine());
		System.out.println("Nhập bán kính của cây phát triển: ");
		r=Integer.parseInt(input.nextLine());
		System.out.println("Nhập khoảng cách giữa 2 cây trưởng thành đầy đủ: ");
		khoangCach=Integer.parseInt(input.nextLine());
				
		//Xử lý
		khongGian=(2*r)*chieuDai;
		soCay=chieuDai/ ((2*r)+khoangCach);
		
		//In kết quả
		System.out.println("Không gian cần thiết cho cây trưởng thành là: " + khongGian);
		System.out.println("Số cây trồng được là: "+soCay);
		
	}

}
