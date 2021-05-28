package week14;

import org.junit.Test;

public class MaxValueBy5 {
	
	/*
	 * Find the maximum possible value by inserting '5'
Examples:
input: 1234 -> output: 51234
input: 7643 -> output 76543
input: 0 -> output 50
input: -661 -> output -5661*/
	/*
	 * 1. compare the first letter of input with 5
	 * 2. if the letter<5
	 * 3. note the position & use substring to return the output*/
	@Test
	public void test1(){
		int input = 7623;
		System.out.println(maxValue(input));
	}
	@Test
	public void test2(){
		int input = 50;
		System.out.println(maxValue(input));
	}
	@Test
	public void test3(){
		int input = -2;
		System.out.println(maxValue(input));
	}
	@Test
	public void test4(){
		int input = -661;
		System.out.println(maxValue(input));
	}
	
	public int maxValue(int input){
		if(input>=0){
		String string = Integer.toString(input);
		int pos=0;
		for (int i = 0; i < string.length(); i++) {
			if(Integer.parseInt(string.charAt(i)+"")<5){
				pos=i;
				break;
			}
		}
		String output = string.substring(0, pos) + "5" + string.substring(pos);
		
		return Integer.parseInt(output);
		}else{
			String string = Integer.toString(Math.abs(input));
			int pos=0;
			for (int i = 0; i < string.length(); i++) {
				if(Integer.parseInt(string.charAt(i)+"")>5){
					pos=i;
					break;
				}
			}
			String output = string.substring(0, pos) + "5" + string.substring(pos);
			
			return Integer.parseInt(output)*-1;
		}
		
	}

}
