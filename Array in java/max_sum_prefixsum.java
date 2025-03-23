//it is the optimised solution as compare then the brute force approach 

public class max_sum_prefixsum {

    public static void sumofsubarraysum(int nums[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];

        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("maximum sum :" + maxsum);

    }

    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        sumofsubarraysum(nums);

    }

}
