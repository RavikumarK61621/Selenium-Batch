package week1.day2;

public class LastWordPrintWithLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentance = "A word is a maximal substring consisting of non-space characters only";
			
		String[] words = sentance.split(" ");
		String lastWord = words[words.length-1];

		System.out.println("The last word is "+ lastWord +" with length " + lastWord.length());
		
//		System.out.println(words[words.length-1]);
//		System.out.println(words[words.length-1].length());
		
		
		
	}

}
