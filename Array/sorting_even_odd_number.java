import  java.util.*;

public class sorting_even_odd_number {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
int n=arr.length-1;
                for(int i=0;i<arr.length;i++){
                    if(arr[i]%2==0){
                        int temp=arr[n];
                        arr[n]=arr[i];
                        arr[i]=temp;
                    }
                    n--;
                }

                for(int k:arr){
                    System.out.print(k+" ");
                }

    }
}