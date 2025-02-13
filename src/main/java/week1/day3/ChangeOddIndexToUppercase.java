package week1.day3;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cHaNgEmE
		String test = "changeme";
		
		int length = test.length();
		System.out.println(length);
		
		char[] charArray = test.toCharArray();
		
		for (int i = test.length() - 1; i >= 0; i--) {
			
			if(i%2 != 0) {
				
				charArray[i] = Character.toUpperCase(charArray[i]);
                System.out.println("Odd Index: " + i + ", Modified Character: " + charArray[i]);
			}
			
				
		}
		
		String result = new String(charArray);
        System.out.println("Modified String: " + result);
	}

}
