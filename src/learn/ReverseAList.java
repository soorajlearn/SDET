package learn;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ReverseAList {
	
	@Test
	public void test1(){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(reverse(list));
	}
	
	public ArrayList<Integer> reverse(ArrayList<Integer> list){
		 for (int i = 0, j = list.size() - 1; i < j; i++) {
			 list.add(i, list.remove(j));
	        }	
		return list;
	}

}
