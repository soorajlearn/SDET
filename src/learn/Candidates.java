package learn;

import java.util.ArrayList;

import org.junit.Test;

public class Candidates {
	
	@Test
	public void test1(){
		int [] input = {2,3,6,7};
		int target =7;
		System.out.println(findCandidatesSum(input, target));
	}
	
	
	ArrayList<ArrayList<Integer>> output = new ArrayList<>();
	
	public ArrayList<ArrayList<Integer>> findCandidatesSum(int[] input, int target){
		
		ArrayList<Integer> temp = new ArrayList<>();
		recurse(input, target, temp, 0);
		return output;
	}
	
	
	public void recurse(int[] input, int target, ArrayList<Integer> temp, int sum){
		if(sum==target){
			output.add(new ArrayList<Integer>(temp));
			return;
		}else if(sum>target){
			return;
		}
		
		for (int i = 0; i < input.length; i++) {
			sum+=input[i];
			temp.add(input[i]);
			recurse(input, target, temp, sum);
			sum-=input[i];
			temp.remove(temp.size()-1);
		}
		
	}

}
