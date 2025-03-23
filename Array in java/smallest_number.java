
public class smallest_number {

    public static int smallnumber(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;

    }

    public static void main(String[] args) {
        int arr[] = {12, 24, 11, 23, 45, 34, 50};
        System.out.println("smallest number is:" + smallnumber(arr));

    }

}
