package week15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MobileTrucks {
	
	@Test
	public void test1(){
		int[][] mobileTypes = {{1,3},{2,2},{3,1}};
		int truckSize = 4;
		System.out.println(findMaxMobiles(mobileTypes, truckSize));
	}
	
	
	
	
	public int findMaxMobiles(int[][] mobileTypes, int truckSize){
		
		int output = 0;
		
		//int[] occuranceTot = new int[mobileTypes.length];
		List<Integer> occurance = new ArrayList<Integer>();
		List<Integer> occuranceTot = new ArrayList<Integer>();
		
		for (int i=0; i<mobileTypes.length;i++) {
			occuranceTot.get(mobileTypes[i][1]*mobileTypes[i][0]);
		}
		
		for (int i=0; i<mobileTypes.length;i++) {
			occurance.add(mobileTypes[i][1]);
		}
		
		Integer max = Collections.max(occurance);
		
		int index = occurance.indexOf(max);
		
		for (Integer integer : occurance) {
			
			
			
		}
		
		
		
		
		return output;
		
	}

}
