public  class floorarray {
    public static void main(String[] args){
        int arr[]={1,2,8,10,10,12,19};
        int target=5;
        int low=0;
        int high=arr.length-1;
        int mid=low;
        while (low<high){
            mid=(low+high)/2;
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