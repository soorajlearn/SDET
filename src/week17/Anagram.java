package week17;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class Anagram {
	
	@Test
	public void example1(){
	String s1 = "silent";
	String s2 = "listen";
	System.out.println("Method 1:" + isAnagram1(s1,s2));
	System.out.println("Method 2:" + isAnagram2(s1,s2));
	System.out.println("Method 3:" + isAnagram3(s1,s2));
	
	}

	@Test
	public void example2(){
	String s1 = "aba";
	String s2 = "baab";
	System.out.println("Method 1:" + isAnagram1(s1,s2));
	System.out.println("Method 2:" + isAnagram2(s1,s2));
	System.out.println("Method 3:" + isAnagram3(s1,s2));
	}


	@Test
	public void example3(){
	String s1 = "a";
	String s2 = "a";
	System.out.println("Method 1:" + isAnagram1(s1,s2));
	System.out.println("Method 2:" + isAnagram2(s1,s2));
	System.out.println("Method 3:" + isAnagram3(s1,s2));
	}


	@Test
	public void example4(){
	String s1 = "aba";
	String s2 = "abc";
	System.out.println("Method 1:" + isAnagram1(s1,s2));
	System.out.println("Method 2:" + isAnagram2(s1,s2));
	System.out.println("Method 3:" + isAnagram3(s1,s2));
	}

	@Test
	public void example5(){
	String s1 = "1aba1";
	String s2 = "ab11a";
	System.out.println("Method 1:" + isAnagram1(s1,s2));
	System.out.println("Method 2:" + isAnagram2(s1,s2));
	System.out.println("Method 3:" + isAnagram3(s1,s2));
	}

	/*
	1. Using Hashmap (O[2N]): Iterate thru 2 input strings separately and save the occurance of characters in 2 different hashmaps4
		           Compare the two hasmap and if matching return true else return false

	2. Using Arrays (O[N] + O[n log n]): Covert 2 input string in 2 different character arrays and perform Arrays.sort
			 Compare 2 character arrays and if it is matching return true else return false 

	3. Using Ascii (O[2N]): As like Hashmap


	*/


	public boolean isAnagram1(String s1, String s2){

	if(s1.length()!=s2.length()) return false;

	HashMap<Character, Integer> map1 = new HashMap<>();
	HashMap<Character, Integer> map2 = new HashMap<>();

	for(int i=0; i< s1.length();i++){
		map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
	}

	for(int j=0; j< s1.length();j++){
		map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j),0)+1);
	}

	if(map1.equals(map2)) return true;

	return false;

	}


	public boolean isAnagram2(String s1, String s2){

	if(s1.length()!=s2.length()) return false;

	char[] charArray1 = s1.toCharArray();
	char[] charArray2 = s2.toCharArray();

	Arrays.sort(charArray1);
	Arrays.sort(charArray2);

	if(Arrays.equals(charArray1, charArray2)) return true;

	return false;
	 

	}


	public boolean isAnagram3(String s1, String s2){

	if(s1.length()!=s2.length()) return false;

	int[] c1 = new int[256];
	int[] c2 = new int[256];

	for(int i=0; i< s1.length();i++){
		c1[s1.charAt(i)]++;
	}

	for(int j=0; j< s1.length();j++){
		c2[s2.charAt(j)]++;
	}

	if(Arrays.equals(c1, c2)) return true;

	return false;

	}

}
