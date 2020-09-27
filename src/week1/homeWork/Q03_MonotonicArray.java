package week1.homeWork;
import org.junit.Test;

public class Q03_MonotonicArray {
	
	@Test
	public void test1(){//false
		int[] numbers ={1,1,2,5,3,4,4,4,4,5};
		System.out.println(isMonotonicArray_slidingWindow(numbers));
	}
	@Test
	public void test2(){//true
		int[] numbers ={1,1,2,3,4,5,5,5,6,10,10};
		System.out.println(isMonotonicArray_slidingWindow(numbers));
	}
	@Test
	public void test3(){//false
		int[] numbers ={-11,2,1,-5,3,4,4,4,4,5};
		System.out.println(isMonotonicArray_slidingWindow(numbers));
	}
	@Test
	public void test4(){//true
		int[] numbers ={-11,-10,-10,-3,0,1,1,3,3,3,5,5,-6};
		System.out.println(isMonotonicArray_slidingWindow(numbers));
	}
	@Test
	public void test5(){//true
		int[] numbers ={1,1,1,2,6};
		System.out.println(isMonotonicArray_slidingWindow(numbers));
	}
	
	
	private boolean isMonotonicArray_slidingWindow(int[] numbers) { // [1,1,2,5,3,4,4,4,4,5] ==>false i =9, legth=10
		boolean isMonotic = false;

		if (numbers.length == 0 || numbers.length == 1) 
			return false;

		

		for (int i = 1; i < numbers.length-1; i++) { 
			int decision = numbers[i - 1] - numbers[i]; 
			int decision1 = numbers[i] - numbers[i+1];
			if (decision == 0 && decision1!=0) {

				continue;
				
			} else if (decision < 0 ) {
				 
				if (decision1 > 0) 
					return false; 
				else
					isMonotic = true;

			} else {
				
				if (decision1 < 0) 
					return false;
				else
					isMonotic = true;
			}

		}

		return isMonotic;
	}

}
