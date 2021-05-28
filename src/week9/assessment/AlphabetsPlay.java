package week9.assessment;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class AlphabetsPlay {
	@Test
	public void test1() {
		String s1 = "BdAcbCaDBbbb";
		// System.out.println(orderedAlpha1(s1));
		orderedAlpha1(s1);
	}

	/*
	 * public String orderedAlpha(String s1){
	 * 
	 * Set<Character> s = new LinkedHashSet<Character>(); String output = "";
	 * 
	 * if(s1.length()%2 !=0){ throw new RuntimeException("Invalid Input");
	 * }else{ for (int i = 0; i < s1.length(); i++) {
	 * System.out.println("I am here"); s.add(s1.charAt(i));
	 * s.add(Character.toLowerCase(s1.charAt(i)));
	 * s.add(Character.toUpperCase(s1.charAt(i))); } for (Character character :
	 * s) { output+= character; } } return output;
	 * 
	 * }
	 */

	public void orderedAlpha1(String s1) {
		if (s1.length() % 2 != 0) {
			throw new RuntimeException("Invalid Input");
		} else {

			int[] alpha = new int[256];
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s1.length(); i++) {
				alpha[s1.charAt(i)] += 1;
			}

			for (int i = 0; i < s1.length(); i++) {
				while (alpha[s1.charAt(i)] >= 1) {
					if (alpha[s1.charAt(i)] == alpha[s1.charAt(i) + 32]) {
						sb.append(s1.charAt(i));
						sb.append((char) (s1.charAt(i) + 32));
						alpha[s1.charAt(i)] -= 1;
						alpha[s1.charAt(i) + 32] -= 1;

					} else if (alpha[s1.charAt(i)] == alpha[s1.charAt(i) - 32]) {
						sb.append(s1.charAt(i));
						sb.append((char) (s1.charAt(i) - 32));
						alpha[s1.charAt(i)] -= 1;
						alpha[s1.charAt(i) - 32] -= 1;
					} else{
						System.out.println("Invalid Input");
						break;
					}
				}

			}

			System.out.println(sb.toString());

		}

	}

}
