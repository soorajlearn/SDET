package learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;

public class GroupAnagrams {
	
/*Given an array of string, group the strings that are composed by the same character, returning an array of arrays.
For example, given:
["124", "412", "425", "241", "524", "324", "2141"],
Return:
[
   ["241", "124","412"],
   ["524","425"],
   ["324"],
   ["2141"]
]*/
	
	@Test
	public void test1(){
		String arr[] = {"124", "412", "425", "241", "524", "324", "2141"};
		System.out.println(groupAnagram1(arr));
	}
	
	
	public ArrayList<ArrayList<String>> groupAnagram(String[] arr){
		ArrayList<ArrayList<String>> output = new ArrayList<>();
		ArrayList<HashMap<Character, Integer>> inputMap = new ArrayList<>();
		HashSet<HashMap<Character, Integer>> inputSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (Character s: arr[i].toCharArray()) {
				map.put(s, map.getOrDefault(s, 0)+1);
			}
			inputMap.add(map);
			inputSet.add(map);
		}
		
		for (HashMap<Character, Integer> hashMap : inputSet) {
			ArrayList<String> list = new ArrayList<>();
			
			for (int i = 0; i < inputMap.size(); i++) {
				if(hashMap.equals(inputMap.get(i))){
					list.add(arr[i]);
				}
			}
			output.add(list);
		}
	
		return output;
	}
	
	
	public ArrayList<ArrayList<String>> groupAnagram1(String[] arr){
		HashMap<HashMap<Character,Integer>, ArrayList<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			char[] charArray = arr[i].toCharArray();
			HashMap<Character,Integer> temp = new HashMap<>();
			for (int j = 0; j < charArray.length; j++) {
				temp.put(charArray[j], temp.getOrDefault(charArray[j], 0)+1);
			}
			map.computeIfAbsent(temp, k -> new ArrayList<>()).add(arr[i]);
		}
	
		return new ArrayList<>(map.values());
	}

}
