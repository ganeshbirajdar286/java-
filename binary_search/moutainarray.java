public  class moutainarray {
    public static void main(String[] args){
        int arr[]={1, 2, 3, 4,6, 5, 3, 2};
        int low = 1;
        int high = arr.length - 2; // the mountain array  will be for  length 3, 1 and last will be never mid

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                System.out.println(mid);
                break;
            }
            else if (arr[mid] < arr[mid+1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
}