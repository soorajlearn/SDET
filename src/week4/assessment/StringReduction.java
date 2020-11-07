package week4.assessment;

import org.junit.Test;

public class StringReduction {

	@Test
	public void test1() {
		String s = "aaabbb";
		stringReduction(s);

	}

	public void stringReduction(String s) {

		String output = "";

		for (int i = 0; i < s.length(); i++) {

			if (!(output.contains(s.charAt(i) + ""))) {
				output += s.charAt(i);
			}

		}
		System.out.println(s.length() - output.length());

	}

}
