package week4.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class MaxTrailingRecord {
	
	@Test
	public void test1(){
		
		
		Integer[] input = { 12,4, 5, 6, 11, 1, 2, 10 };
		List<Integer> arr = Arrays.asList(input);
		
		maxTrailingRecord(arr);
	}	
	
	public void maxTrailingRecord(List<Integer> arr){
		
		int maxValue = 0;
		
		for (int i = 1; i < arr.size(); i++) {
			
			for (int j = 0; j < i; j++) {
				
				maxValue = Math.max(arr.get(i)-arr.get(j), maxValue);
				
			}
			
		}
		
		if(maxValue==0){ maxValue = -1; } 
		
		System.out.println(maxValue);
		
		
		/*int val=Collections.max(arr);
        int maxpointer=arr.indexOf(val);
        int maxdiff=-1;
        for(int i=0;i<maxpointer;i++){
            maxdiff=Math.max(val-arr.get(i), maxdiff);
        }
        
        for(int i=maxpointer+1;i<arr.size();i++){
            if(arr.get(i)>=arr.get(i-1)){
                maxdiff=Math.max(arr.get(i)-arr.get(i-1), maxdiff);
            }
        }
        return maxdiff;*/
		
	}

}
