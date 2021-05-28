package learn;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SecondLargestPrimeOccorance {
	
	@Test
	public void test1(){
		int[] input  = {2,4,6,8,11,17,11,17,17,7,8,7,7,7};
		System.out.println(secondLargestPrimeOccurance(input));
		
	}
	
	public int secondLargestPrimeOccurance(int[] input){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		int secondMaxKey = 0;
		for (int i = 0; i < input.length; i++) {
			if(isPrime(input[i])==true){
				map.put(input[i], map.getOrDefault(input[i], 0)+1);
				if(map.get(input[i])>max){
					secondMax = max;
					max = map.get(input[i]);
				}else if(map.get(input[i])>secondMax){
					secondMax = map.get(input[i]);
				}
			}
			
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			if(entry.getValue()==secondMax){
				secondMaxKey = entry.getKey();
				break;
			}
		}
		return secondMaxKey;
		
		
		
	}
	
	public boolean isPrime(int num){
		
		for(int i=2; i<=Math.sqrt(num); i++){
			if(num%i==0) return false;
		}
		return true;
		
	}

}
