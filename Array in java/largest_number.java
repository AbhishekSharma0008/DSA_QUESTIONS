
public class largest_number {

    public static int largestelement(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }

        }
        return largest;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 10, 7};
        int number = largestelement(arr);
        System.out.println("number is :" + number);

    }

}
