package week10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PatternCheck {
	
	
	/*Given a pattern and a string s, find if s follows the same pattern.
	Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
	Example 1:
	Input: pattern = "abba", s = "dog cat cat dog"
	Output: true
	Example 2:
	Input: pattern = "abba", s = "dog cat cat fish"
	Output: false
	Input: pattern = "abc", s = "hello world world"
	Output: false
	Algorithm: HashMap */
	
	
	
	/*1. covert s into string array and check whether string array length is equal to pattern length 
	2. convert patern into character array
	3. foreach character , add corresponding string index into map, if the key is already available,
	  compare the value with the current value 
	4. 
	4. */
	
	@Test
	public void test1(){
		String pattern = "abc";
		String s = "dog cat cat";
		System.out.println(patternCheck(pattern, s));
	}
	
	
	public boolean patternCheck(String pattern, String s){
		
		HashMap<Character, String> map = new HashMap<>();
		
		String[] split = s.split(" ");
		Set<String> split1 = new HashSet<>();
		Set<Character> pattern1 = new HashSet<>();
		
		for (String string : split) {
			split1.add(string);
		}
		
		char[] charArray = pattern.toCharArray();
		
		for (char c : charArray) {
			pattern1.add(c);
		}
		if(split.length==pattern.length()&&split1.size()==pattern1.size()){
			
			
			for (int i = 0; i < charArray.length; i++) {
				if(!map.containsKey(charArray[i])){
					map.put(charArray[i], split[i]);
				}else{
					if(map.get(charArray[i]).equals(split[i])){
						map.put(charArray[i], split[i]);
					}else{
						return false;
					}
				}			
			}
					
		}else{
			return false;
		}
		return true;
	}

}
