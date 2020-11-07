package week2.homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Q01_PermutationsOfS2inS1_Method2 {

	@Test
	public void test1() {
		String s1 = "abcbaccbrteycbacab";
		String s2 = "abc";
		//permutationsOfS2inS1(s1, s2);
		System.out.println(check(s2, s1));
	}
	
	@Test
	public void test2() {
		String s1 = "eidbaooo";
		String s2 = "abc";
		//permutationsOfS2inS1(s1, s2);
		System.out.println(check(s1, s2));
	}
	
	@Test
	public void test3() {
		String s1 = "eidbaooo";
		String s2 = "ab";
		permutationsOfS2inS1(s1, s2);
	}

	private void permutationsOfS2inS1(String s1, String s2) {
		Map<Character, Integer> s1Map = new HashMap<Character, Integer>();
		Map<Character, Integer> s2Map = new HashMap<Character, Integer>();

		for (Character ch : s2.toCharArray()) {
			
			s2Map.put(ch , s2Map.getOrDefault(ch, 0)+1);

		}
		
		
		//int start = 0, end = s2.length()-1;
		
		int output = 0;
		
		for (int i = 0; i < s1.length()-s2.length(); i++) {
			int start = i;
			int end = s2.length();
			while(end>0){
				s1Map.put(s1.charAt(start), s1Map.getOrDefault(s1.charAt(start), 0)+1);
				end--;
				start++;
			}
			if(s1Map.equals(s2Map)){
				
				output+=1;
				
			}
			s1Map.clear();
			
		}
		
		System.out.println(output);
		
		/*char[] charString = s2.toCharArray();
		ArrayList<String> output = new ArrayList<String>();
		
		
		for (int i = 0; i < charString.length; i++) 
		{
			for (int j = 0; j < charString.length; j++) 
			{
				char temp = charString[i];
				charString[i] = charString[j];
				charString[j] = temp;
				if (!output.contains(String.valueOf(charString)))
				{
					output.add(String.valueOf(charString));
				}
				
			}
		}
		
		
		System.out.println(output);*/
		

	}

	
	private boolean check(String s1,String s2) {
		HashMap<Character, Integer> map1= new HashMap<Character,Integer>();
		HashMap<Character, Integer> map2= new HashMap<Character,Integer>();
		boolean value=false;
		if(s1.length()>s2.length()) {
			return false;
		}
		
		for(int i=0;i<s1.length();i++) {
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
		}
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<s2.length();i++) {
				map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0)+1);
			}
			if(map1.equals(map2))
				return true;
		}
		
		
		for(int j=0;j<s2.length();j++) {
			char ch=s2.charAt(j);
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
			
			if(j>=s1.length()) {
				ch=s2.charAt(j-s1.length());			
			if(map2.get(ch)==1) {
				map2.remove(ch);
			}
			else {
				map2.put(ch, map2.get(ch)-1);
			}
			}
			if(map2.equals(map1)) {
				return true;
			}
		}	
		return value;
	}
}
