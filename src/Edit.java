
public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= String.format("%-10s", "CyberLearn.");
		System.out.println(text);
		
		String text1 =String.format("%-30s", "CyberLearn.");
		System.out.println(text1);
		
		String text2= String.format("%-30s", "Cyberlear").replace(" ", "_")+"Dev";
		System.out.println(text2);
		
		String text3=String.format("%-30s", "CyberLearn").replace(" ", ".")+"Dev";
		System.out.println(text3);
	}

}
