package week10;

import org.junit.Test;

public class LongestContiguousSubArray {
	
	
	@Test
	public void eg1() {
		int[] input= {1,1,1,0,0,0,1,1,1,1,0};
		int k=2;
		System.out.println(maxOnes(input, k));
	}
	
	@Test
	public void eg2() {
		int[] input= {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k=3;
		System.out.println(maxOnes(input, k));
	}
	
	@Test
	public void eg3() {
		int[] input= {0,0,0,0};
		int k=1;
		System.out.println(maxOnes(input, k));
	}
	
	
	private int maxOnes(int[] input, int k) {
		int left=0,zeroCount=0, max1=0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==0) {
				zeroCount++;
			}
			
			if(zeroCount>k) {
				if(input[left]==0) {
				zeroCount--;
				}
				left++;
			}
				
			max1=Math.max(max1, i-left+1);
			//System.out.println("Hello");
		}
		
		return max1;
		
	}

}
