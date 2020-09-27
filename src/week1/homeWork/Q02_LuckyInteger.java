package week1.homeWork;
import org.junit.Test;

public class Q02_LuckyInteger {
	
	@Test
	public void test1(){
		int[] numbers = {1,2,3,6,3,4,4,4,5,5,5,6,6,6,6,6};
		int max = maxValue(numbers);
		int min = minValue(numbers);
		luckyInteger(numbers, max, min);
	}
	@Test
	public void test2(){
		int[] numbers = {1};
		int max = maxValue(numbers);
		int min = minValue(numbers);
		luckyInteger(numbers, max, min);
	}
	@Test
	public void test3(){
		int[] numbers = {2};
		int max = maxValue(numbers);
		int min = minValue(numbers);
		luckyInteger(numbers, max, min);
	}
	@Test
	public void test4(){
		int[] numbers = {1,2,2,6,3,4,4,4,5,5,5,6,6,6,6};
		int max = maxValue(numbers);
		int min = minValue(numbers);
		luckyInteger(numbers, max, min);
	}
	
	private int maxValue(int[] numbers){
		int max=numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			max=Math.max(max, numbers[i]);
		}
		//System.out.println(max);
		return max;
	}
	
	private int minValue(int[] numbers){
		int min=numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			min=Math.min(min, numbers[i]);
		}
		//System.out.println(min);
		return min;
		
	}

	private void luckyInteger(int[] numbers, int max, int min){
		
		for(int i=max; i>=min; i--){
			int count =0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[j]==i) {
					count++;
				}
			}
			if (count==i) {
				System.out.println(i +" is lucky number");
				break;
			}else if(i==min & count !=i){
				System.out.println(-1);
			}
		}
	}

}
