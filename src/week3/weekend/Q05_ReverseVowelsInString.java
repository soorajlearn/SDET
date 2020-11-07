package week3.weekend;

import org.junit.Test;

public class Q05_ReverseVowelsInString {
	@Test
	public void test1() {
		String s1 = "winnerofcode";
		reverseVowels(s1);
	}

	private void reverseVowels(String s1) {
		String output = s1;
		StringBuilder vowelString = new StringBuilder();

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vowelString.append(s1.charAt(i));
			}
		}

		

		StringBuilder reverse = vowelString.reverse();
		System.out.println(reverse);
		System.out.println(reverse.length());
		int j = 0;

		for (int i = 0; i < s1.length(); i++) {
			
				if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
						|| s1.charAt(i) == 'u') {
					
					
					output.replace(output.charAt(i), reverse.charAt(j));
					j++;
				}
				
			
		}

		System.out.println(output);

	}

}
