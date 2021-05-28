package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MostOccuredExceptBanned {

	@Test
	public void test1() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		System.out.println(mostOccurredExceptBanned(paragraph, banned));
	}

	@Test
	public void test2() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit", "ball" };
		System.out.println(mostOccurredExceptBanned(paragraph, banned));
	}

	/*
	 * 1. Remove all punctuation mark in the provided paragraph using regex
	 *  2.Covert the paragraph to lowercase 
	 *  3. split the paragraph by space and
	 * convert into string array
	 *  4. loop thru string array and if the string is
	 * not the the banned string array count the occurence of the string in map
	 * 5. get the highest occurance string and return it
	 */

	public String mostOccurredExceptBanned(String paragraph, String[] banned) {

		String[] split = paragraph.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase().split("\\s+");

		ArrayList<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(banned));

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String string : split) {
			if (!list.contains(string)) {
				map.put(string, map.getOrDefault(string, 0) + 1);
			}
		}
		
		return Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
		

		
		/*List<Integer> values = new ArrayList<>();
		values.addAll(map.values());

		Collections.sort(values);*/
		/*for (Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(max)){
            	output += entry.getKey();
            	break;
            }
		}
		
		
		return output;*/
	}
}
