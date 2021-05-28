package week11.homeWork;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestDistinctSubstring {
	
	/*
	 * 1. Initiate start=0, end =0, maxlength=0
	 * 2. Loop thru for loop , from the beginning 
	 * 3. for each character, all the occurance in map 
	 * 4. if size of map == k, assign end-start= value to maxlength by comparing with previous max
	 * 5. if size of map exceeds k, remove start value and increment it 
	 * 6. return the maxlength 
	 * 
	 * */
	@Test
	public void test1(){
		String input = "ecebaaaaabb";
		int k = 2;
		System.out.println(longestDistinctSubstring(input, k));
		
	}
	
	
	@Test
	public void test2(){
		String input = "aa";
		int k = 1;
		System.out.println(longestDistinctSubstring(input, k));
		
	}
	
	public int longestDistinctSubstring(String input, int k){
		
		int start=0, end=0, maxLength=0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
			end=i;
			
			if(map.size()==k){
				maxLength = Math.max(end-start+1, maxLength);
			}else if(map.size()>k){
				
				while(map.size()!=k){
					if(map.get(charArray[start])!=1){
				map.put(charArray[start], map.get(charArray[start])-1);
					}else{
						map.remove(charArray[start]);
					}
				start++;
				}
				
			}
		}
		
		
		
		return maxLength;
		
	}

}
