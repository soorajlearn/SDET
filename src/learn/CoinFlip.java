package learn;

import org.junit.Test;

public class CoinFlip {
	
	@Test
	public void test1(){
		int[] A = {1,0,1,0,1,1};
		System.out.println(getMinFlips(A));
	}
	
	@Test
	public void test2(){
		int[] A = {1,1,0,1,1};
		System.out.println(getMinFlips(A));
	}
	
	@Test
	public void test3(){
		int[] A = {1,0,1};
		System.out.println(getMinFlips(A));
	}
	
	@Test
	public void test4(){
		int[] A = {0,1,0,1,0,0};
		System.out.println(getMinFlips(A));
	}
	
	
	public int getMinFlips(int[] A){
		
		return Math.min(getFlips(A, 0), getFlips(A, 1));
		
	}
	
	public int getFlips(int[] A, int a){
		
		boolean flag = A[0]==a? true:false;
		
		
		int reverse = 0;
		
		for (int i = 0; i < A.length; i++) {
			if(flag){
				if(A[i]!=0) reverse++;
				flag = false;
			}
			else{
				if(A[i]!=1) reverse++;
				flag = true;
			}
		}
		
		return reverse;
	}

}
