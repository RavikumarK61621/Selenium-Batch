package week1.day3;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//We learn Java basics as part of java sessions in java week1
			
		String text = "We learn Java basics as part of java sessions in java week1";
	
		String[] split = text.split(" ");
		
		int count = 0;
		for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) {
                    count++;  
                    break;  
                }
            }
        }
        
        // Print the number of duplicate words found
        System.out.println("Number of duplicate words: " + count);
        
    }
}
