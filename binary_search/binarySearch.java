public class binarySearch {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 6;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] < target) {
                low = mid + 1;      // ✅ go right
            }
            else if (arr[mid] > target) {
                high = mid - 1;    // ✅ go left
            }
            else {
                System.out.println("Target found at: " + mid);
                break;
            }
        }
    }
}
