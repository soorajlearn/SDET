package week14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordIntoNumbers {

	Map<String, Integer> map = new HashMap<String,Integer>();
	
	@Test
	public void test1(){
		String input = "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety seven";
		System.out.println(getNumber(input));
		
	}
	
	public int getNumber(String input){
		int output = 0;
		
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		map.put("five",5);
		map.put("six",6);
		map.put("seven",7);
		map.put("eight",8);
		map.put("nine",9);
		map.put("ten",10);
		map.put("eleven",11);
		map.put("twelve",12);
		map.put("thirteen",13);
		map.put("fourteen",14);
		map.put("fifteen",15);
		map.put("sixteen",16);
		map.put("seventeen",17);
		map.put("eighteen",18);
		map.put("nineteen",19);
		map.put("twenty",20);
		map.put("thirty",30);
		map.put("forty",40);
		map.put("fifty",50);
		map.put("sixty",60);
		map.put("seventy",70);
		map.put("eighty",80);
		map.put("ninety",90);
		map.put("hundred",100);
		map.put("thousand",1000);
		map.put("million",1000000);
		map.put("billion",1000000000);
		
		String[] split = input.toLowerCase().split(" ");
		
		int[] arr = new int[split.length];
		
		for (int i = 0; i < split.length; i++) {
			arr[i]=map.get(split[i]);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 100){
				list.add((arr[i-1]*arr[i])+arr[i+1]+arr[i+2]);
			}
		}
		
		
		
		return output;
	}
}
