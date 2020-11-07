package week4.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class LimitChar {

	@Test
	public void eg1() {
		String input = "zzzzxxa";
		int k = 3;
		charlimit(input, k);
	}

	@Test
	public void eg2() {
		String input = "yuzzvuyzpv";
		int k = 1;
		charlimit(input, k);
	}

	private void charlimit(String input, int k) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		List<Character> list = new ArrayList<Character>();
		String out = "";
		int[] samp = new int[128];
		for (char character : input.toCharArray()) {
			/*
			 * map.put(character, map.getOrDefault(character, 0)+1);
			 * list.add(character);
			 */
			list.add(character);
			samp[(int) character] += 1;
		}
		// System.out.println(Arrays.toString(samp));

		Collections.sort(list);

		for (Character character : list) {
			out += character;
		}

		StringBuilder sb = new StringBuilder(out);
		// sb.reverse();
		// System.out.println(sb.reverse().toString());

		buildString(sb.reverse().toString(), k, samp);
	}

	private void buildString(String input, int k, int[] samp) {
		// Input String ="ZZZXXA"
		// Expected op= "ZZXZXA";
		// 1st iter:

		Map<Character, Integer> countermap = new HashMap<Character, Integer>();

		String out = "";

		for (int i = 0; i < input.length(); i++) {
			countermap.put(input.charAt(i), countermap.getOrDefault(input.charAt(i), 0) + 1);
			if (countermap.get(input.charAt(i)) <= k) {

				if (countermap.get(input.charAt(i)) == 1) {
					out += input.charAt(i);
					samp[(int) input.charAt(i)] -= 1;

				} else {

					for (int j = 0; j < i; j++) {
						if ((samp[(int) input.charAt(j)] != 0) && (countermap.get(input.charAt(i)) != 1)) {
							out += input.charAt(j);
							samp[(int) input.charAt(j)] -= 1;

						}

					}
				}

			}
			
		}
		System.out.println(out);
	}

}
