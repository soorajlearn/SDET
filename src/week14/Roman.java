package week14;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Roman {
	
	/*
	 * 1. Define all the possible Roman representations in a list 
	 * 2. If the input is not representable in Roman throw exception
	 * 3. Divide the number by 1000/100/10 based on the input and get the respective roman representation 
	 *    and add the remainder part of the number recursively 
	 * */
	
	public List<String> ones = Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII","VIII","IX","X");
	public List<String> tens = Arrays.asList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX","LXXX","XC");
	public List<String> hundreds = Arrays.asList("", "C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC","CM");
	public List<String> thousands = Arrays.asList("", "M", "MM", "MMM");
	
	@Test
	public void test1() throws Exception{		
		int input = 35;
		System.out.println(recurse(input));		
	}
	@Test
	public void test2() throws Exception{	
		int input = 543;
		System.out.println(recurse(input));		
	}
	@Test
	public void test3() throws Exception{		
		int input = 1001;		
		System.out.println(recurse(input));
	}
	@Test
	public void test4() throws Exception{	
		int input = 1234;
		System.out.println(recurse(input));	
	}
	@Test
	public void test5() throws Exception{	
		int input = 3333;
		System.out.println(recurse(input));	
	}
	
	
	private String recurse(int input) throws Exception{
		if(input<=0 || input >= 4000) throw new Exception("Invalid Input");
		if(input>=1000) return thousands.get(input/1000)+recurse(input%1000);
		if(input>=100) return hundreds.get(input/100)+recurse(input%100);
		if(input>=10) return tens.get(input/10)+recurse(input%10);
		else return ones.get(input);
	}

}
