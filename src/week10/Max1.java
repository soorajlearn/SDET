package week10;

import org.junit.Test;

public class Max1 {
	@Test
	public void test1(){
		int[] input = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		System.out.println(max1(input, k));
		
	}
	
	public int max1(int[] input, int k){
		int start=0, end=0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i]==0){
				k--;
			}if(k<0){
				
				if(input[start]==0){
					k++;					
				}
				start++;
			}
			
			
			end++;
		}
		
		
		return end-start;
	}

}
