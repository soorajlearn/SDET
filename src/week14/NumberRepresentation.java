package week14;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumberRepresentation {
	
	/*
	 * Psuedo Code:
	 * 1. Divide the number by 1000, continue till quotient is greater than 0
	 * 2. For every division calculate the wordings for the remainder 
	 * 3. have a counter variable and increase it for every recursive call, which can be used to determine 
	 * hundreds, thousands and millions
	 * 4. Define a method to construct the words from numbers , which can be called on every recursion
	 *    This method will take 3 digit number, count and returns a string 
	 *    
	 *    
	 *    1214
	 *    /1000 - 214
	 *    %100 - 14 , <20 refer <20 string array and get the word
	 *    /100 - 2, <20 string array and get the word & add hundred word
	 *    based on counter value, add the word from 1000s list
	 *    
	 *    1224
	 *    /1000 - 224
	 *    %100 - 24 , >20 , divide by 10 , get word of remainder from 1s list & word of quotient from 10s list
	 *    /100 - 2, <20 string array and get the word & add hundred word
	 *    based on counter value, add the word from 1000s list
	 *    
	 *    
          Divide the number by 100, 
          if the remainder is less than 20 - get the word from <20 string array
          if the remainder is greater than 20 - divide the remainder by 10 & take and get the word from ones and 10s list
          
	 *    
	 *    
	 *    
	 * */
	
	@Test
	public void test1(){		
		int input = 1234567890;
		System.out.println(recurse(input));		
	}
	@Test
	public void test2(){	
		int input = 1000000;
		System.out.println(recurse(input));		
	}
	@Test
	public void test3(){		
		int input = 1001;		
		System.out.println(recurse(input));
	}
	@Test
	public void test4(){	
		int input = 99;
		System.out.println(recurse(input));	
	}
	
	public List<String> ones = Arrays.asList("", "One", "Two", "Three", "Four", "Five", "Six", "Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen",
			"Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen");
	public List<String> tens = Arrays.asList("", " Ten ", " Twenty ", "Thirty", "Forty", "Fifty", "Sixty", "Seventy","Eighty","Ninety");
	
	private String recurse(int input){
		
		if(input>=1000000000) return recurse(input/1000000000)+ " Billion " + recurse(input%1000000000);
		if(input>=1000000) return recurse(input/1000000)+ " Million " + recurse(input%1000000);
		if(input>=1000) return recurse(input/1000)+ " Thousand " + recurse(input%1000);
		if(input>=100) return recurse(input/100)+ " Hundred " + recurse(input%100);
		if(input>=20) return tens.get(input/10) + recurse(input%10);
		return ones.get(input);
		
		
	}

}
