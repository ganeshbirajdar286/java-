public class Bubblesort {

    public static void main(String[] args) {

        int arr[] = {1, 3, 56, 6, 45, 65};

        int n = arr.length;

        print(arr, n);

        for (int i = 0; i < n - 1; i++) {
            int swap=0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }

        System.out.print("\nAfter sorting: ");
        print(arr, n);

    }
    public static void print(int arr[], int n) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
