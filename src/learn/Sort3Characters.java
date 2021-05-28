package learn;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class Sort3Characters {
	
	@Test
	public void test1(){
		char[] ch = {'A','M','D','A','M','D'};	
		System.out.println(Arrays.toString(sorted(ch)));
	}
	
	@Test
	public void test2(){
		char[] ch = {'A','M','D','A','M'};
		System.out.println(Arrays.toString(sorted(ch)));		
	}
	
	@Test
	public void test3(){
		char[] ch = {'M','A','D','A','M'};
		System.out.println(Arrays.toString(sorted(ch)));
	}
	
	
	/*1. loop thru input array and assign it to a treeset
	 *2. Assign ASCII value of 1st character to 0, second to 1 and third to 2
	 *3. use three ptrs , low, mid, high
	 *4. traverse thru the array until mid<high
	 *5. if input value is equal to 1st character of set, swap low & mid  & increment low & mid
	 *6. if input value is equal to 2nd character of set, swap and increment mid alone
	 *7. if input value is equal to 3rd character of set, swap mid & high and decrement high 
	 * */
	
	
	public char[] sorted(char[] input){
		
		
		Set<Character> set = new TreeSet<Character>();
		
		
		for (int i = 0; i < input.length; i++) {
			set.add(input[i]);
		}
		
		int low=0, mid=0, high=input.length-1;
		char temp;
		
		while(mid<=high){
			if(input[mid] == 'A'){
				temp = input[mid];
				input[mid++]=input[low];
				input[low++]=temp;
			}else if(input[mid]=='D'){
				mid++;
			}else if(input[mid] == 'M'){
				temp = input[mid];
				input[mid]=input[high];
				input[high--]=temp;
			}
		}
		
		return input;
	}

}
