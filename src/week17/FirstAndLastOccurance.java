package week17;

import java.util.Arrays;

import org.junit.Test;

public class FirstAndLastOccurance {

	@Test
	public void example1() {
		int[] input = { 1, 3, 4, 12, 12, 12, 14, 14, 19, 19, 19, 20 };
		int target = 14;
		System.out.println(Arrays.toString(brute(input, target)));
		System.out.println(Arrays.toString(firstAndLastOccurance(input, target)));
	}

	@Test
	public void example2() {
		int[] input = { 1, 3, 4, 12, 12, 4, 14, 14, 19, 19, 19, 20 };
		int target = 4;
		System.out.println(Arrays.toString(brute(input, target)));
		System.out.println(Arrays.toString(firstAndLastOccurance(input, target)));
	}

	@Test
	public void example3() {
		int[] input = { 1, 3, 4, 12, 12, 12, 14, 19, 19, 19, 20 };
		int target = 14;
		System.out.println(Arrays.toString(brute(input, target)));
		System.out.println(Arrays.toString(firstAndLastOccurance(input, target)));
	}

	@Test
	public void example4() {
		int[] input = { 1, 3, 4, 12, 12, 12, 19, 19, 19, 20 };
		int target = 14;
		System.out.println(Arrays.toString(brute(input, target)));
		System.out.println(Arrays.toString(firstAndLastOccurance(input, target)));
	}

	@Test
	public void example5() {
		int[] input = { 1, 4, 3, 12, 12, 14, 12, 19, 19, 19, 14, 20 };
		int target = 14;
		System.out.println(Arrays.toString(brute(input, target)));
		System.out.println(Arrays.toString(firstAndLastOccurance(input, target)));
	}

	/*
	 * 1. Brute Force(O[2N] -->O[N]): 2 different for loops , 1 from beginning
	 * to end , 2nd one from end to beginning 2. 2 Ptr (O[N/2])
	 * 
	 */

	/*
	 * 1. declare start as i=0, end as input length -1 2. loop thru while loop
	 * with condition start <=end 3. if input[start] is not equal to target ,
	 * increment the start 4. if input[end] is not equal to target , decrement
	 * the end 5. if input[start] is equal to target , assign the output[0] =
	 * start and continue 6. if input[end] is equal to target , assign the
	 * output[1] = end and continue *
	 */

	private int[] brute(int[] input, int target) {
		int[] output = { -1, -1 };

		for (int i = 0; i < input.length; i++) {
			if (input[i] == target) {
				output[0] = i;
				break;
			}
		}

		for (int j = input.length - 1; j >= 0; j--) {
			if (input[j] == target) {
				output[1] = j;
				break;
			}
		}

		return output;
	}

	private int[] firstAndLastOccurance(int[] input, int target) {
		int[] output = { -1, -1 };

		int start = 0, end = input.length - 1;

		while (start <= end) {
			if (input[start] != target && input[end] != target) {
				start++;
				end--;
			} else if (input[start] == target && input[end] != target) {
				output[0] = start;
				end--;
			} else if (input[end] == target && input[start] != target) {
				output[1] = end;
				start++;
			}else if (input[start] == target && input[end] == target){
				output[0] = start;
				output[1] = end;
				break;
			}
		}

		return output;
	}

	
	/* 1. declare low=0 , high = input.length-1 , mid = (low+high)/2
	 * 2. if mid < target , assign low = mid+1
	 * 3. if mid > target , assign high = mid
	 * 4. if mid= target, perform expand around center
	 *       low = mid-1, high= mid+1
	 *       if low != mid, assign output[0] = low+1
	 *       if high != mid, assign output[1] = high-1 */
	
	int[] output = {-1,-1};
	private int[] bs(int[] input, int target){
		recurse(input, target, 0, input.length-1);
		return output;
	}
	
	public void recurse(int[] input, int target, int low, int high){
		int mid = (low+high)/2;
		if(mid<target){
			recurse(input, target, mid+1, high);
		}else if(mid>target){
			recurse(input, target, low, mid-1);
		}else{
			low = mid-1;
			high = mid+1;
			
			while(input[low] == target && input[high] == target){
				
				 if (input[low] == target && input[high] != target) {
					output[1] = high-1;
					low--;
				} else if (input[high] == target && input[low] != target) {
					output[0] = low;
					high++;
				}
				
			}
			
			
		}
	}
	
}
