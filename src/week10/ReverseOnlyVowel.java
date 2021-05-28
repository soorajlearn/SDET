package week10;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ReverseOnlyVowel {
	
	@Test
	public void test1(){
		
		String input= "Sooraj";
		System.out.println(reverseOnlyVowels(input));
		
	}
	
	@Test
	public void test2(){
		
		String input= "Soorraj";
		System.out.println(reverseOnlyVowels(input));
		
	}
	
	@Test
	public void test3(){
		
		String input= "Sttrrpj";
		System.out.println(reverseOnlyVowels(input));
		
	}
	
	@Test
	public void test4(){
		
		String input= "SOorraj";
		System.out.println(reverseOnlyVowels(input));
		
	}

	public String reverseOnlyVowels(String input){
		
		ArrayList<Character> vowel = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		
		int start=0, end=input.length()-1;
		
		char[] charArray = input.toCharArray();
		
		while(start<end){
			 
				
			if(!vowel.contains(charArray[start])){
				start++;
				continue;
			}
			if(!vowel.contains(charArray[end])){
				end--;
				continue;
			}
			char temp = charArray[start];
			charArray[start]=charArray[end];
			charArray[end]=temp;
			start++;
			end--;			
			
		}
		
		
		return new String (charArray);
		
		
	}
	
}
