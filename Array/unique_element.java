import  java.util.*;

public class unique_element
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,5,6,4,2,1,3,5,6,7,7};

        // this is can apply only when there is no negative element in array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   arr[i]=-1;
                   arr[j]=-1;
                }
            }
        }

        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                ans=arr[i];
            }
        }
        System.out.print("unique value is " +  ans +" ");
    }
}