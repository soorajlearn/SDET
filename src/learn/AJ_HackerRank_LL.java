package learn;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class AJ_HackerRank_LL {
	
	//@Test
	public void test1(){
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(6,7,8,9));
		int a = 2;
		int b=3;
		System.out.println(mergeInBetween(list1, list2, a, b));
		
	}
	
	
	//@Test
	public void test2(){
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(6,7,8,9));
		int a = 4;
		int b=5;
		System.out.println(mergeInBetween(list1, list2, a, b));
		
	}
	
	@Test
	public void test3(){
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(6,7,8,9));
		int a = 1;
		int b= 4;
		System.out.println(mergeInBetween(list1, list2, a, b));
		
	}
	
	public LinkedList<Integer> mergeInBetween(LinkedList<Integer> list1, LinkedList<Integer> list2, int a, int b){
		if(list1.size()==0 || !(list1.contains(a)) || !(list1.contains(b)) ){
			System.out.println("Invalid input");
		}
		
		int indexOfa = list1.indexOf(a);
		int indexOfb = list1.indexOf(b);
		
		int diff = indexOfb-indexOfa+1;
		
		while(diff!=0){
			list1.remove(indexOfa);
			diff--;
		}
		
		for (int i = list2.size()-1; i >=0; i--) {
			list1.add(indexOfa, list2.get(i));
		}
		
		return list1;
	}

}
