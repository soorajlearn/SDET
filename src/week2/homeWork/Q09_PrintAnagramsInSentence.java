package week2.homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Q09_PrintAnagramsInSentence {
	
	@Test
	public void test1(){
		String input = "stale are there in rea ear tesla and you can steal the pears";
		printAnagramsInSentence(input);
	}
	
	@Test
	public void test2(){
		String input = "stale are there in tesla and you can steal the pears";
		printAnagramsInSentence(input);
	}
	
	private void printAnagramsInSentence(String input){
		
		String[] split = input.split(" ");
		int[] ascii = new int[split.length]; 
		ArrayList<Integer> arr= new ArrayList<>();
		ArrayList<Integer> index= new ArrayList<>();
		for (int i=0; i<split.length;i++) {
			for (int j = 0; j < split[i].length(); j++) {
				System.out.println(" am here");
				ascii[i] += (int) split[i].charAt(j);
			}		
		} 
		
		/*for (int i = 0; i < ascii.length-1; i++) {
			System.out.println(split[i]+":"+ascii[i]);
		}*/
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : ascii) {
			map.put(i, map.getOrDefault(i,0)+1);
		}
		
		//System.out.println(map);
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet())  
            if(entry.getValue()>1){
            	arr.add(entry.getKey());
            }
		for (int i = 0; i < ascii.length-1; i++) {
			if(ascii[i]==arr.get(0)){
				index.add(i);
			}
		}
		
		//System.out.println(index);
		
		for (Integer integer : index) {
			System.out.println(split[integer]);
		}
		
		
	}

}
