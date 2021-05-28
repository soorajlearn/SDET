package week10;

import org.junit.Test;

public class TrappingRainWater {
	@Test
	public void test1(){
		int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trappingRain(input));
	}
	
	
	public int trappingRain(int[] input){
		
		
		int start=0, end=input.length-1;
		int maxLeft=0, maxRight=0, maxHold=0;
		
		while(start<=end){
			
			if(input[start]<=input[end]){
				maxLeft=Math.max(maxLeft, input[start]);
				maxHold += maxLeft-input[start];
				start++;
			}else if(input[start]>input[end]){
				maxRight=Math.max(maxRight, input[end]);
				maxHold+=maxRight-input[end];
				end--;
			}
			
		}
		
		
		
		
		return maxHold;
	}
	
}
