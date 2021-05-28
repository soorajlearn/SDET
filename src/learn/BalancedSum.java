package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BalancedSum {
	
	@Test
	public void test1(){
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,3));
		
		System.out.println(balancedSum(arr));
		
	}
	
	
	 public static int balancedSum(List<Integer> arr) {
		    // Write your code here
		    int totSum=0, currSum=0;
		    for(int i=0; i<arr.size();i++){
		        totSum += arr.get(i);
		    }
		    int leftsum=arr.get(0);
		    for(int j=1; j<arr.size()-1;j++){
		        leftsum += arr.get(j);
		        currSum = leftsum-arr.get(j);
		        int rightSum=0;
		        for(int k=j+1;k<arr.size();k++){
		            rightSum+= arr.get(k);
		        }
		        if(currSum==rightSum){
		            return j;
		        }      
		    }
		    return 0;

		    }

}
