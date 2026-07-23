 class solution{
    public static boolean largestValue(int [] arr){
        int n =arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}


public class sorted_unsorted{
    public static void main(String[] args){
        int arr[]= {1,2,3,4,3};
        boolean n= solution.largestValue(arr);
        if(n==true){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is unsorted");
        }
    }
}