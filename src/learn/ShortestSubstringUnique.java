package learn;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ShortestSubstringUnique {
	
	@Test
	public void test1(){
		String s = "abbcafcbe";
		System.out.println(getShortestUnqiueSubstring(s));
	}
	
	@Test
	public void test2(){
		String s = "abbcafcb";
		System.out.println(getShortestUnqiueSubstring(s));
	}
	
	@Test
	public void test3(){
		String s = "abbcafcbaah";
		System.out.println(getShortestUnqiueSubstring(s));
	}
	
	
	
	public String getShortestUnqiueSubstring(String s){
		Map<Character, Integer> map = new HashMap<>();
		
		char[] charArray = s.toCharArray();
		for(char ch: charArray){
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		//int unique = map.size();
		int start = 0, end =s.length()-1;
		
		while(start<end){
			
			if(map.get(charArray[start])==1 && map.get(charArray[end])==1){
				break;
			}
			
			if(map.containsKey(charArray[start]) && map.get(charArray[start])>1){
				map.put(charArray[start], map.get(charArray[start])-1);
				start++;
			}
			if(map.containsKey(charArray[end]) && map.get(charArray[end])>1){
				map.put(charArray[end], map.get(charArray[end])-1);
				end--;
			}
		}
		
		return s.substring(start, end+1);
		
	}

}
