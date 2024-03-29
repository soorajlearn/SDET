package week4.assessment;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ShortestSubstringContainingCharacters {

	@Test
	public void test1() {
		String s1 = "dabbdcabcd";
		shortsub(s1);
	}

	public void shortsub(String s1) {

		String output = "";
		Map<Character, Integer> uniqueMap = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {

			if (!(output.contains(s1.charAt(i) + ""))) {
				output += s1.charAt(i);
			}

		}

		for (Character ch : output.toCharArray()) {

			uniqueMap.put(ch, uniqueMap.getOrDefault(ch, 0) + 1);

		}

		System.out.println(uniqueMap);
		
		String findSubString = findSubString(s1, output);
		
		System.out.println(findSubString);

		/*
		 * int start = 0, end = output.length();
		 * 
		 * while (end <= s1.length()) {
		 * 
		 * for (int i = start; i < end; i++) { map2.put(s1.charAt(i),
		 * map2.getOrDefault(s1.charAt(i), 0) + 1); }
		 * 
		 * 
		 * 
		 * if (map2.equals(uniqueMap)) { System.out.println(end - start);
		 * 
		 * 
		 * } else {
		 * 
		 * map2.clear();
		 * 
		 * start++; end++; }
		 * 
		 * }
		 */

	}

	static final int no_of_chars = 256;

	// Function to find smallest window containing
	// all characters of 'pat'
	static String findSubString(String str, String pat) {
		int len1 = str.length();
		int len2 = pat.length();

		// check if string's length is less than pattern's
		// length. If yes then no such window can exist
		if (len1 < len2) {
			System.out.println("No such window exists");
			return "";
		}

		int hash_pat[] = new int[no_of_chars];
		int hash_str[] = new int[no_of_chars];

		// store occurrence ofs characters of pattern
		for (int i = 0; i < len2; i++)
			hash_pat[pat.charAt(i)]++;

		int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;

		// start traversing the string
		int count = 0; // count of characters
		for (int j = 0; j < len1; j++) {
			// count occurrence of characters of string
			hash_str[str.charAt(j)]++;

			// If string's char matches with pattern's char
			// then increment count
			if (hash_pat[str.charAt(j)] != 0 && hash_str[str.charAt(j)] <= hash_pat[str.charAt(j)])
				count++;

			// if all the characters are matched
			if (count == len2) {
				// Try to minimize the window i.e., check if
				// any character is occurring more no. of times
				// than its occurrence in pattern, if yes
				// then remove it from starting and also remove
				// the useless characters.
				while (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)] || hash_pat[str.charAt(start)] == 0) {

					if (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)])
						hash_str[str.charAt(start)]--;
					start++;
				}

				// update window size
				int len_window = j - start + 1;
				if (min_len > len_window) {
					min_len = len_window;
					start_index = start;
				}
			}
		}

		// If no window found
		if (start_index == -1) {
			System.out.println("No such window exists");
			return "";
		}

		// Return substring starting from start_index
		// and length min_len
		return str.substring(start_index, start_index + min_len);
	}

}
