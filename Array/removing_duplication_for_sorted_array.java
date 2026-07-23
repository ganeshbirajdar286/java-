class solution {

    public static int array(int[] arr) {
        int n = arr.length;
        int i = 0;

        for (int j = i + 1; j < n; j++) {

            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }

        return i + 1;
    }
}

public class removing_duplication_for_sorted_array {

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,4,4,5};

        int uniqueCount = solution.array(arr);

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Unique elements: " + uniqueCount);
    }
}