package Array;

import java.util.Scanner;

public class sum_in_array {
    public static void main(String[] args){
        int arr[]={1,2,3};
         try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the value");
        int x= sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
             if(arr[i] +arr[j] == x){
                 System.out.println(arr[i]+"+"+arr[j]);
             }
            }
        }
    }}
}
