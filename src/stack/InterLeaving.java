package stack;

import java.util.ArrayDeque;
import java.util.Stack;

import org.junit.Test;

public class InterLeaving {
	
	@Test
	public void test1(){
		int[] input = {11,12,13,14,15,16,17,18,19,20};
		System.out.println(interLeaving(input));
	}
	
	@Test
	public void test2(){
		int[] input = {11,12,13,14,15,16,17,18,19,20,21};
		System.out.println(interLeaving(input));
	}
	
	/* add 1st half of array to a queue
	 * add 2nd half of array to another queue
	 * loop the first queue and dequeue & enqueue,and enqueue the second queue*/
	
	public ArrayDeque<Integer> interLeaving(int[] input){
		ArrayDeque<Integer> output = new ArrayDeque<>();
		ArrayDeque<Integer> output1 = new ArrayDeque<>();
		int n = input.length;
		for (int i = 0; i < n/2; i++) {
			output.offer(input[i]);
		}
		for (int i = n/2; i < n; i++) {
			output1.offer(input[i]);
		}
		
		for (int i = 0; i < n/2; i++) {
			output.offer(output.poll());
			output.offer(output1.poll());
		}
		
		if(!output1.isEmpty()){
			output.offer(output1.poll());
		}
		
		
		
		return output;
	}

}
