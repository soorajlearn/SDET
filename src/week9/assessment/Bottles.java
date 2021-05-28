package week9.assessment;

import org.junit.Test;

public class Bottles {
	
	@Test
	public void test1(){
		
		int noOfCC = 15;
		int noOfExc = 4;
		System.out.println(countTheBottles(noOfCC, noOfExc, noOfCC));
		
	}
	
	public int countTheBottles(int noOfCC, int noOfExc, int output){
		
		int quotient = noOfCC / noOfExc;  
		
		int remainder = noOfCC % noOfExc; 
		
		
		output +=quotient;
		
		if(quotient!=0){
			countTheBottles(quotient+remainder, noOfExc, output);
		}
		
		
		
		return output;
		
	}

}
