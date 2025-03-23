
public class binary_search {

    public static int searching(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 10};
        int target = 3;
        int value = searching(nums, target);
        System.out.println(value);

    }

}
