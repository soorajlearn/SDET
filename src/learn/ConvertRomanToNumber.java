package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class ConvertRomanToNumber {
	
	@Test
	public void test1(){
		List<String> names = Arrays.asList(new String[]{"Steven L","Steven XL", "Steven V", "David IX"});
		System.out.println(sortRoman(names));
	}

	public static List<String> sortRoman(List<String> names) {

		// Write your code here

		List<String> output = new ArrayList<>();
		TreeSet<String> oSet = new TreeSet<>();
		Map<String, Integer> map = new HashMap<>();
		Map<String, String> map2 = new TreeMap<>();
		for (String s : names) {
			String[] split = s.split(" ");
			int num = covertRomanToNumber(split[1]);
			map.put(split[1],num);
			map2.put(s, num+"");
			//oSet.add(split[0] + " " + Integer.toString(num));
		}
		/*Iterator<String> it = oSet.iterator();
		while (it.hasNext()) {
			String s = it.next();
			String[] split = s.split(" ");
			output.add(split[0] + " " + map.get(Integer.parseInt(split[1])));
		}*/
		
		for (Entry entry : map2.entrySet()) {
			String key = entry.getKey().toString();
			String[] split = key.split(" ");
			output.add(key.replaceAll(split[1],map.get(split[1])+""));
		}
		
		return output;

	}

	public static int covertRomanToNumber(String input) {
		char[] arr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);

		int num = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (map.get(arr[i]) < map.get(arr[i + 1])) {
				num += -(map.get(arr[i]));
			} else {
				num += map.get(arr[i]);
			}
		}
		return num + map.get(arr[arr.length - 1]);
	}

}
