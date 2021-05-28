package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class AJ_HackerRank_Anagram {

	@Test
	public void test1() {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("code", "doce", "ecod", "framer", "frame"));
		System.out.println(getAnagrams(list));
	}

	private Set<String> getAnagrams(ArrayList<String> input) {

		Map<Map<Character, Integer>, String> map = new HashMap<>();
		for (String string : input) {
			map.put(getmap(string), string);
		}

		Set<String> set = new TreeSet<String>();
		set.addAll(map.values());
		return set;

	}

	private Map<Character, Integer> getmap(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charr = str.toCharArray();
		for (char c : charr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		return map;
	}

}
