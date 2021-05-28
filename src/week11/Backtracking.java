package week11;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Backtracking {
	
	@Test
	public void test1(){
		int k=3;
		int n=9;
		List<List<Integer>> add = add(k,n);
		System.out.println(add);
	}
	
	
	private List<List<Integer>> add (int k, int n){
		List<List<Integer>> results = new ArrayList<>();
		combination(k, n, results, new ArrayList<>(), 1);
		return results;
	}
	
	private void combination(int k, int n, List<List<Integer>> results, List<Integer> comb, int start){
		
		if(comb.size()==k & n==0){
			List<Integer> lst = new ArrayList<>(comb);
			results.add(lst);
			return;
			
		}
		
		for (int i = start; i < 10; i++) {
			//System.out.println("I am here");
			comb.add(i);
			combination(k, n-i, results, comb, i+1);
			comb.remove(comb.size()-1);
		}
	}

}
