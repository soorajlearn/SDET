package week10;

import org.junit.Test;

public class MaxConsecutiveOccurance_Brute {
	
	/*
	 * 1. Convert String into Character Array 
	 * 2. Iterate from i=0 till n-1
	 * 3. If input.charAt(i) = input.charAt(i+1), increase the counter
	 * 4. Else assign the counter value to maxValue by comparing with previous max */
	
	@Test
	public void test1(){
		String input = "Amazon is a great company as it has AoooZzz";
		System.out.println(maxConsecutiveOccurance(input));
	}

	@Test
	public void test2(){
		String input = "aaazzzzzppppppPP";
		System.out.println(maxConsecutiveOccurance(input));
		
	}
	
	@Test
	public void test3(){
		String input = "aaazzzzzzzzzzzppppppPPyyyyyyyyyy";
		System.out.println(maxConsecutiveOccurance(input));
		
	}
	@Test
	public void test4(){
		String input = "aaazzzpppyyy";
		System.out.println(maxConsecutiveOccurance(input));
		
	}
	
	public char maxConsecutiveOccurance(String input){
		/*int maxValue = 0;
		int count = 1;
		for (int i = 1; i < input.length(); i++) {
			if(input.charAt(i)==input.charAt(i-1)){
				count+=1;				
			}else{
				maxValue = Math.max(maxValue, count);

				count=1;
			}
			maxValue = Math.max(maxValue, count);
		}
		return maxValue
		*/
		int n = input.length(); 
	    int count = 0; 
	    char res = input.charAt(0); 
	    int currentCount = 1; 

	    for (int i = 0; i < n; i++) 
	    { 

	        if (i < n - 1 && input.charAt(i) == input.charAt(i + 1)) 
	        	currentCount++; 
	        else
	        { 
	            if (currentCount > count) 
	            { 
	                count = currentCount; 
	                res = input.charAt(i); 
	            } 
	            currentCount = 1; 
	        } 
	    } 
	    return res; 
	}
	
	
	
	
}
