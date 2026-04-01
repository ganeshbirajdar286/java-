package Array;

public class rotate_array {
    public static void main(String[] args){
        int k=2;
        int arr[] = {2,3,5,7,11,13,17,12};
        reverse(arr ,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int arr[],int n,int k ) {
        while (n<k){
            int temp=arr[k];
            arr[k]=arr[n];
            arr[n]=temp;
            n++;
            k--;
        }
    }
}
