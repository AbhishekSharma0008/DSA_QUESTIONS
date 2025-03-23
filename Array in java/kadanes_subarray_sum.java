// this is the optimistic approach becuase the timecomplexity is O(N)

public class kadanes_subarray_sum {

    public static int kadane(int nums[]) {
        int max = nums[0];
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (curr < 0) {
                curr = 0;
            }
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(curr, max);

        }
        return max;

    }

    public static void main(String[] args) {
        int nums[] = {-2};
        System.out.println(kadane(nums));

    }

}
