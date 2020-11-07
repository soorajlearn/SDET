package week5.assessment;

import org.junit.Test;

public class Problem1 {
	
	@Test
	public void test1(){
		String input = "UUURUUUULL";
		System.out.println(maxDel(input));
	}
	
	public int maxDel(String input){
		int countU=0;
		int countD=0;
		int countL=0;
		int countR=0;
		
		for (char c : input.toCharArray()) {
			
			if(c=='U'){
				countU++;
			}else if(c == 'D'){
				countD++;
			}else if(c == 'L'){
				countL++;
			}else if(c == 'R'){
				countR++;
			}
			
		}
		
		int x = countR-countL;
		int y = countU-countD;
		
		int totalMovements = Math.abs(x)+Math.abs(y);
		
		int deletions = input.length()-totalMovements;
		
		return deletions;
		
		
	}

}
