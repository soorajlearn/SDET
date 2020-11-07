package week4.assessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class FUnWithVowels {

	@Test
	public void test1() {
		String s = "aeiaaeioooaauuaeiu";
		funWithVowels(s);
	}

	@Test
	public void test2() {
		String s = "aeiaaioooaauuaeiu";
		funWithVowels(s);
	}

	@Test
	public void test3() {
		String s = "aieo";
		funWithVowels(s);
	}

	@Test
	public void test() {
		String s = "uioieeeaouiiuaeeuuiuuauuauaeaeuauaeaaiuoiouaeuiuuoooaeeaioeieoeooaeuooae";
		//"aaee"
		funWithVowels(s);
	}

	public void funWithVowels(String s) {

		String output = "";

		for (int i = 0; i < s.length(); i++) {

			if ((int) s.charAt(i) == 97 && output.length() == 0) {
				output += s.charAt(i);
			} else if (output.length() > 0) {

				if (((int) s.charAt(i) >= (int) s.charAt(i - 1))
						&& ((int) s.charAt(i) >= (int) output.charAt(output.length() - 1))) {

					output += s.charAt(i);

				}
			}
		}

		Set<Character> outputSet = new HashSet<Character>();
		for (Character character : output.toCharArray()) {
			outputSet.add(character);
		}

		if (outputSet.size() == 5) {
			System.out.println(output + " " + output.length());
		} else {
			System.out.println("All vowels are not present in  " + output + "    " + 0);
		}

	}

	public void funWithVowels2(String s) {
		Set<Character> inputSet = new TreeSet<>();
		for (Character character : s.toCharArray()) {
			inputSet.add(character);
		}
		String output = "";
		ArrayList<Character> inputArray = new ArrayList<>();

		// System.out.println(inputSet);

		for (Character character : inputSet) {
			inputArray.add(character);
		}

		System.out.println(inputArray);

		if (inputSet.size() != 5) {
			System.out.println(0);
		} else {
			int k = 0;
			for (int i = 0; i < s.length(); i++) {
				if (k <= inputArray.size() - 1) {
					if (s.charAt(i) == inputArray.get(k) && k!=inputArray.size()-1) {
						output += s.charAt(i);
						k++;
					} else if (k > 0 && k!=inputArray.size()-1) {
						if (s.charAt(i) == inputArray.get(k) || s.charAt(i) == inputArray.get(k - 1)) {
							output += s.charAt(i);
						
						}
					}else{
						if (s.charAt(i) == inputArray.get(k)){
							output += s.charAt(i);
						}
					}
				}

			}

		}
		System.out.println(output+"   size:  "+output.length());

	}
}
