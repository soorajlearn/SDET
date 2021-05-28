

package week10;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Q03_MinimumWindowSubString {
	
	/*
	 * Given 2 input strings, return the minimum window in the first string
	 * which will contain all the characters in second string.
	 * 
	 * Input: str1 = "KSTRKSE", str2 = "KST" Output: "KST"
	 * 
	 * Input: str1 = "KASRTRKSE", str2 = "ST" Output: "SRT"
	 * 
	 */

	@Test
	public void test1(){
		String str1 = "KASRTRKSE";
		String str2 = "ST";
		System.out.println(findSubstring(str1, str2));
		
	}
	
	public String findSubstring(String s1, String s2){
		
		Map<Character,Integer> map = new HashMap<>();
		String output = "";
		char[] c1 = s1.toCharArray();
		
		for (int i = 0; i < s2.length(); i++) {
			map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < c1.length; i++) {
			
			
			int start=0, end=0;
			
			if(map.containsKey(c1[i])){
				start=i;
				map.put(c1[i],map.get(c1[i])-1);
				
			}
			
			end++;
			
		}
		
		
		return output; 
	}
}
