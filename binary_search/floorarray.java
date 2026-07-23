public class floorarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;

        int low = 0;
        int high = arr.length - 1;
        int floor = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                floor = arr[mid];
                break;
            }

            if (arr[mid] < target) {
                floor = arr[mid]; // possible floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Floor = " + floor);
    }
}