package week15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class PalindromeRemove {
	
	@Test
	public void test1(){
		String input = "abba";
		System.out.println(ifPalindrome(input));
		
	}
	@Test
	public void test2(){
		String input = "madam";
		System.out.println(ifPalindrome(input));
		
	}
	
	@Test
	public void test3(){
		String input = "My gym";
		System.out.println(ifPalindrome(input));
		
	}
	
	@Test
	public void test4(){
		String input = "abby";
		System.out.println(ifPalindrome(input));
		
	}
	
	public boolean ifPalindrome(String input){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character c: input.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		int count=0;
		
		for (Integer integer : map.values()) {
			if(integer%2!=0){
				count++;
			}
		}
		
		if(count%2==0){
			return true;
		}else{
			return false;
		}
	}

}
