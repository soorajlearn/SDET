package week15;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort_SinglePivot {

	@Test
	public void test1() {
		int[] nums = { 11, 8, 1, 3, 12, 9, 22, 0, 2 };
		System.out.println(Arrays.toString(quickSort(nums)));
	}

	@Test
	public void test2() {
		int[] nums = { 2, 2, 3, 1, 4 };
		System.out.println(Arrays.toString(quickSort(nums)));
	}

	@Test
	public void test3() {
		int[] nums = { -11, -8, -1, -3, -12, -9, -22, 0, -2 };
		System.out.println(Arrays.toString(quickSort(nums)));
	}

	public int[] quickSort(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		return nums;
	}

	public void quickSort(int[] nums, int left, int right) {

		if (left >= right)
			return;
		int mid = partition1(nums, left, right);

		quickSort(nums, left, mid);
		quickSort(nums, mid + 1, right);

	}

	public int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		while (left < right) {
			while (left < right && nums[left] < pivot) {
				left++;
			}
			while (left < right && nums[right] > pivot) {
				right--;
			}

			if (nums[left] >= pivot && nums[right] <= pivot && left < right) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
		}
		int temp = pivot;
		pivot = nums[right];
		nums[right] = temp;

		return right;
	}
	
	public static int partition1(int[] arr, int left, int right){
        int pivot = arr[left];
        while(left<right) {
            while(left<right && arr[right]>=pivot) {
                right--;
            }
            arr[left]=arr[right];
            while(left<right && arr[left]<=pivot) {
                left++;
            }
            arr[right]= arr[left];
        }
        
        arr[left]=pivot;
        return right;
    }

}
