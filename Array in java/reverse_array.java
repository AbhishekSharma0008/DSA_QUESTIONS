//reverse in same array 
public class reverse_array {

    public static void reverse(int nums[]) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6};
        reverse(nums);
        for (int arr:nums) {
            System.out.print(arr + " ");
        }
    }

}
