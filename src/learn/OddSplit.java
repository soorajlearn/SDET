package learn;

import java.util.ArrayList;

import org.junit.Test;

public class OddSplit {
	
	
	@Test
	public void test1(){
		String s = "WELCOME";
		getOddSplit(s);
	}
	
	
	public void getOddSplit(String s){
		
		
		ArrayList<String> list = new ArrayList<>();
		
		int mid = s.length()/2;
		StringBuilder sb = new StringBuilder();
		for (int i = mid; i < s.length(); i++) {
			list.add(sb.append(s.charAt(i))+"");
		}
		for (int i = 0; i < mid; i++) {
			list.add(sb.append(s.charAt(i))+"");
		}
		System.out.println(list);

	}

}
