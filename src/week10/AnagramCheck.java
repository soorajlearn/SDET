package week10;

public class AnagramCheck {

	/*
	 * Given 2 strings, find all the start indices of second string anagrams in
	 * first string. Note: Strings consists of lowercase letters only The order
	 * of output does not matter. Input: s: "abab" p: "ab" Output: [0, 1, 2]
	 * Input: s: "testetr" p: "te" Output: [0, 3, 4] Sliding Window + HashMap
	 * 
	 * 
	 */

	
	/* 1. get the occurances of characters of anagram string in a map
	 * 2. start=0, end=0
	 * 3. iterate from i=0 till p.length
	 * 		add to a map of character, length 
	 * 		end++	
	 * 
	 *      if map matches anagram map add 0 to the output array 
	 *      else
	 *      
	 *      start++
	 *      end++
	 *    
	 *    
	 * 
	 * */
	
	
	public void test1(){
		
		String input1="abab";
		String anag="ab";
		
	}
	
	/*public ArrayList<Integer> anagramCheck(String input1){
		
	}*/
}
