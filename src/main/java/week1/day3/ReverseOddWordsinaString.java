package week1.day3;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am a software tester";
	  //Expected output: “I ma a erawtfos tester”
		
		
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println("word" + (i+1) + ": " + split[i]);
			
			
			
		}
		
	}

}
