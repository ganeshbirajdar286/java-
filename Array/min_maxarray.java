package Array;
public class min_maxarray {
        public static void main(String[] args) {
            int arr[] = {1, 23, 4, 5};

            int min = arr[0];
            int max = arr[0];


            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("enter the value of min:" + min);
            System.out.print("enter the value of max:" + max);

        }


}
