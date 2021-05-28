package week15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LargestString {
	
	@Test
	public void test1(){
		String s="baccc";
		int k=2;		
		System.out.println(getLargest(s, k));
	}
	
	public String getLargest(String s, int k){
		
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		StringBuffer sb = new StringBuffer();
		StringBuffer reverse = sb.append(charArray).reverse();		
		Map<Character, Integer> map = new HashMap<>();
		ArrayList<Character> list = new ArrayList<>();
		for (char c : reverse.toString().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);	
			if(!list.contains(c)){
				list.add(c);
			}
		}
		
		char[] charArray2 = reverse.toString().toCharArray();
		StringBuffer sb1 = new StringBuffer();
		
		for (char c : list) {
			
			while(map.get(c)<k && map.get(c)!=0){
				sb1.append(c);
				map.put(c, map.get(c)-1);
			}
			
		}
		
		return sb1.toString();

		
	}

}
