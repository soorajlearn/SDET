package week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class subSequenceRemoval {
	@Test
	public void test1(){
		List<Integer> arr = Arrays.asList(1,4,4,1,1,3);
		System.out.println(findSubsequence(arr));
	}
	
	
	public static List<Integer> findSubsequence(List<Integer> arr) {
	    // Write your code here
	    
	    List<Integer> dups = new ArrayList<Integer>();
	    List<Integer> dups1 = new ArrayList<Integer>();
	    for(int i=0; i<arr.size();i++){
	        if(!dups.contains(arr.get(i))){
	            dups.add(arr.get(i));
	        }else{
	            dups1.add(arr.get(i));
	        }
	    }
		for (int i = 0; i < dups1.size()-1; i++) {
			if(dups1.get(i+1)<dups1.get(i)){
				dups1.clear();
				dups1.add(-1);
				break;
			}
		}
		
		return dups1;

	    }

}
