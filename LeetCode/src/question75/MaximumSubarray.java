package question75;

public class MaximumSubarray {

	public static void main(String[] args) {

		int result = maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
		System.out.println(result);
	}

	public static int maxSubArray(int[] nums) {

		int curr_sum = nums[0];
		int max_sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			curr_sum = Math.max(nums[i], nums[i] + curr_sum);
			max_sum = Math.max(max_sum, curr_sum);
		}

		return max_sum;

	}
}