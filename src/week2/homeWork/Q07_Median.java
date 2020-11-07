package week2.homeWork;

import java.util.Arrays;

import org.junit.Test;

public class Q07_Median {

	@Test
	public void test1() {
		int[] input1 = {1,3};
		int[] input2 = {2,4};
		median(input1,input2);
	}
	
	@Test
	public void test2() {
		int[] input1 = {1,3,7};
		int[] input2 = {2,5,8};
		median(input1,input2);
	}
	
	@Test
	public void test3() {
		int[] input1 = {1,5,10};
		int[] input2 = {20,60,105,200};
		median(input1,input2);
	}

	public void median(int[] input1, int[] input2) {
		int linput1 = input1.length;
		int linput2 = input2.length;

		int[] res = new int[linput1 + linput2];

		int pos = 0;
		for (int element : input1) 
		{
			res[pos] = element;
			pos++;
		}
		for (int element : input2) 
		{
			res[pos] = element;
			pos++;
		}
		
		Arrays.sort(res);
		float median=0;
		if(res.length%2==0){
			 median =( (float)res[(res.length/2)-1] + (float)res[(res.length/2)])/2;		
		}else{
			 median = res[res.length/2];
		}
		
		System.out.println(median);

	}

}
