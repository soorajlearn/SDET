package week10;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MinimumWindowCharacters {

	/*
	 * Given two strings s and t, return the minimum window in s which will
	 * contain all the characters in t. If there is no such window in s that
	 * covers all characters in t, return the empty string "".
	 * 
	 * Note that If there is such a window, it is guaranteed that there will
	 * always be only one unique minimum window in s.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "ADOBECODEBANC", t = "ABC" Output: "BANC" Example 2:
	 * 
	 * Input: s = "a", t = "a" Output: "a"
	 */

	/*
	 * 1. count the occurances of characters in t and store it in a map 
	 * 2. loop
	 * thru s , have start =0, end =0, compare with map t and increment end , if
	 * the value is available in t add to map 2 
	 * 3. If map1=map2, increment the
	 * start and override the minimum window
	 *  4. if the maps mismatches,
	 * increment the end and continue performing 2,3
	 */
	@Test
	public void test1() {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minimumWindow(s, t));
	}

	public String minimumWindow(String s, String t) {
		String result = "";
		Map<Character, Integer> mapS = new HashMap<>();
		Map<Character, Integer> mapT = new HashMap<>();

		for (Character ch : t.toCharArray()) {
			mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
		}

		char[] sArray = s.toCharArray();
		int start = 0, end = 0, minValue=Integer.MAX_VALUE;


		for (int i = 0; i < sArray.length; i++) {
			if (mapT.containsKey(sArray[i])) {
				mapS.put(sArray[i], mapS.getOrDefault(sArray[i], 0) + 1);
				
			}
			while(mapS.keySet().equals(mapT.keySet())) {
			 if(minValue>end-start+1){
				 minValue=end-start+1;
				 result=s.substring(start,end+1);
			 }
			 if(mapS.containsKey(sArray[start])){
				 mapS.put(sArray[start], mapS.get(sArray[start])-1);
				 if(mapS.get(sArray[start])==0){
					 mapS.remove(sArray[start]);
				 }
			 }
			 start++;
			}
			end++;

		}

		return result;
	}

}
