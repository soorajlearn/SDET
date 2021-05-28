package sort;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	@Test
	public void test1(){
		int[] input = {11,4,17,18,2,22,1,8};
		System.out.println(Arrays.toString(selectionSort(input)));
	}
	
	@Test
	public void test2(){
		int[] input = {2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(selectionSort(input)));
	}
	
	@Test
	public void test3(){
		int[] input = {11,4,17,18,2,22,1,8};
		System.out.println(Arrays.toString(selectionSort(input)));
	}
	
	

	
	public int[] selectionSort(int[] input) {
        int min;
        for(int i=0;i<input.length;i++) {
            min=i;
            for(int j=i+1;j<input.length;j++) {
                if(input[j]<input[min]) {
                    min=j;    
                }       
            }
            int temp=input[i];
            input[i]=input[min];
            input[min]=temp;
        }
        
        return input;
    }
}
		
	


