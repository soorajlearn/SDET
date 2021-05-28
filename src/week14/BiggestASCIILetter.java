package week14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class BiggestASCIILetter {
	
	/*
	 * 2) Given a string S with both lowercase and uppercase letters, return the biggest ASCII letter that appears both in lowercase and uppercase. The returned letter must be in uppercase. If there is no such letter, return 'NO'.
Examples:
'aaabcAbCdD', return 'D'
'aA', return 'A'
'abcdE', return 'NO'
'a', return 'NO'*/
	@Test
	public void test1(){
		String input = "aaabcAbCd";
		System.out.println(biggestASCII(input));
	}
	@Test
	public void test2(){
		String input = "aA";
		System.out.println(biggestASCII(input));
	}
	@Test
	public void test3(){
		String input = "abcdE";
		System.out.println(biggestASCII(input));
	}
	@Test
	public void test4(){
		String input = "a";
		System.out.println(biggestASCII(input));
	}
	
	/*
	 * */
	
	public String biggestASCII(String input){
		if(input.length()<2) return "NO";
		
		List<Character> list = new ArrayList<>();
		
		for (Character c : input.toCharArray()) {
			list.add(c);
		}
		char max = Collections.max(list);
		char uMax = Character.toUpperCase(max);
		if(list.contains(uMax))
			return ""+uMax;
		else return "NO";

		
		
	}

}
