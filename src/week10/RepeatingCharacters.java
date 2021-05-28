package week10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacters {

	/*
	 * Given an array of strings made only from lowercase letters, return a list
	 * of all characters that show up in all strings within the list (including
	 * duplicates). For example, if a character occurs 3 times in all strings
	 * but not 4 times, you need to include that character three times in the
	 * final answer. You may return the answer in any order. Input:
	 * ["bella","label","roller"] Output: ["e","l","l"] Input:
	 * ["cool","lock","cook"] Output: ["c","o"]
	 */
	
	
	
	/*iterate thru the string array and put the occurance of characters in map ---list of map
	iterate thru charcter array of first string,
	if every map contains the character (iterate)
	  map<character,int> where integer will be min of map.get(character) of all strings
	then  add key value times to resultant character array  */
	
	
	public void test1(){
		String[] input = {"bella", "label", "roller"};
		
	}
	
	/*public char[] repeatingCharacters(String[] input){
		
		ArrayList<Map> stringMap = new ArrayList<>();
		
		for (int i = 0; i < input.length; i++) {
			Map<Character,Integer> map = new HashMap<>();
			for (int j = 0; j < input[i].length(); j++) {
				
			}
		}*/
		
		
	//}

}
