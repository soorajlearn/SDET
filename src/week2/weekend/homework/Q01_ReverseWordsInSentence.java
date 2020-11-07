package week2.weekend.homework;
import org.junit.Test;

public class Q01_ReverseWordsInSentence {

	/*
	 * 1) Given a string, you need to reverse the order of characters in each
	 * word within a sentence while still preserving whitespace and initial word
	 * order.
	 * 
	 * Input: "I am doing great" Output: "I ma gniod taerg"
	 */

	/*
	 * Pseudo Code: 1. Split the string using spaces and store in a String array
	 * 2. For each string in String array do string reverse logic 3. Then append
	 * to a String builder using a space and trim the resultant space
	 */

	@Test
	public void test1() {

		String input = "My name is Sooraj";

		reverseWordsInSentence1(input);
		reverseWordsInSentence2(input);
	}

	private void reverseWordsInSentence1(String input) {

		String[] split = input.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for (String word : split) {
			StringBuilder sb1 = new StringBuilder();
			sb1.append(word);
			sb1.reverse();
			sb.append(sb1+" ");
		}
		
		System.out.println(sb.toString().trim());
	}

	
	private void reverseWordsInSentence2(String input){
		String[] split = input.split(" ");
		String output = "";
		
		for (String word : split) {
			
			char[] charArray = word.toCharArray();
			String wordRev = "";
			for (int i = charArray.length-1; i >=0 ; i--) {
				wordRev += charArray[i];
			}
			output += wordRev+ " ";
			
		}
		
		System.out.println(output.trim());
	}

}
