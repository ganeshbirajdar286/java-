public class selectionsort {

    public static void main(String[] args) {
        int arr[] = {8, 4, 1, 9, -3, 6, 5};
        print(arr);
    }

    public static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }

        for (int l : arr) {
            System.out.print(l + " ");
        }
    }

    public static void swap(int arr[], int min, int j) {
        int temp = arr[j];
        arr[j] = arr[min];
        arr[min] = temp;
    }
}
