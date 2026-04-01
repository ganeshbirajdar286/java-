import java.util.*;

public  class non_decreasing_negative_square_array {
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,-6,9,1,4,5};
                for(int i=0;i<arr.length;i++){
                   arr[i]=arr[i]*arr[i];
                }

                for(int i=0;i<arr.length;i++){
                    for(int j=i+1;j<arr.length;j++){
                        if(arr[i]>arr[j]){
                            int temp=arr[i];
                            arr[i]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }

                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
    }
}