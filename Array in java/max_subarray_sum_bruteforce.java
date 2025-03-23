
public class max_subarray_sum_bruteforce {

    public static void sumofsubarray(int nums[]) {
        int MAX_sum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                currsum = 0;
                for (int k = i; k < j; k++) {
                    currsum += nums[k];

                }
                System.out.println(currsum);
                if (MAX_sum < currsum) {
                    MAX_sum = currsum;
                }

            }

        }
        System.out.println(MAX_sum);

    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        sumofsubarray(nums);
    }

}
