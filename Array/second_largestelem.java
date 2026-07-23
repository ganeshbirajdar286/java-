package Array;

public class second_largestelem {
    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        // Find largest and smallest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        // Find second largest and second smallest
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }

            if (arr[i] < smin && arr[i] != min) {
                smin = arr[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + smax);
        System.out.println("Smallest: " + min);
        System.out.println("Second Smallest: " + smin);
    }
}