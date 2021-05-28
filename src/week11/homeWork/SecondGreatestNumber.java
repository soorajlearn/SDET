package week11.homeWork;

import org.junit.Test;

public class SecondGreatestNumber {
	@Test
	public void test1(){
		int[] input = {2,1,3,30,4,11,33,26};
		System.out.println(secondGreatest(input));
	}
	
	public int secondGreatest(int[] input){
		int temp=0;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]>input[j]){
					temp = input[i];
					input[i]= input[j];
					input[j] = temp;
				}			
			}
		}
		
		return input[input.length-2];
	}

}
