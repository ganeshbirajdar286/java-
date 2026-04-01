import java.util.*;

public class prefix_sums {
    public  static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
            int j=i;
            if(j>0){
                j--;
                arr[i]=arr[i]+arr[j];
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}