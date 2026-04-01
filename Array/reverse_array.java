package Array;

public class reverse_array {
    public static void main(String[] args ){
        int arr[] = {1, 2, 3};

        int start = 0;
        int end = arr.length - 1;

        // Swap elements from both ends
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
