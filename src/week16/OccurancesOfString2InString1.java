package week16;

import org.junit.Test;

public class OccurancesOfString2InString1 {
	
	@Test
	public void test1(){
		
		String input1="Welcome to the world to do something great to evertoyone";
		String input2="to";
		System.out.println(findOcc(input1, input2));
	
	}
	
	int output = 0;
	
	public int findOcc(String input1, String input2){
		if(input1.length()==1) return output;
		if(input1.substring(0, input2.length()).equals(input2)){
			output+=1;
			findOcc(input1.substring(1), input2);
		}else{
			findOcc(input1.substring(1), input2);
		}
		return output;
	}

}
